/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib1;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;
/**
 *
 * @author KarlJ
 */
public class agentUtrustning extends javax.swing.JFrame {
    private static InfDB idb;
    /**
     * Creates new form agentUtrustning
     */
    public agentUtrustning(InfDB idb) {
        initComponents();
        this.idb = idb;
        //Eftersom att comboboxUtrustning har kommunikation som startv�rde s� initialiseras valLBL med texten "�verf�ringsteknik"
        valLBL.setVisible(true);
        valLBL.setText("�verf�ringsteknik");
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
        comboboxUtrustning = new javax.swing.JComboBox<>();
        nyUtrustningBTN = new javax.swing.JButton();
        namnUtrustning = new javax.swing.JTextField();
        NamnLBL = new javax.swing.JLabel();
        TypLBL = new javax.swing.JLabel();
        textVal = new javax.swing.JTextField();
        valLBL = new javax.swing.JLabel();
        tbxBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboboxUtrustning.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kommunikation", "Teknik", "Vapen" }));
        comboboxUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxUtrustningActionPerformed(evt);
            }
        });

        nyUtrustningBTN.setText("Registrera utrusting");
        nyUtrustningBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyUtrustningBTNActionPerformed(evt);
            }
        });

        NamnLBL.setText("Namn");

        TypLBL.setText("Typ");

        textVal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textValActionPerformed(evt);
            }
        });

        valLBL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tbxBTN.setText("Tillbaka");
        tbxBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tbxBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nyUtrustningBTN)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboboxUtrustning, 0, 129, Short.MAX_VALUE)
                                .addComponent(namnUtrustning)
                                .addComponent(NamnLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TypLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textVal)
                                .addComponent(valLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(NamnLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namnUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TypLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboboxUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valLBL)
                .addGap(8, 8, 8)
                .addComponent(textVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nyUtrustningBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tbxBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboboxUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxUtrustningActionPerformed
        // TODO add your handling code here:
         
        String  val= comboboxUtrustning.getSelectedItem().toString();
        //S�tter det man valt fr�n komboboxen i valLBL s� att man kan se att man tex ska mata in kaliber p� det vapen man l�gger in i systemet
        if(val.equals("Kommunikation")){
            valLBL.setVisible(true);
            valLBL.setText("�verf�ringsteknik:");
        }
        else if(val.equals("Teknik")){
            valLBL.setVisible(true);
            valLBL.setText("Kraftk�lla:");
        }
        else{
            valLBL.setVisible(true);
            valLBL.setText("Kaliber:");
        }
    }//GEN-LAST:event_comboboxUtrustningActionPerformed

    private void nyUtrustningBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyUtrustningBTNActionPerformed
        // TODO add your handling code here:
        String namn = namnUtrustning.getText();
        String beskriv = textVal.getText();
        String  val = comboboxUtrustning.getSelectedItem().toString();
        //Kollar s� att det inte skickas med tomma v�rden
        if(valideringsklass.tomtFalt(namnUtrustning) && valideringsklass.tomtFalt(textVal)){
            //L�gger till ben�mningen p� utrustningen samt autoinkrementerar utrustningstabellen f�r varje objekt som matas in
            try{
            String add = idb.getAutoIncrement("Utrustning", "Utrustnings_ID");
            int convertID = Integer.parseInt(add);
            idb.insert("INSERT INTO UTRUSTNING VALUES ('" + convertID + "','" + namn + "')");
            // Beroende p� vad man valt i comboboxUtrustning l�ggs det till i r�tt tabell
            if(val.equals("Kommunikation")){
                idb.insert("Insert into kommunikation values ('" + convertID + "','" + beskriv + "')");
            }
            else if(val.equals("Teknik")){
            idb.insert("Insert into Teknik values ('" + convertID + "','" + beskriv + "')");
        
        }
            else{
                    idb.insert("Insert into Vapen values ('" + convertID + "','" + beskriv + "')");
                    }
            //Ruta som informerar anv�ndaren att utrustningen har registrerats
            JOptionPane.showMessageDialog(null, "Utrustningen har registrerats");
        }
         
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "N�got gick fel f�rs�k igen");
            System.out.println(e.getMessage());
        }
        
        }
    }//GEN-LAST:event_nyUtrustningBTNActionPerformed

    private void textValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textValActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_textValActionPerformed

    private void tbxBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxBTNActionPerformed
        // TODO add your handling code here:
        //Tar anv�ndaren tillbaka till AgentInloggad1 f�nstret
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
                AgentInloggad1 tbx = new AgentInloggad1(idb);
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
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NamnLBL;
    private javax.swing.JLabel TypLBL;
    private javax.swing.JComboBox<String> comboboxUtrustning;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField namnUtrustning;
    private javax.swing.JButton nyUtrustningBTN;
    private javax.swing.JButton tbxBTN;
    private javax.swing.JTextField textVal;
    private javax.swing.JLabel valLBL;
    // End of variables declaration//GEN-END:variables
}
