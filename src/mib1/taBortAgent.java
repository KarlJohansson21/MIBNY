/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib1;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author KarlJ
 */
public class taBortAgent extends javax.swing.JFrame {
private static InfDB idb;
    /**
     * Creates new form taBortAgent
     */
    public taBortAgent(InfDB idb) {
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

        agentNamnRemove = new javax.swing.JTextField();
        s�kAgentBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        NamnTextField = new javax.swing.JTextField();
        telefonTextField = new javax.swing.JTextField();
        doeTextField = new javax.swing.JTextField();
        areaCombo = new javax.swing.JComboBox<>();
        adminCombo = new javax.swing.JComboBox<>();
        removeAgentBTN = new javax.swing.JButton();
        typCombo = new javax.swing.JComboBox<>();
        tbxBTN = new javax.swing.JButton();
        agentIDLBL = new javax.swing.JLabel();
        namnLBL = new javax.swing.JLabel();
        tfnLBL = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        s�kAgentBTN.setText("S�k");
        s�kAgentBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s�kAgentBTNActionPerformed(evt);
            }
        });

        jLabel1.setText("S�k agent");

        idTextField.setEnabled(false);

        NamnTextField.setEnabled(false);

        telefonTextField.setEnabled(false);

        doeTextField.setEnabled(false);

        areaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Svealand", "G�taland", "Norrland" }));
        areaCombo.setEnabled(false);

        adminCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ja", "Nej" }));
        adminCombo.setEnabled(false);

        removeAgentBTN.setText("Ta Bort Agent");
        removeAgentBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAgentBTNActionPerformed(evt);
            }
        });

        typCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kontorschef", "Omr�deschef", "F�ltagent" }));
        typCombo.setEnabled(false);

        tbxBTN.setText("Tillbaka");
        tbxBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxBTNActionPerformed(evt);
            }
        });

        agentIDLBL.setText("AgentID");

        namnLBL.setText("Namn");

        tfnLBL.setText("Telefon");

        jLabel2.setText("Anst�llningsdatum");

        jLabel3.setText("Omr�de");

        jLabel4.setText("Admin");

        jLabel5.setText("Typ av agent");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tbxBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removeAgentBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(agentNamnRemove))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s�kAgentBTN)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(adminCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(idTextField)
                                        .addGap(38, 38, 38))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(doeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(agentIDLBL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(namnLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(NamnTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(telefonTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                            .addComponent(tfnLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(typCombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(areaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(115, 115, 115))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agentNamnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s�kAgentBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfnLBL)
                    .addComponent(namnLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agentIDLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NamnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removeAgentBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(tbxBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void s�kAgentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s�kAgentBTNActionPerformed
        // TODO add your handling code here:
        if(valideringsklass.tomtFalt(agentNamnRemove)){
            String valdAgent = agentNamnRemove.getText();
            try{
                String agentId = idb.fetchSingle("Select agent_id from agent where namn = " + "'" + valdAgent + "'");
                idTextField.setText(agentId);
                int AgentId = Integer.parseInt(agentId);
                
                String agentNamn = idb.fetchSingle("Select namn from agent where agent_id = " + "'" +AgentId +"'");
                NamnTextField.setText(agentNamn);
                
                String tfn = idb.fetchSingle("Select telefon from agent where agent_id = " +"'" +AgentId +"'");
                telefonTextField.setText(tfn);
                
                String doe = idb.fetchSingle("Select anstallningsdatum from agent where agent_id = " +"'" + AgentId + "'");
                doeTextField.setText(doe);
                
                String plats = idb.fetchSingle("Select benamning from omrade join agent on agent.omrade = omrade.omrades_id where agent_id = " +"'" + AgentId +"'");
                areaCombo.getModel().setSelectedItem(plats);
                
                String isKontorChef = idb.fetchSingle("Select Agent_id from kontorschef");
                int sant = Integer.parseInt(isKontorChef);
                String isOmradeChef = idb.fetchSingle("Select agent_id from omradeschef where agent_id = " + "'" + AgentId + "'");
                int sant2 = Integer.parseInt(isOmradeChef);
                if(sant == AgentId){
                    typCombo.getModel().setSelectedItem("Kontorschef");
                }
                else if(sant2 == AgentId){
                    typCombo.getModel().setSelectedItem("Omr�deschef");
                }
                else{
                    typCombo.getModel().setSelectedItem("F�ltagent");
                }
              
                String admin = idb.fetchSingle("Select administrator from agent where agent_id = " + "'" + AgentId + "'");
                if(admin.equals("J")){
                adminCombo.getModel().setSelectedItem("Ja");
                }
                else{
                adminCombo.getModel().setSelectedItem("Nej");
                }
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Agenten hittades inte, dubbelkolla stavningen och f�rs�k igen!");
            }
        }
       
    }//GEN-LAST:event_s�kAgentBTNActionPerformed

    private void removeAgentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAgentBTNActionPerformed
        // TODO add your handling code here:
         if (valideringsklass.tomtFalt(idTextField)) {
            ArrayList<String> agentNamn = new ArrayList<String>();
            int input = JOptionPane.showConfirmDialog(null, "Vill du ta bort agenten?", "Ta bort agenten", 2);

            if (input == 0) {
                try {

                    
                    int convertId = Integer.parseInt(idTextField.getText());
                    agentNamn = idb.fetchColumn("Select Namn from agent where not Agent_id = " + "'" + convertId + "'");
                    Object[] agentObjekt = agentNamn.toArray();
                    String ansvarig = idb.fetchSingle("Select ansvarig_agent from alien where ansvarig_agent = " + "'" + convertId + "'");
                    //if agent �r ansvarig agent f�r n�gon alien
                    if (ansvarig != null) {
                        Object nyAnsvarig = JOptionPane.showInputDialog(null, "V�lj ny ansvarig agent", "Agenten �r ansvarig f�r en alien", JOptionPane.QUESTION_MESSAGE, null, agentObjekt, agentObjekt[0]);
                        String nyAnsvarigToString = String.valueOf(nyAnsvarig);
                        int nyAnsvarigId = Integer.parseInt(idb.fetchSingle("Select agent_id from agent where namn = " + "'" + nyAnsvarigToString + "'"));
                        idb.update("Update alien set ansvarig_agent = " + "'" + nyAnsvarigId + "'" + "where ansvarig_agent = " + "'" + convertId + "'");

                    }
                    //If agent �r kontorschef
                    if (convertId == Integer.parseInt(idb.fetchSingle("SELECT AGENT_ID FROM KONTORSCHEF"))) {
                        Object nyKontorsChef = JOptionPane.showInputDialog(null, "V�lj ny kontorschef", "Agenten �r kontorschef", JOptionPane.QUESTION_MESSAGE, null, agentObjekt, agentObjekt[0]);
                        String nyKontorsChefToString = String.valueOf(nyKontorsChef);
                        int nyKontorsChefId = Integer.parseInt(idb.fetchSingle("Select agent_id from agent where namn  = " + "'" + nyKontorsChefToString + "'"));
                        idb.update("Update kontorschef set agent_id = " + "'" + nyKontorsChefId + "'");

                    }
                    
                    idb.delete("Delete from agent where agent_id = " + "'" + convertId + "'");
                    idb.delete("Delete from faltagent where agent_id = " + "'" + convertId + "'");
                    idb.delete("Delete from innehar_utrustning where agent_id = " + "'" + convertId + "'");
                    idb.delete("Delete from innehar_fordon where agent_id = " + "'" + convertId + "'");
                    idb.delete("Delete from omradeschef where agent_id = " + "'" + convertId + "'");
                    
                    JOptionPane.showMessageDialog(null, "Agenten har tagits bort fr�n systemet");

                } catch (InfException e) {
                    JOptionPane.showMessageDialog(null, "Agenten hittades inte, dubbelkolla s� att stavningen �r korrekt");
                    System.out.println(e.getMessage());
                }
                catch (java.lang.NumberFormatException e) {
                  JOptionPane.showMessageDialog(null, "Agenten hittades inte, dubbelkolla s� att stavningen �r korrekt");
            }
            }
        }
    }//GEN-LAST:event_removeAgentBTNActionPerformed

    private void tbxBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxBTNActionPerformed
        // TODO add your handling code here:
        AdminFonster tbx = new AdminFonster(idb);
        tbx.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tbxBTNActionPerformed

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
            java.util.logging.Logger.getLogger(taBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(taBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(taBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(taBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new taBortAgent(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NamnTextField;
    private javax.swing.JComboBox<String> adminCombo;
    private javax.swing.JLabel agentIDLBL;
    private javax.swing.JTextField agentNamnRemove;
    private javax.swing.JComboBox<String> areaCombo;
    private javax.swing.JTextField doeTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel namnLBL;
    private javax.swing.JButton removeAgentBTN;
    private javax.swing.JButton s�kAgentBTN;
    private javax.swing.JButton tbxBTN;
    private javax.swing.JTextField telefonTextField;
    private javax.swing.JLabel tfnLBL;
    private javax.swing.JComboBox<String> typCombo;
    // End of variables declaration//GEN-END:variables
}
