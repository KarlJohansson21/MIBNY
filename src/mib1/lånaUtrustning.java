/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib1;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/**
 *
 * @author KarlJ
 */
public class l�naUtrustning extends javax.swing.JFrame {
        private static InfDB idb;
    /**
     * Creates new form l�naUtrustning
     */
    public l�naUtrustning(InfDB idb) {
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

        l�naBTN = new javax.swing.JButton();
        tbxBTN = new javax.swing.JButton();
        returnBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l�naBTN.setText("L�na Utrustning");
        l�naBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l�naBTNActionPerformed(evt);
            }
        });

        tbxBTN.setText("Tillbaka");
        tbxBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxBTNActionPerformed(evt);
            }
        });

        returnBTN.setText("L�mna tillbaka utrustning");
        returnBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l�naBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbxBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(returnBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(l�naBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbxBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void l�naBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l�naBTNActionPerformed
        // TODO add your handling code here:
         //Promptar anv�ndaren att svara ifall den vill l�na fordon
        int inmatning = JOptionPane.showConfirmDialog(null, "Vill du l�na utrustning?", "L�na utrustning", 2);
        //H�mtar in dagens datum s� att det kan matas in i databasen under utkvitteringsdatum. Utkvitteringsdatum �r alltid dagens datum p� s�ttet vi gjort det
        LocalDate date = LocalDate.now();
        //H�mtar inloggad anv�ndare med hj�lp av hamtaAnvandare metoden fr�n huvudf�nster
        String user = huvudFonster.hamtaAnvandare();
        //Skapar en arraylist med all utrustning
        ArrayList<String> utrustning = new ArrayList<String>();
        //0 = att anv�ndaren tryck ja p� om den vill l�na utrustning
        if(inmatning == 0){
            try{
                //H�mtar in utrustningsben�mningen s� man vet "namnet" p� utrustningen fr�n utrustningstabellen
                 utrustning = idb.fetchColumn("Select benamning from utrustning");
                 //G�rs om till ett arrayobjekt
                 Object[] utrustningObjekt = utrustning.toArray();
                 //Anv�ndaren f�r v�lja vilken utrustning den vill l�na 
                 Object valdUtrustning = JOptionPane.showInputDialog(null, "V�lj utrustning", "", JOptionPane.QUESTION_MESSAGE, null, utrustningObjekt, utrustningObjekt[0]);
                 //G�r objektet till en string med den valda utrustningen
                 String valdUtrustningToString = String.valueOf(valdUtrustning);
                 //H�mtar agent_id p� inloggad anv�ndare
                 int convertId = Integer.parseInt(idb.fetchSingle("Select agent_id from agent where namn = " + "'" + user + "'"));
                 // H�mtar utrustnings_id p� den utrustning som anv�ndaren valt
                 String valtFordonRegnr = idb.fetchSingle("Select utrustnings_id from utrustning where benamning = " + "'" + valdUtrustningToString + "'");
                 // F�r in v�rdena in i innehar_utrustning
                idb.insert("INSERT INTO innehar_utrustning VALUES ('" + convertId + "','" + valtFordonRegnr + "','" + date +  "')");
                 
               
                 
            
            }
            catch(InfException e){
            System.out.println(e.getMessage());
             System.out.println(date);
            }
            catch(NullPointerException e){
                System.out.println(e.getMessage());
                System.out.println(date);
            }
        
        }
        
    }//GEN-LAST:event_l�naBTNActionPerformed

    private void tbxBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxBTNActionPerformed
        // TODO add your handling code here:
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

    private void returnBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBTNActionPerformed
        // TODO add your handling code here:
        int inmatning = JOptionPane.showConfirmDialog(null, "Vill du l�mna tillbaka utrustning?", "L�mna utrustning", 2);
        //H�mtar in dagens datum s� att det kan matas in i databasen under utkvitteringsdatum. Utkvitteringsdatum �r alltid dagens datum p� s�ttet vi gjort det
        LocalDate date = LocalDate.now();
        //H�mtar inloggad anv�ndare med hj�lp av hamtaAnvandare metoden fr�n huvudf�nster
        String user = huvudFonster.hamtaAnvandare();
        //Skapar en arraylist med all utrustning
        ArrayList<String> l�nadUtrustning = new ArrayList<String>();
        //0 = att anv�ndaren tryck ja p� om den vill l�na utrustning
        if(inmatning == 0){
            try{
                int convertId = Integer.parseInt(idb.fetchSingle("Select agent_id from agent where namn = " + "'" + user + "'"));
                l�nadUtrustning = idb.fetchColumn("Select benamning from utrustning");
                //G�rs om till ett arrayobjekt
                 Object[] utrustningObjekt = l�nadUtrustning.toArray();
                 Object valdUtrustning = JOptionPane.showInputDialog(null, "V�lj utrustning att l�mna", "", JOptionPane.QUESTION_MESSAGE, null, utrustningObjekt, utrustningObjekt[0]);
                 String valdUtrustningToString = String.valueOf(valdUtrustning);
                 String valtUtrustningId = idb.fetchSingle("Select utrustnings_id from utrustning where benamning = " + "'" + valdUtrustningToString + "'");
                 String l�nad = idb.fetchSingle("select agent_id from innehar_utrustning where utrustnings_id = " + "'" + valtUtrustningId + "'" + "and agent_id = " + "'" + convertId +"'" );
                 
                 if(l�nad == null){
                     JOptionPane.showMessageDialog(null, "Du kan ju inte l�mna tillbaka n�got du inte l�nar!");
                 }
                 else{
                 idb.delete("Delete from innehar_utrustning where utrustnings_id = " + "'" + valtUtrustningId + "'" + "and agent_id = " + "'" + convertId + "'");
                 JOptionPane.showMessageDialog(null, "Utrustningen har l�mnats tillbaka!");
            }
            }
            catch(InfException e ){
                JOptionPane.showMessageDialog(null, "Har du verkligen n�got att l�mna tillbaka?");
                System.out.println(e.getMessage());
            }
        
        }
    }//GEN-LAST:event_returnBTNActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton l�naBTN;
    private javax.swing.JButton returnBTN;
    private javax.swing.JButton tbxBTN;
    // End of variables declaration//GEN-END:variables
}
