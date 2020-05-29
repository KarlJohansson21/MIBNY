/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib1;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author KarlJ
 */
public class s�kAlienPlats extends javax.swing.JFrame {
    private static InfDB idb;
    /**
     * Creates new form s�kAlienPlats
     */
    public s�kAlienPlats(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllCb();
    }
    private void fyllCb(){
        String fraga = "Select benamning from plats";
        try{
            ArrayList<String> platser = new ArrayList<>();
            platser = idb.fetchColumn(fraga);
            
            for(String orter: platser ){
                jComboBox1.addItem(orter);
            }
        
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Se alla aliens som finns p�:");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("");
        
        ArrayList<HashMap<String, String>> aliens = new ArrayList<HashMap<String, String>>();;
        try{
            String valdOrt = jComboBox1.getSelectedItem().toString();
            String fraga = "SELECT * FROM ALIEN WHERE ALIEN_ID IN (SELECT ALIEN_ID FROM ALIEN WHERE PLATS = (SELECT PLATS_ID FROM PLATS WHERE BENAMNING = '" + valdOrt + "')) ORDER BY ALIEN_ID";
            aliens = idb.fetchRows(fraga);
            for(HashMap<String, String> alien : aliens){
                jTextArea1.append("AlienID: " + alien.get("ALIEN_ID") + "\n");
                jTextArea1.append("Namn: " + alien.get("NAMN") + "\n");
                jTextArea1.append("Telefonnummer: " + alien.get("TELEFON") + "\n");
                jTextArea1.append("---------------------------------------------" + "\n");
               
            }
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "N�got gick fel mellan databasen och dig! F�rs�k g�rna igen. Om fel kvarst�r kontakta en administrat�r!");
        }
        catch(NullPointerException e){
            
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
