/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib1;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.Popup;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author KarlJ
 */
public class AlienInloggad extends javax.swing.JFrame {
    private static InfDB idb;
       /**
    /**
     * Creates new form AlienInloggad
     */
    public AlienInloggad(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        logoutBTNalien = new javax.swing.JButton();
        btnbytl�senAlien = new javax.swing.JButton();
        omr�deschefBTN = new javax.swing.JButton();
        agentIDLBL = new javax.swing.JLabel();
        agentNamnLBL = new javax.swing.JLabel();
        agentTfnLBL = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Hej du �r nu inloggad som alien");

        logoutBTNalien.setText("Logga ut");
        logoutBTNalien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTNalienActionPerformed(evt);
            }
        });

        btnbytl�senAlien.setText("Byt l�senord");
        btnbytl�senAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbytl�senAlienActionPerformed(evt);
            }
        });

        omr�deschefBTN.setText("Min omr�deschef");
        omr�deschefBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omr�deschefBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(agentTfnLBL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(agentNamnLBL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(agentIDLBL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(omr�deschefBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnbytl�senAlien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logoutBTNalien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addComponent(btnbytl�senAlien)
                .addGap(13, 13, 13)
                .addComponent(omr�deschefBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agentIDLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agentNamnLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agentTfnLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(logoutBTNalien)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBTNalienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTNalienActionPerformed
        // TODO add your handling code here:
        huvudFonster tbx = new huvudFonster(idb);
        tbx.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBTNalienActionPerformed

    private void btnbytl�senAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbytl�senAlienActionPerformed
        // TODO add your handling code here:
        BytL�senOrdAlien nyttl�sen = new BytL�senOrdAlien(idb);
        nyttl�sen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbytl�senAlienActionPerformed

    private void omr�deschefBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omr�deschefBTNActionPerformed
        // TODO add your handling code here:
        /*Omr�deschef minchef = new Omr�deschef(idb);
        minchef.setVisible(true);
        this.dispose();
        */
        String user = huvudFonster.hamtaAnvandare();
        try{
            //H�mtar agentens namn och telefonnummer s� att alien kan kontakta omr�deschefen f�r det omr�det som den vistas i.
            //String agentID = idb.fetchSingle("Select omradeschef.agent_ID from omradeschef join plats on  omradeschef.OMRADE = plats.FINNS_I join alien on alien.PLATS = plats.PLATS_ID where alien.namn = " + "'"  + user + "'");
            String agentnamn = idb.fetchSingle("Select agent.NAMN from agent join alien on  agent.agent_id = alien.ansvarig_agent  where alien.namn = " + "'" + user + "'");
            String agentTfn = idb.fetchSingle("Select agent.telefon from agent join alien on agent.agent_id = alien.ansvarig_agent where alien.namn = " + "'" + user + "'");
            //agentIDLBL.setText("Agentens ID " + agentID);
            agentNamnLBL.setText("Din omr�deschef �r " + agentnamn);
            agentTfnLBL.setText("Agentens telnr " + agentTfn);
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "N�got gick fel �terv�nd till f�reg�ende f�nster och f�rs�k igen");
            System.out.println(e.getMessage());
        
        }
      
       
    }//GEN-LAST:event_omr�deschefBTNActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agentIDLBL;
    private javax.swing.JLabel agentNamnLBL;
    private javax.swing.JLabel agentTfnLBL;
    private javax.swing.JButton btnbytl�senAlien;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutBTNalien;
    private javax.swing.JButton omr�deschefBTN;
    // End of variables declaration//GEN-END:variables
}
