/*
 * ParametersPanel.java
 *
 * Created on December 7, 2008, 11:27 AM
 */

package spikies;

import java.util.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author  mocksuwannatat
 */
public class ParametersPanel extends javax.swing.JPanel {

    /** Creates new form ParametersPanel */
    public ParametersPanel() {
        initComponents();
        init();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    pnlNorth = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    pnlCenter = new javax.swing.JPanel();
    pnlSample1 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    jTextField1 = new javax.swing.JTextField();
    jPanel2 = new javax.swing.JPanel();
    pnlS2 = new javax.swing.JPanel();
    pnlS4 = new javax.swing.JPanel();
    btnLoadFrom2 = new javax.swing.JButton();
    pnlS3 = new javax.swing.JPanel();
    btnSaveTo1 = new javax.swing.JButton();
    btnLoadFrom1 = new javax.swing.JButton();
    pnlS5 = new javax.swing.JPanel();
    btnSaveDefault2 = new javax.swing.JButton();
    btnSaveTo2 = new javax.swing.JButton();

    setLayout(new java.awt.BorderLayout());

    jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
    jLabel1.setText("Parameters");
    jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
    pnlNorth.add(jLabel1);

    add(pnlNorth, java.awt.BorderLayout.NORTH);

    jPanel1.setLayout(new java.awt.BorderLayout());

    pnlCenter.setLayout(new javax.swing.BoxLayout(pnlCenter, javax.swing.BoxLayout.Y_AXIS));

    pnlSample1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

    jLabel2.setText("sample param = ");
    pnlSample1.add(jLabel2);

    jTextField1.setColumns(4);
    jTextField1.setText("100");
    pnlSample1.add(jTextField1);

    pnlCenter.add(pnlSample1);

    jPanel1.add(pnlCenter, java.awt.BorderLayout.NORTH);

    org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(0, 298, Short.MAX_VALUE)
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(0, 149, Short.MAX_VALUE)
    );

    jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

    add(jPanel1, java.awt.BorderLayout.CENTER);

    pnlS2.setLayout(new javax.swing.BoxLayout(pnlS2, javax.swing.BoxLayout.Y_AXIS));

    pnlS4.setLayout(new java.awt.BorderLayout());

    btnLoadFrom2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
    btnLoadFrom2.setMnemonic('a');
    btnLoadFrom2.setText("Apply");
    btnLoadFrom2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLoadFrom2ActionPerformed(evt);
      }
    });
    pnlS4.add(btnLoadFrom2, java.awt.BorderLayout.CENTER);

    pnlS2.add(pnlS4);

    pnlS3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

    btnSaveTo1.setText("Save to ...");
    btnSaveTo1.setEnabled(false);
    btnSaveTo1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSaveTo1ActionPerformed(evt);
      }
    });
    pnlS3.add(btnSaveTo1);

    btnLoadFrom1.setText("Load from ...");
    btnLoadFrom1.setEnabled(false);
    pnlS3.add(btnLoadFrom1);

    pnlS2.add(pnlS3);

    pnlS5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

    btnSaveDefault2.setMnemonic('d');
    btnSaveDefault2.setText("Save as Default");
    btnSaveDefault2.setEnabled(false);
    btnSaveDefault2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSaveDefault2ActionPerformed(evt);
      }
    });
    pnlS5.add(btnSaveDefault2);

    btnSaveTo2.setMnemonic('r');
    btnSaveTo2.setText("Reset");
    btnSaveTo2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSaveTo2ActionPerformed(evt);
      }
    });
    pnlS5.add(btnSaveTo2);

    pnlS2.add(pnlS5);

    add(pnlS2, java.awt.BorderLayout.SOUTH);
  }// </editor-fold>//GEN-END:initComponents

private void btnSaveTo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveTo1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_btnSaveTo1ActionPerformed

private void btnLoadFrom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadFrom2ActionPerformed
  onClickApply();
}//GEN-LAST:event_btnLoadFrom2ActionPerformed

private void btnSaveDefault2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDefault2ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_btnSaveDefault2ActionPerformed

private void btnSaveTo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveTo2ActionPerformed
  onClickReset();
}//GEN-LAST:event_btnSaveTo2ActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnLoadFrom1;
  private javax.swing.JButton btnLoadFrom2;
  private javax.swing.JButton btnSaveDefault2;
  private javax.swing.JButton btnSaveTo1;
  private javax.swing.JButton btnSaveTo2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JTextField jTextField1;
  private javax.swing.JPanel pnlCenter;
  private javax.swing.JPanel pnlNorth;
  private javax.swing.JPanel pnlS2;
  private javax.swing.JPanel pnlS3;
  private javax.swing.JPanel pnlS4;
  private javax.swing.JPanel pnlS5;
  private javax.swing.JPanel pnlSample1;
  // End of variables declaration//GEN-END:variables

  
  private void init() {
    listener = null;
    hash = new Hashtable<String, ParamRecord>();
  }
  
  public void setListener(ParametersPanelListener listener) {
    this.listener = listener;
  }

  public float getFloat(String name, float defVal) {
    ParamRecord pr = hash.get(name);
    if (pr == null) {
      // make a new one
      pr = new ParamRecord();
      pr.name = name;
      pr.value = defVal;
      pr.defaultValue = defVal;
      pr.textField = new JTextField();
      hash.put(name, pr);
      
      // add components to panel
      JLabel lbl = new JLabel();
      lbl.setText(name + " = ");
      JPanel pnl = new JPanel();
      pnl.setLayout(new FlowLayout(FlowLayout.LEFT /*, 0, 0 */));
      String text = "" + defVal;
      pr.textField.setText(text);
      pr.textField.setColumns(text.length());
      pnl.add(lbl);
      pnl.add(pr.textField);
      pnlCenter.add(pnl);
      pnlCenter.remove(pnlSample1);
    }
    return pr.value;
  }
  
  private void onClickApply() {
    for (ParamRecord pr : hash.values()) { 
      String text = pr.textField.getText();
      pr.value = isFloat(text) ? new Float(text) : pr.defaultValue;
      String newText = ""+pr.value;
      pr.textField.setText(newText);
      pr.textField.setColumns(newText.length());
    }
    if (listener != null) listener.valuesApplied();
  }
  
  private void onClickReset() { 
    for (ParamRecord pr : hash.values()) { 
      pr.textField.setText(""+pr.defaultValue);
    }
    onClickApply();
  }
  
  private boolean isFloat(String s) {
    try {
      Float.parseFloat(s);
    } catch (NumberFormatException e) {
      return false;
    }
    return true;
  }
  
  private ParametersPanelListener listener; 
  private Hashtable<String, ParamRecord> hash; 
  
  class ParamRecord { 
    String name;
    float value;
    float defaultValue;
    JTextField textField;
  }
}
