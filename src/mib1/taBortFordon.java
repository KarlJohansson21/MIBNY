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
public class taBortFordon extends javax.swing.JFrame {
    private static InfDB idb;
    /**
     * Creates new form taBortFordon
     */
    public taBortFordon(InfDB idb) {
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

        removeFordon = new javax.swing.JTextField();
        sökFordonLBL = new javax.swing.JLabel();
        sökBTN = new javax.swing.JButton();
        regNrTextField = new javax.swing.JTextField();
        regNrLBL = new javax.swing.JLabel();
        fordonsModellLBL = new javax.swing.JLabel();
        fordonsModellTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dorTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        årsmodellTextField = new javax.swing.JTextField();
        removeBTN = new javax.swing.JButton();
        tbxBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sökFordonLBL.setText("Sök fordon");

        sökBTN.setText("Sök");
        sökBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sökBTNActionPerformed(evt);
            }
        });

        regNrTextField.setEditable(false);

        regNrLBL.setText("Registreringsnummer");

        fordonsModellLBL.setText("Fordonsmodell");

        fordonsModellTextField.setEditable(false);

        jLabel1.setText("Registreringsdatum");

        dorTextField.setEditable(false);

        jLabel2.setText("Årsmodell");

        årsmodellTextField.setEditable(false);

        removeBTN.setText("Ta bort Fordon");
        removeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBTNActionPerformed(evt);
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
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(årsmodellTextField)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dorTextField)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fordonsModellTextField)
                    .addComponent(fordonsModellLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regNrLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sökFordonLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regNrTextField)
                    .addComponent(removeFordon))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removeBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sökBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbxBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(sökFordonLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeFordon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sökBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(regNrLBL)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(regNrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fordonsModellLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fordonsModellTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(removeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tbxBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(årsmodellTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sökBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sökBTNActionPerformed
        // TODO add your handling code here:
        if(valideringsklass.tomtFalt(removeFordon)){
            String valtFordon = removeFordon.getText();
            try{
                String id = idb.fetchSingle("Select fordons_id from fordon where fordonsbeskrivning = " + "'" + valtFordon + "'");
                
                regNrTextField.setText(id);
                
                String modell = idb.fetchSingle("Select fordonsbeskrivning from fordon where fordons_id =  " + "'" + id + "'");
                fordonsModellTextField.setText(modell);
                
                String date = idb.fetchSingle("Select registreringsdatum from fordon where fordons_id = " + "'" + id + "'");
                dorTextField.setText(date);
                
                String år = idb.fetchSingle("Select arsmodell from fordon where fordons_id = " + "'" + id + "'");
                årsmodellTextField.setText(år);
                if(id == null){
                    JOptionPane.showMessageDialog(null, "Fordonet hittades inte! Dubbelkolla stavningen");
                }
            
            }
            
            catch(Exception e){
             JOptionPane.showMessageDialog(null, "Fordonet hittades inte! Dubbelkolla stavningen");
             System.out.println(e.getMessage());
            }
            
            
            
        
        }
    }//GEN-LAST:event_sökBTNActionPerformed

    private void removeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBTNActionPerformed
        // TODO add your handling code here:
         if(valideringsklass.tomtFalt(regNrTextField)){
          String id = regNrTextField.getText();
          try{
          int inmatning = JOptionPane.showConfirmDialog(null, "Vill du ta bort fordonet?", "Ta bort fordon", 2);
          if(inmatning == 0){
              //Raderar fordonet från fordonstabellen och innehar_fordon oavsett om någon lånar fordonet för tillfället
              idb.delete("Delete from innehar_fordon where fordons_id = " + "'" + id + "'");
              idb.delete("Delete from fordon where fordons_id = " + "'" + id + "'");
              JOptionPane.showMessageDialog(null, "Fordonet har raderats");
              removeFordon.setText("");
              regNrTextField.setText("");
              fordonsModellTextField.setText("");
              dorTextField.setText("");
              årsmodellTextField.setText("");
              
              
         
         }
        }
         catch(InfException e){
                 JOptionPane.showMessageDialog(null, "Inget fordon med det inskrivna id hittas i registret!");  
                 System.out.println(e.getMessage());
                 }
         }
    }//GEN-LAST:event_removeBTNActionPerformed

    private void tbxBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxBTNActionPerformed
        // TODO add your handling code here:
        AdminFonster tbx = new AdminFonster(idb);
        tbx.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tbxBTNActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dorTextField;
    private javax.swing.JLabel fordonsModellLBL;
    private javax.swing.JTextField fordonsModellTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel regNrLBL;
    private javax.swing.JTextField regNrTextField;
    private javax.swing.JButton removeBTN;
    private javax.swing.JTextField removeFordon;
    private javax.swing.JButton sökBTN;
    private javax.swing.JLabel sökFordonLBL;
    private javax.swing.JButton tbxBTN;
    private javax.swing.JTextField årsmodellTextField;
    // End of variables declaration//GEN-END:variables
}
