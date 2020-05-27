/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib1;

import javax.swing.JOptionPane;
import oru.inf.InfDB;

/**
 *
 * @author Jesper
 */
public class AgentUppdateraAlienA extends javax.swing.JFrame {
private static InfDB idb;

    static String getID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form AgentUppdateraAlien
     */
    public AgentUppdateraAlienA(InfDB idb) {
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

        txtUpAlien = new javax.swing.JLabel();
        txtAlien = new javax.swing.JLabel();
        inputID = new javax.swing.JTextField();
        okBTN = new javax.swing.JButton();
        tbxBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtUpAlien.setText("Uppdatera Alien");

        txtAlien.setText("Vilket Alien-ID har alien du vill uppdatera?");

        inputID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIDActionPerformed(evt);
            }
        });

        okBTN.setText("OK");
        okBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBTNActionPerformed(evt);
            }
        });

        tbxBTN.setText("Tillbaka");
        tbxBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxBTNActionPerformed(evt);
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
                            .addComponent(txtAlien)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(okBTN))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(tbxBTN)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUpAlien)
                .addGap(48, 48, 48)
                .addComponent(txtAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(tbxBTN)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIDActionPerformed
    // TODO add your handling code here:
    }//GEN-LAST:event_inputIDActionPerformed

    // Metod f�r att instansiera AgentUppdateraAlienB-klassen.
    private void okBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBTNActionPerformed
        new AgentUppdateraAlienB(idb, getAlienID()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_okBTNActionPerformed

    private void tbxBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxBTNActionPerformed
               // TODO add your handling code here:
          String test = huvudFonster.hamtaAnvandare();
        //om agenten �r admin s� kommer man till adminsidan via knappen annars s� kommer man till vanliga agentsidan
        try{
            //String namn = idb.fetchSingle("Select namn from agent where namn = " + "'" + test + "'");
            // H�r h�mtar den id p� den inloggade agenten
            String id = idb.fetchSingle("Select agent_id from agent where namn = " + "'" + test + "'");
            // Konverterar till int
            int convertId = Integer.parseInt(id);
            //If agenten �r admin 
            String om = idb.fetchSingle("select agent.ADMINISTRATOR from agent where agent_id = " + "'" + convertId +"'");
            //Om villkorret uppfylls(en agent �r admin om det st�r J i administrator kolumnen)
            if(om.equals("J")){
                AdminFonster tbxAdmin = new AdminFonster(idb);
                tbxAdmin.setVisible(true);
                this.dispose();
            }
            // Annars �r det vanliga agentsidan man kommer till
            else{
                AgentInloggad tbx = new AgentInloggad(idb);
                tbx.setVisible(true);
                this.dispose();
                 
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "N�got gick fel");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tbxBTNActionPerformed
    
    /**
     * @param args the command line arguments
     */
   
    
        
//Publik metod som g�r att AgentUppdateraAlienB-klassen kan h�mta Alien-ID.
    
    public int getAlienID() {
        return Integer.parseInt(inputID.getText());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputID;
    private javax.swing.JButton okBTN;
    private javax.swing.JButton tbxBTN;
    private javax.swing.JLabel txtAlien;
    private javax.swing.JLabel txtUpAlien;
    // End of variables declaration//GEN-END:variables
}
