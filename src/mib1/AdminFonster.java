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
public class AdminFonster extends javax.swing.JFrame {
    private static InfDB idb;
    /**
     * Creates new form AdminFonster
     */
    public AdminFonster(InfDB idb) {
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

        registreraAgentBTN = new javax.swing.JButton();
        registreraAlienBTN = new javax.swing.JButton();
        removeAgentBTN = new javax.swing.JButton();
        removeAlienBTN = new javax.swing.JButton();
        removeUtrustningBTN = new javax.swing.JButton();
        changeOmrådesChefBTN = new javax.swing.JButton();
        registerUtrustning = new javax.swing.JButton();
        changeKontorsChefBTN = new javax.swing.JButton();
        görAdminBTN = new javax.swing.JButton();
        removeAdminBTN = new javax.swing.JButton();
        redigeraAgent = new javax.swing.JButton();
        redigeraAlien = new javax.swing.JButton();
        logoutBTN = new javax.swing.JButton();
        changeLösenBTN = new javax.swing.JButton();
        removeFordonBTN = new javax.swing.JButton();
        registerFordonBTN = new javax.swing.JButton();
        lånaUtrustningBTN = new javax.swing.JButton();
        lånaFordonBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registreraAgentBTN.setText("Registrera Agent");
        registreraAgentBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registreraAgentBTNActionPerformed(evt);
            }
        });

        registreraAlienBTN.setText("Registrera Alien");
        registreraAlienBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registreraAlienBTNActionPerformed(evt);
            }
        });

        removeAgentBTN.setText("Ta bort Agent");
        removeAgentBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAgentBTNActionPerformed(evt);
            }
        });

        removeAlienBTN.setText("Ta bort Alien");
        removeAlienBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAlienBTNActionPerformed(evt);
            }
        });

        removeUtrustningBTN.setText("Ta bort Utrustning");
        removeUtrustningBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUtrustningBTNActionPerformed(evt);
            }
        });

        changeOmrådesChefBTN.setText("Ändra områdeschef");
        changeOmrådesChefBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeOmrådesChefBTNActionPerformed(evt);
            }
        });

        registerUtrustning.setText("Registrera Utrustning");
        registerUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerUtrustningActionPerformed(evt);
            }
        });

        changeKontorsChefBTN.setText("Ändra kontorschef");
        changeKontorsChefBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeKontorsChefBTNActionPerformed(evt);
            }
        });

        görAdminBTN.setText("Gör agent admin");
        görAdminBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                görAdminBTNActionPerformed(evt);
            }
        });

        removeAdminBTN.setText("Ta bort admin");
        removeAdminBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAdminBTNActionPerformed(evt);
            }
        });

        redigeraAgent.setText("Redigera Agent");
        redigeraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redigeraAgentActionPerformed(evt);
            }
        });

        redigeraAlien.setText("Redigera Alien");
        redigeraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redigeraAlienActionPerformed(evt);
            }
        });

        logoutBTN.setText("Logga ut");
        logoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTNActionPerformed(evt);
            }
        });

        changeLösenBTN.setText("Ändra lösenord");
        changeLösenBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeLösenBTNActionPerformed(evt);
            }
        });

        removeFordonBTN.setText("Ta bort Fordon");
        removeFordonBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFordonBTNActionPerformed(evt);
            }
        });

        registerFordonBTN.setText("Registrera Fordon");
        registerFordonBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerFordonBTNActionPerformed(evt);
            }
        });

        lånaUtrustningBTN.setText("Låna Utrustning");
        lånaUtrustningBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lånaUtrustningBTNActionPerformed(evt);
            }
        });

        lånaFordonBTN.setText("Låna Fordon");
        lånaFordonBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lånaFordonBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(registerUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registreraAlienBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registreraAgentBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerFordonBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lånaUtrustningBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(redigeraAlien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(redigeraAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lånaFordonBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(removeAlienBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeAgentBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeUtrustningBTN)
                            .addComponent(removeFordonBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(changeOmrådesChefBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(görAdminBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(changeLösenBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeAdminBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeKontorsChefBTN))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redigeraAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeAgentBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registreraAgentBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registreraAlienBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redigeraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeAlienBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lånaUtrustningBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeUtrustningBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lånaFordonBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(removeFordonBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registerFordonBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changeOmrådesChefBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeKontorsChefBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(görAdminBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeAdminBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeLösenBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registreraAgentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registreraAgentBTNActionPerformed
        // TODO add your handling code here:
        RegistreraAgent nyAgent = new RegistreraAgent(idb);
        nyAgent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registreraAgentBTNActionPerformed

    private void registreraAlienBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registreraAlienBTNActionPerformed
        // TODO add your handling code here:
        agentAlien nyAlien = new agentAlien(idb);
        nyAlien.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registreraAlienBTNActionPerformed

    private void removeAgentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAgentBTNActionPerformed
        // TODO add your handling code here:
        taBortAgent remove = new taBortAgent(idb);
        remove.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_removeAgentBTNActionPerformed

    private void removeAlienBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAlienBTNActionPerformed
        // TODO add your handling code here:
        taBortAlien remove = new taBortAlien(idb);
        remove.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_removeAlienBTNActionPerformed

    private void removeUtrustningBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUtrustningBTNActionPerformed
        // TODO add your handling code here:
        taBortUtrustning remove = new taBortUtrustning(idb);
        remove.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_removeUtrustningBTNActionPerformed

    private void registerUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerUtrustningActionPerformed
        // TODO add your handling code here:
        agentUtrustning nyUtrustning = new agentUtrustning(idb);
        nyUtrustning.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_registerUtrustningActionPerformed

    private void changeKontorsChefBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeKontorsChefBTNActionPerformed
        // TODO add your handling code here:
        nyKontorschef ny = new nyKontorschef(idb);
        ny.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_changeKontorsChefBTNActionPerformed

    private void removeAdminBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAdminBTNActionPerformed
        // TODO add your handling code here:
        taBortAdmin remove = new taBortAdmin(idb);
        remove.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_removeAdminBTNActionPerformed

    private void görAdminBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_görAdminBTNActionPerformed
        // TODO add your handling code here:
        görAdmin ny = new görAdmin(idb);
        ny.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_görAdminBTNActionPerformed

    private void changeOmrådesChefBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeOmrådesChefBTNActionPerformed
        // TODO add your handling code here:
        nyOmrådeschef ny = new nyOmrådeschef(idb);
        ny.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_changeOmrådesChefBTNActionPerformed

    private void logoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTNActionPerformed
        // TODO add your handling code here:
        huvudFonster tbx = new huvudFonster(idb);
        tbx.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBTNActionPerformed

    private void changeLösenBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeLösenBTNActionPerformed
        // TODO add your handling code here:
        BytLösenord nytt = new BytLösenord(idb);
        nytt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_changeLösenBTNActionPerformed

    private void redigeraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redigeraAlienActionPerformed
        // TODO add your handling code here:
        AgentUppdateraAlienA update = new AgentUppdateraAlienA(idb);
        update.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_redigeraAlienActionPerformed

    private void redigeraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redigeraAgentActionPerformed
        // TODO add your handling code here:
       
        int inmatning = JOptionPane.showConfirmDialog(null, "Den här funktionen kan bara uppdatera en agents namn, telefon och område. Är det vad du vill?", "Uppdatera agent", JOptionPane.YES_NO_OPTION);
        if(inmatning == 0){
        uppdateraAgent update = new uppdateraAgent(idb);
        update.setVisible(true);
        this.dispose();
        }
       /* else if (inmatning == 1){
            int inmatning2 = JOptionPane.showConfirmDialog(null, "Vill du uppdatera en agent till områdeschef? ", "Uppdatera agent", JOptionPane.YES_NO_OPTION);
            if(inmatning2 == 0){
                nyOmrådeschef update = new nyOmrådeschef(idb);
                update.setVisible(true);
                this.dispose();
            
        }
            else if(inmatning2 == 1){
                int inmatning3 = JOptionPane.showConfirmDialog(null, "Vill du uppdatera en agent till kontorschef? ", "Uppdatera agent", JOptionPane.YES_NO_OPTION);
                if(inmatning3 == 0){
                    nyKontorschef update = new nyKontorschef(idb);
                    update.setVisible(true);
                    this.dispose();
                }
                else if(inmatning3 == 1){
                     int inmatning4 = JOptionPane.showConfirmDialog(null, "Vill du uppdatera en agent till adminstratör? ", "Uppdatera agent", JOptionPane.YES_NO_CANCEL_OPTION);
                     if(inmatning4 == 0 ){
                         görAdmin update = new görAdmin(idb);
                         update.setVisible(true);
                         this.dispose();
                     }
                }
            }
        }
        */
        
    }//GEN-LAST:event_redigeraAgentActionPerformed

    private void registerFordonBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerFordonBTNActionPerformed
        // TODO add your handling code here:
        registreraFordon nytt = new registreraFordon(idb);
        nytt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerFordonBTNActionPerformed

    private void removeFordonBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFordonBTNActionPerformed
        // TODO add your handling code here:
        taBortFordon remove = new taBortFordon(idb);
        remove.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_removeFordonBTNActionPerformed

    private void lånaFordonBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lånaFordonBTNActionPerformed
        // TODO add your handling code here:
        lånaFordon låna = new lånaFordon(idb);
        låna.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lånaFordonBTNActionPerformed

    private void lånaUtrustningBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lånaUtrustningBTNActionPerformed
        // TODO add your handling code here:
        lånaUtrustning låna = new lånaUtrustning(idb);
        låna.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lånaUtrustningBTNActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeKontorsChefBTN;
    private javax.swing.JButton changeLösenBTN;
    private javax.swing.JButton changeOmrådesChefBTN;
    private javax.swing.JButton görAdminBTN;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JButton lånaFordonBTN;
    private javax.swing.JButton lånaUtrustningBTN;
    private javax.swing.JButton redigeraAgent;
    private javax.swing.JButton redigeraAlien;
    private javax.swing.JButton registerFordonBTN;
    private javax.swing.JButton registerUtrustning;
    private javax.swing.JButton registreraAgentBTN;
    private javax.swing.JButton registreraAlienBTN;
    private javax.swing.JButton removeAdminBTN;
    private javax.swing.JButton removeAgentBTN;
    private javax.swing.JButton removeAlienBTN;
    private javax.swing.JButton removeFordonBTN;
    private javax.swing.JButton removeUtrustningBTN;
    // End of variables declaration//GEN-END:variables
}
