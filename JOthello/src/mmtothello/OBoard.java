/*
 * OBoard.java
 *
 * Created on November 13, 2008, 12:17 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package mmtothello;

import java.util.*;

/**
 * Represents an Othello board. 
 *
 * @author mocksuwannatat
 */
public class OBoard
{
	public OBoard(int dimension)
	{
		dim = dimension;
		b = new char[dim][dim];
		history_of_moves = new char[dim][dim];
		clear();
	}

	public OBoard()
	{
		this(C.DEFAULT_DIMENSION);
	}

	public OBoard(OBoard board, MoveInfo move)
	{
		dim = board.size();
		b = new char[dim][dim];
		history_of_moves = new char[dim][dim];
		char[][] oldB = board.getB();
		char[][] oldH = board.getMoves();
		for (int y = 0; y < dim; y++)
		{
			for (int x = 0; x < dim; x++)
			{
				b[y][x] = oldB[y][x];
        history_of_moves[y][x] = oldH[y][x];
			}
		}
		int x = move.getX();
		int y = move.getY();
		char color = move.getColor();

		this.set(y, x, color);
		this.flipAll(y, x);
		this.newestMove = move;
	}

	//clone the board
	public OBoard(OBoard board)
	{
		dim = board.size();
		b = new char[dim][dim];
		history_of_moves = new char[dim][dim];
		char[][] oldB = board.getB();
		for (int y = 0; y < dim; y++)
		{
			for (int x = 0; x < dim; x++)
			{
				b[y][x] = oldB[y][x];
				history_of_moves[y][x] = board.history_of_moves[y][x];
			}
		}
	}

	public MoveInfo getNewestMove()
	{
		return newestMove;
	}

	public boolean isGameOver(char color)
	{
		if (this.countValidMoves(color) <= 0)
		{
			return true;
		}
		return false;
	}

	public char[][] getB()
	{
		return b;
	}

	public int size()
	{
		return dim;
	}

	public int count(char who)
	{
		switch (who)
		{
			case C.WHITE:
				return numWhites;
			case C.BLACK:
				return numBlacks;
			case C.EMPTY:
				return dim * dim - (numWhites + numBlacks);
		}
		return 0;
	}

	private void updateCount(char who, int howMuch)
	{
		if (who == C.BLACK)
		{
			numBlacks += howMuch;
		}
		else if (who == C.WHITE)
		{
			numWhites += howMuch;
		}
	}

	public char get(int r, int c)
	{
		return b[r][c];
	}

	public void set(int r, int c, char who)
	{
		updateCount(b[r][c], -1);
		updateCount(who, 1);
		b[r][c] = who;
	}

	public void incMoveNumber()
	{
		moveNumber++;
	}

	public int getMoveNumber()
	{
		return moveNumber;
	}

	public boolean canSet(int r, int c, char who)
	{
		if (get(r, c) != C.EMPTY)
		{
			return false;
		}
		/*
		there needs to be a direction which 'who' can score.
		i is direction
		 */
		for (int i = 0; i < 8; i++)
		{
			String line = getLine(r, c, i);
			int numWins = howManyWillFlip(who, line);
			if (numWins > 0)
			{
				return true;
			}
		}
		return false;
	}

	public int countValidMoves(char who)
	{
		int ans = 0;
		for (int r = 0; r < dim; r++)
		{
			for (int c = 0; c < dim; c++)
			{
				if (canSet(r, c, who))
				{
					ans++;
				}
			}
		}
		return ans;
	}

	public boolean canPlayerMove(char who)
	{
		for (int r = 0; r < dim; r++)
		{
			for (int c = 0; c < dim; c++)
			{
				if (canSet(r, c, who))
				{
					return true;
				}
			}
		}
		return false;
	}

	public int calculateImmediateFlips(int r, int c, char who)
	{
		if (get(r, c) != C.EMPTY)
		{
			return 0;
		}
		int ans = 0;
		for (int dir = 0; dir < 8; dir++)
		{
			String line = getLine(r, c, dir);
			ans += howManyWillFlip(who, line);
		}
		return ans;
	}

	public Queue<MoveInfo> getValidMoves(char color)
	{
		Queue<MoveInfo> validMoves = new PriorityQueue<MoveInfo>(11, moveInfoComparator);
		int immediateFlips = 0;
		for (int y = 0; y < dim; y++)
		{
			for (int x = 0; x < dim; x++)
			{
				immediateFlips = calculateImmediateFlips(y, x, color);
				if (immediateFlips > 0)
				{
					validMoves.add(new MoveInfo(color, x, y, immediateFlips));
				}
			}
		}
		return validMoves;
	}

