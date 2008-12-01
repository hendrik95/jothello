/*
 * GameFrame.java
 *
 * Created on November 13, 2008, 2:26 PM
 */
package mmtothello;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import backprop.Backprop;

/**
 *
 * @author  mocksuwannatat
 */
public class GameFrame extends javax.swing.JFrame
{

	/** Creates new form GameFrame */
	public GameFrame()
	{
		initComponents();
		initLogic();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    lblNumBlack = new javax.swing.JLabel();
    lblNumWhite = new javax.swing.JLabel();
    jSpinner1 = new javax.swing.JSpinner();
    jLabel3 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    cmbBlackThinker = new javax.swing.JComboBox();
    cmbWhiteThinker = new javax.swing.JComboBox();
    pnlBoard = new javax.swing.JPanel();
    lblWhoseMove = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setText("number of BLACKS:");

    jLabel2.setText("number of WHITES:");

    lblNumBlack.setText("0");

    lblNumWhite.setText("0");

    jLabel3.setText("table size:");

    jButton1.setText("new game");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jLabel4.setText("BLACK's thinker:");

    jLabel5.setText("WHITE's thinker:");

    cmbBlackThinker.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    cmbWhiteThinker.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    org.jdesktop.layout.GroupLayout pnlBoardLayout = new org.jdesktop.layout.GroupLayout(pnlBoard);
    pnlBoard.setLayout(pnlBoardLayout);
    pnlBoardLayout.setHorizontalGroup(
      pnlBoardLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(0, 448, Short.MAX_VALUE)
    );
    pnlBoardLayout.setVerticalGroup(
      pnlBoardLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(0, 194, Short.MAX_VALUE)
    );

    lblWhoseMove.setText("It's WHITE's move...");

    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(layout.createSequentialGroup()
            .addContainerGap()
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
              .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                  .add(layout.createSequentialGroup()
                    .add(jLabel1)
                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                    .add(lblNumBlack))
                  .add(layout.createSequentialGroup()
                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                    .add(jLabel2)
                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                    .add(lblNumWhite)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 191, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                  .add(layout.createSequentialGroup()
                    .add(jLabel3)
                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                    .add(jSpinner1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                  .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 127, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
              .add(layout.createSequentialGroup()
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cmbBlackThinker, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 133, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
              .add(layout.createSequentialGroup()
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cmbWhiteThinker, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 133, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
          .add(pnlBoard, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(layout.createSequentialGroup()
            .addContainerGap()
            .add(lblWhoseMove)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .addContainerGap()
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(jLabel1)
          .add(lblNumBlack)
          .add(jSpinner1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(jLabel3))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(lblNumWhite)
          .add(jButton1)
          .add(jLabel2))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(jLabel4)
          .add(cmbBlackThinker, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(jLabel5)
          .add(cmbWhiteThinker, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .add(6, 6, 6)
        .add(lblWhoseMove)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
        .add(pnlBoard, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
	newGame();
}//GEN-LAST:event_jButton1ActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[])
	{
		java.awt.EventQueue.invokeLater(new Runnable()
		{

			public void run()
			{
				new GameFrame().setVisible(true);
			}
		});
	}
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox cmbBlackThinker;
  private javax.swing.JComboBox cmbWhiteThinker;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JSpinner jSpinner1;
  private javax.swing.JLabel lblNumBlack;
  private javax.swing.JLabel lblNumWhite;
  private javax.swing.JLabel lblWhoseMove;
  private javax.swing.JPanel pnlBoard;
  // End of variables declaration//GEN-END:variables

	private void initLogic()
	{
		this.setResizable(false);
		size = C.DEFAULT_DIMENSION;
		createThinkers();
		board = new OBoard(size);
		createPieces();
		redrawBoard();
	}

	private void createThinkers()
	{
		int numThinkers = 7;
		thinkers = new Thinker[numThinkers + 1];
		int k = 0;
		thinkers[k++] = new GreedyThinker();
		thinkers[k++] = new RandomThinker();
		thinkers[k++] = new AnotherThinker();
		thinkers[k++] = new SimpleAlphaBetaThinker();
		thinkers[k++] = new NeuralThinker(this.getBasicBackProp("championship.saved"), "Champion Neural");
		thinkers[k++] = new NeuralThinker(this.getBasicBackProp("genericgameserver.saved"), "Generic Neural");
		thinkers[k++] = new TestNeuralThinker(this.getBasicBackProp("testneural.saved"), "Test Neural");
		thinkers[k++] = null;
		cmbWhiteThinker.removeAllItems();
		cmbBlackThinker.removeAllItems();
		for (int i = 0; i < numThinkers; i++)
		{
			String name = thinkers[i].getName();
			cmbWhiteThinker.addItem(name);
			cmbBlackThinker.addItem(name);
		}
		String name = "Human";
		cmbWhiteThinker.addItem(name);
		cmbBlackThinker.addItem(name);
		cmbWhiteThinker.setSelectedIndex(numThinkers);
		cmbBlackThinker.setSelectedIndex(numThinkers);
	}
	
	private Backprop getBasicBackProp(String filename) {
		Backprop def = null;
		FileInputStream fis = null;
		ObjectInputStream in = null;
		try {
			fis = new FileInputStream(filename);
			in = new ObjectInputStream(fis);
			def = (Backprop) in.readObject();
			in.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		return def;
	}

	private void createPieces()
	{
		pnlBoard.setLayout(new GridLayout(size, size));
		cells = new Cell[size][size];
		for (int r = 0; r < size; r++)
		{
			for (int c = 0; c < size; c++)
			{
				char who = board.get(r, c);
				Cell button = new Cell("" + who);
				//button.add
				//TODO add event handler to button
				final int rr = r;
				final int cc = c;
				button.addMouseListener(new MouseAdapter()
				{

					public void mouseReleased(MouseEvent evt)
					{
						userClickedAtCell(rr, cc);
					}
				});

				cells[r][c] = button;
				pnlBoard.add(button);
			}
		}
		pack();
	}

	private void redrawBoard()
	{
		for (int r = 0; r < size; r++)
		{
			for (int c = 0; c < size; c++)
			{
				Cell cell = cells[r][c];
				char who = board.get(r, c);
				boolean valid = board.canSet(r, c, getPlayer());
				String t = valid
						? "" + board.calculateImmediateFlips(r, c, getPlayer())
						: null;
				cell.youAre(who,
						valid,
						board.justFlipped(r, c),
						t);
			}
		}
		lblNumBlack.setText("" + board.count(C.BLACK));
		lblNumWhite.setText("" + board.count(C.WHITE));

		String text = String.format("It's %s's turn...",
				whiteTurn ? "WHITE" : "BLACK");
		if (!humanThinking)
		{
			text += "     COMPUTER IS THINKING...";

		}
		if (gameOver)
		{
			text = "GAME OVER";
		}
		;
		lblWhoseMove.setText(text);
//    repaint();
	}

	private void userClickedAtCell(int r, int c)
	{
		if (gameOver)
		{
			return;

		}
		if (!humanThinking)
		{
			System.out.println("Grrr! Computer is thinking. Please wait.");
			return;
		}

		char old = board.get(r, c);
		char p = getPlayer();
		if (!board.canSet(r, c, p))
		{
			System.out.println("Grrr! can't put it there.");
			return;
		}
		board.set(r, c, p);
		board.flipAll(r, c);
		switchPlayer();
		checkGameOver();
		playIfItsYourTurn();
		redrawBoard();
	}

	private void checkGameOver()
	{
		if (board.countValidMoves(getPlayer()) <= 0)
		{
			gameOver = true;
		}
	}

	private void switchPlayer()
	{
		whiteTurn = !whiteTurn;
	}

	private char getPlayer()
	{
		return whiteTurn ? C.WHITE : C.BLACK;
	}

	private void newGame()
	{
		// user clicked on New Game button

		// prepare thinkers (each could be null, which means human)
		whiteThinker = thinkers[cmbWhiteThinker.getSelectedIndex()];
		blackThinker = thinkers[cmbBlackThinker.getSelectedIndex()];

		// init board & turn
		board.clear();
		whiteTurn = false;
		gameOver = false;
		playIfItsYourTurn();
		redrawBoard();
	}

	private Thinker currentThinker()
	{
		return whiteTurn ? whiteThinker : blackThinker;
	}

	private void playIfItsYourTurn()
	{
		if (gameOver)
		{
			return;

		}
		if (currentThinker() == null)
		{
			humanThinking = true;
			return;
		}

		humanThinking = false;
		Thread thread = new Thread()
		{

			final OBoard fboard = board;

			public void run()
			{
				Thinker joe = currentThinker();
				char p = getPlayer();
				// this can delay
				RowCol move = joe.nextMove(p, board);
				int r = move.row;
				int c = move.col;
				fboard.set(r, c, p);
				fboard.flipAll(r, c);
				switchPlayer();
				checkGameOver();
				playIfItsYourTurn();
				redrawBoard();
			}
		};
		thread.start();
	}
	private int size;
	private OBoard board = null;
	private Cell[][] cells;
	private boolean whiteTurn = false;
	private Thinker[] thinkers;
	private boolean humanThinking = true;
	private Thinker whiteThinker,  blackThinker;
	private boolean gameOver = false;
}
