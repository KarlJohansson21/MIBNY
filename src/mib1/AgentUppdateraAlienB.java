/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mib1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import java.sql.SQLException;
/**
 *
 * @author Jesper
 */
public class AgentUppdateraAlienB extends javax.swing.JFrame {

    private static InfDB idb;
    int alienID;

    /**
     * Creates new form AgentUppdateraAlienB
     */
    public AgentUppdateraAlienB(InfDB idb, int pAlienID) {
        initComponents();
        this.idb = idb;
        alienID = pAlienID;
    }

    AgentUppdateraAlienB() {

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUpAlien = new javax.swing.JLabel();
        txtDate1 = new javax.swing.JLabel();
        txtDate2 = new javax.swing.JLabel();
        dateVal = new javax.swing.JTextField();
        txtName = new javax.swing.JLabel();
        nameVal = new javax.swing.JTextField();
        txtPassword = new javax.swing.JLabel();
        passwordVal = new javax.swing.JPasswordField();
        txtPhone = new javax.swing.JLabel();
        phoneVal = new javax.swing.JTextField();
        txtChef1 = new javax.swing.JLabel();
        txtChef2 = new javax.swing.JLabel();
        chefVal = new javax.swing.JTextField();
        txtPlats = new javax.swing.JLabel();
        platsVal = new javax.swing.JTextField();
        saveBTN = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtUpAlien.setText("Uppdatera Alien");

        txtDate1.setText("Registreringsdatum");

        txtDate2.setText("(YYYY-MM-DD)");

        txtName.setText("Namn");

        txtPassword.setText("L�senord");

        txtPhone.setText("Telefonnummer");

        txtChef1.setText("Ansvarig Agent");

        txtChef2.setText("(ID)");

        txtPlats.setText("Plats (ID)");

        saveBTN.setText("Spara");
        saveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBTNActionPerformed(evt);
            }
        });

        jButton1.setText("Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUpAlien)
                            .addComponent(txtPassword)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(passwordVal, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDate1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDate2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateVal, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameVal, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPlats)
                                    .addComponent(txtChef2)
                                    .addComponent(txtChef1)
                                    .addComponent(txtPhone)
                                    .addComponent(phoneVal, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(chefVal)
                                    .addComponent(platsVal)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(saveBTN)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUpAlien)
                .addGap(31, 31, 31)
                .addComponent(txtPhone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate1)
                    .addComponent(txtChef1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate2)
                    .addComponent(txtChef2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chefVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName)
                    .addComponent(txtPlats))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(platsVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBTN)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTNActionPerformed
    try {
            String textSQL;
            String name = nameVal.getText();
            String password = passwordVal.getText();
            String phone = phoneVal.getText();
            String date = dateVal.getText();

            // Konvertering fr�n String till Integer.
            int chef = Integer.parseInt(chefVal.getText());
            int plats = Integer.parseInt(platsVal.getText());

            //Konvertering fr�n JavaDate till SQLdate.
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date parsedate = format.parse(date);
            java.sql.Date daydate = new java.sql.Date(parsedate.getTime());

            textSQL = ("update ALIEN set REGISTRERINGSDATUM=" + "'" + daydate + "'" + ",LOSENORD =" + "'" + password + "'" + ",NAMN=" + "'" + name + "'" + ",TELEFON=" + "'" + phone + "'" + ",PLATS=" + plats + ",ANSVARIG_AGENT=" + chef + " WHERE ALIEN_ID=" + alienID);
            System.out.println(textSQL);
            idb.update(textSQL);
            JOptionPane.showMessageDialog(null, "En alien har nu uppdaterats");

            System.out.println("En alien har nu uppdaterats ");
            
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Fel");

        } catch (ParseException ex) {
            Logger.getLogger(AgentUppdateraAlienB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Fel");
        }
    }//GEN-LAST:event_saveBTNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       AgentUppdateraAlienA tbx = new AgentUppdateraAlienA(idb);
        tbx.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgentUppdateraAlienB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentUppdateraAlienB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentUppdateraAlienB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentUppdateraAlienB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgentUppdateraAlienB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chefVal;
    private javax.swing.JTextField dateVal;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField nameVal;
    private javax.swing.JPasswordField passwordVal;
    private javax.swing.JTextField phoneVal;
    private javax.swing.JTextField platsVal;
    private javax.swing.JButton saveBTN;
    private javax.swing.JLabel txtChef1;
    private javax.swing.JLabel txtChef2;
    private javax.swing.JLabel txtDate1;
    private javax.swing.JLabel txtDate2;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtPassword;
    private javax.swing.JLabel txtPhone;
    private javax.swing.JLabel txtPlats;
    private javax.swing.JLabel txtUpAlien;
    // End of variables declaration//GEN-END:variables

}