	private static class MoveInfoComparator implements Comparator<MoveInfo>
	{
		public int compare(MoveInfo o1, MoveInfo o2)
		{
			//get reverse ordering
			double score = o2.getScore() - o1.getScore();
			if (score > 0)
			{
				return 1;
			}
			else if (score < 0)
			{
				return -1;
			}
			return 0;
		}
	}

	/** Flip all required pieces once a new piece has been put at (row, col)
	 */
	public void flipAll(int row, int col)
	{
		clearJustFlipped();
		char who = get(row, col);
    history_of_moves[row][col] = who;
		for (int dir = 0; dir < 8; dir++)
		{
			String line = getLine(row, col, dir);
			int numFlips = howManyWillFlip(who, line);
			int ir = row;
			int ic = col;
			for (int i = 0; i < numFlips; i++)
			{
				ir += C.DIRECTIONS[dir][0];
				ic += C.DIRECTIONS[dir][1];
				//System.out.printf("flipping %d, %d\n",ir, );
				set(ir, ic, who);
				justFlipped[ir][ic] = true;
			}
		}
	}

	public boolean inRange(int i)
	{
		return (i >= 0) && (i < dim);
	}

	public boolean inRange(int r, int c)
	{
		return inRange(r) && inRange(c);
	}

	private int howManyWillFlip(char who, String line)
	{
		char other = opponentOf(who);
		for (int i = 1; i < line.length(); i++)
		{
			char c = line.charAt(i);
			if (c == C.EMPTY)
			{
				return 0;
			}
			if (c == who)
			{
				return i - 1;
			}
		}
		return 0;
	}

	/**
	 * Returns the string containing the table entries starting from the point
	 * (row, col) in the direction of whichLine to the edge of the table
	 *
	 * @param whichLine
	 *   direction number, between 0 and 7, 0 is the UP direction,
	 *   1 is Upper-Right, and so on
	 */
	public String getLine(int row, int col, int whichLine)
	{
		int r, c;
		r = row;
		c = col;
		int dR = C.DIRECTIONS[whichLine][0];
		int dC = C.DIRECTIONS[whichLine][1];
		String s = "";
		while (inRange(r, c))
		{
			s += get(r, c);
			r += dR;
			c += dC;
		}
		return s;
	}

	/**
	 * Returns 8 strings representing the 8 directions from point (row, col)
	 */
	public String[] getLines(int row, int col)
	{
		String[] result = new String[8];
		for (int dir = 0; dir < 8; dir++)
		{
			result[dir] = getLine(row, col, dir);
		}
		return result;
	}

	public char opponentOf(char who)
	{
		return who == C.WHITE ? C.BLACK : C.WHITE;
	}

	public void clear()
	{
		// clear all
		for (int i = 0; i < dim; i++)
		{
			for (int j = 0; j < dim; j++)
			{
				b[i][j] = history_of_moves[i][j] = C.EMPTY;
			}
		}
		clearJustFlipped();

		// initial four pieces
		int mid = dim / 2;
		b[mid][mid] = b[mid - 1][mid - 1] = C.WHITE;
		b[mid][mid - 1] = b[mid - 1][mid] = C.BLACK;

		// initial count
		numBlacks = numWhites = 2;
	}

	public boolean justFlipped(int r, int c)
	{
		return justFlipped[r][c];
	}

	private void clearJustFlipped()
	{
		if (justFlipped == null)
		{
			justFlipped = new boolean[dim][dim];
		}
		for (int i = 0; i < dim; i++)
		{
			for (int j = 0; j < dim; j++)
			{
				justFlipped[i][j] = false;
			}
		}
	}

	//todo: optimize this by using a precomputed value:
	//todo: like the method "count", except that doesn't work right now!
	public Score calculateScore(boolean gameOver)
	{
		int countBlack = 0;
		int countWhite = 0;
		for (int y = 0; y < dim; y++)
		{
			for (int x = 0; x < dim; x++)
			{
				if (b[y][x] == C.BLACK)
				{
					countBlack++;
				}
				else if(b[y][x] == C.WHITE)
				{
					countWhite++;
				}
			}
		}
		return new Score(countBlack, countWhite, gameOver);
	}

  public char[][] getMoves() {
    return history_of_moves;
  }
  
	private int moveNumber = 0;

	/** the board */
	private char[][] b;
	private char[][] history_of_moves;
	/** dimension */
	private int dim;
	private int numBlacks,  numWhites;
	/** true if we just flipped it */
	private boolean[][] justFlipped = null;
	private static final MoveInfoComparator moveInfoComparator = new MoveInfoComparator();
	private MoveInfo newestMove;
}
