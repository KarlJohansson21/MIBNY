package mib1;


import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KarlJ
 */
public class AgentInloggad extends javax.swing.JFrame {
    private static InfDB idb;
    
    /**
     * Creates new form AgentInloggad
     * @param idb
     */
    public AgentInloggad(InfDB idb) {
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

        logoutBTN = new javax.swing.JButton();
        bytlösen = new javax.swing.JButton();
        utrustningBTN = new javax.swing.JButton();
        områdeschefBTN = new javax.swing.JButton();
        registerAlienBTN = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lånaFordonBTN = new javax.swing.JButton();
        lånaUtrustning = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logoutBTN.setText("Logga ut");
        logoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTNActionPerformed(evt);
            }
        });

        bytlösen.setText("Ändra lösenord");
        bytlösen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bytlösenActionPerformed(evt);
            }
        });

        utrustningBTN.setText("Lägg in ny utrustning");
        utrustningBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utrustningBTNActionPerformed(evt);
            }
        });

        områdeschefBTN.setText("Områdeschef");
        områdeschefBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                områdeschefBTNActionPerformed(evt);
            }
        });

        registerAlienBTN.setText("Registrera Alien");
        registerAlienBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerAlienBTNActionPerformed(evt);
            }
        });

        jButton1.setText("Ändra info Alien");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lånaFordonBTN.setText("Låna Fordon");
        lånaFordonBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lånaFordonBTNActionPerformed(evt);
            }
        });

        lånaUtrustning.setText("Låna Utrustning");
        lånaUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lånaUtrustningActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bytlösen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(utrustningBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(områdeschefBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registerAlienBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lånaFordonBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lånaUtrustning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(registerAlienBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(utrustningBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lånaUtrustning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lånaFordonBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bytlösen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(områdeschefBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutBTN)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTNActionPerformed
        // TODO add your handling code here:
        huvudFonster tbx = new huvudFonster(idb);
        tbx.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBTNActionPerformed

    private void bytlösenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bytlösenActionPerformed
        // TODO add your handling code here:
        BytLösenord nyttlösen = new BytLösenord(idb);
        nyttlösen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bytlösenActionPerformed

    private void utrustningBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utrustningBTNActionPerformed
        // TODO add your handling code here:
        agentUtrustning nyUtrustning = new agentUtrustning(idb);
        nyUtrustning.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_utrustningBTNActionPerformed

    private void områdeschefBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_områdeschefBTNActionPerformed
        // TODO add your handling code here:
        Områdeschef chef = new Områdeschef(idb);
        chef.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_områdeschefBTNActionPerformed

    private void registerAlienBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerAlienBTNActionPerformed
        // TODO add your handling code here:
        agentAlien nyAlien = new agentAlien(idb);
        nyAlien.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerAlienBTNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AgentUppdateraAlienA  uppdatera = new AgentUppdateraAlienA(idb); 
        uppdatera.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lånaFordonBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lånaFordonBTNActionPerformed
        // TODO add your handling code here:
        lånaFordon låna = new lånaFordon(idb);
        låna.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lånaFordonBTNActionPerformed

    private void lånaUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lånaUtrustningActionPerformed
        // TODO add your handling code here:
        lånaUtrustning låna = new lånaUtrustning(idb);
        låna.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lånaUtrustningActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bytlösen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JButton lånaFordonBTN;
    private javax.swing.JButton lånaUtrustning;
    private javax.swing.JButton områdeschefBTN;
    private javax.swing.JButton registerAlienBTN;
    private javax.swing.JButton utrustningBTN;
    // End of variables declaration//GEN-END:variables
}
