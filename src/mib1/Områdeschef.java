/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib1;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author KarlJ
 */
public class Omr�deschef extends javax.swing.JFrame {
    private static InfDB idb;
    
    /**
     * Creates new form Omr�deschef
     */
    public Omr�deschef(InfDB idb) {
        initComponents();
        this.idb = idb;
        omr�deschefLBL.setVisible(true);
        
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        comboChef = new javax.swing.JComboBox<>();
        omr�deschefLBL = new javax.swing.JLabel();
        tbxBTN = new javax.swing.JButton();
        v�ljomr�deLBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(50, 50));

        comboChef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Svealand", "G�taland", "Norrland" }));
        comboChef.setSelectedIndex(-1);
        comboChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboChefActionPerformed(evt);
            }
        });

        tbxBTN.setText("Tillbaka");
        tbxBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxBTNActionPerformed(evt);
            }
        });

        v�ljomr�deLBL.setText("V�lj omr�de nedan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbxBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboChef, 0, 110, Short.MAX_VALUE)
                    .addComponent(omr�deschefLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(v�ljomr�deLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(omr�deschefLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(v�ljomr�deLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(tbxBTN)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboChefActionPerformed
        // TODO add your handling code here:
        String val = comboChef.getSelectedItem().toString();
        if (valideringsklass.tomCombo(comboChef)) {
            try {
                //H�mtar AgentId fr�n omr�deschef tabellen sen g�r vi en join med omr�destabellen d�r omr�desID matchar med omr�det i omr�deschef tabellen d�r kravet ben�mning ska vara Svealand
                String idchefSvea = idb.fetchSingle("SELECT Agent_ID from omradeschef join omrade on omrade.OMRADES_ID = omradeschef.OMRADE where omrade.BENAMNING = 'Svealand'");
                //Skriver ut namnet p� agenten som �r chef f�r valt omr�de med hj�lp av sqlfr�gan innan
                String chefSvea = idb.fetchSingle("Select namn from agent where Agent_ID = " + idchefSvea);
                String idChefGota = idb.fetchSingle("SELECT Agent_ID from omradeschef join omrade on omrade.OMRADES_ID = omradeschef.OMRADE where omrade.BENAMNING = 'G�taland'");
                String chefGota = idb.fetchSingle("Select namn from agent where Agent_ID = " + idChefGota);
                String idChefNorr = idb.fetchSingle("SELECT Agent_ID from omradeschef join omrade on omrade.OMRADES_ID = omradeschef.OMRADE where omrade.BENAMNING = 'Norrland'");
                String chefNorr = idb.fetchSingle("Select namn from agent where Agent_ID = " + idChefNorr);

                if (val.equals("Svealand")) {
                    omr�deschefLBL.setVisible(true);
                    omr�deschefLBL.setText("'" + chefSvea + "'" + " �r omr�deschef f�r Svealand");
                } else if (val.equals("G�taland")) {
                    omr�deschefLBL.setVisible(true);
                    omr�deschefLBL.setText("'" + chefGota + "'" + " �r omr�deschef f�r G�taland");
                } else {
                    omr�deschefLBL.setVisible(true);
                    omr�deschefLBL.setText("'" + chefNorr + "'" + " �r omr�deschef f�r Norrland");
                }
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "N�got gick fel, f�rs�k igen!");
            }
        }
    }//GEN-LAST:event_comboChefActionPerformed

    private void tbxBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxBTNActionPerformed
        // TODO add your handling code here:
        AgentInloggad1 tbx = new AgentInloggad1(idb);
        tbx.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tbxBTNActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboChef;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel omr�deschefLBL;
    private javax.swing.JButton tbxBTN;
    private javax.swing.JLabel v�ljomr�deLBL;
    // End of variables declaration//GEN-END:variables
}
