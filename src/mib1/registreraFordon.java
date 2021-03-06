/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib1;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import com.github.lgooddatepicker.components.DatePicker ;
/**
 *
 * @author KarlJ
 */
public class registreraFordon extends javax.swing.JFrame {
    private static InfDB idb;
    /**
     * Creates new form registreraFordon
     */
    public registreraFordon(InfDB idb) {
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

        fIdTextField = new javax.swing.JTextField();
        regNrLBL = new javax.swing.JLabel();
        fordonsBeskrivningTextField = new javax.swing.JTextField();
        beskrivningLBL = new javax.swing.JLabel();
        regDatePicker = new com.github.lgooddatepicker.components.DatePicker();
        regDateLBL = new javax.swing.JLabel();
        �rsModellLBL = new javax.swing.JLabel();
        nyttFordonBTN = new javax.swing.JButton();
        �rsmodellYearChooser = new com.toedter.calendar.JYearChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        regNrLBL.setText("Registreringsnummer");

        beskrivningLBL.setText("Fordonsmodell");

        regDateLBL.setText("Registreringsdatum");

        �rsModellLBL.setText("�rsmodell");

        nyttFordonBTN.setText("Registrera nytt fordon");
        nyttFordonBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyttFordonBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(beskrivningLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(regNrLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                        .addComponent(regDateLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(�rsModellLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(nyttFordonBTN)
                    .addComponent(regDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fordonsBeskrivningTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(�rsmodellYearChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(regNrLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(beskrivningLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fordonsBeskrivningTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regDateLBL)
                .addGap(1, 1, 1)
                .addComponent(regDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(�rsModellLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(�rsmodellYearChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(nyttFordonBTN)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nyttFordonBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyttFordonBTNActionPerformed
        // TODO add your handling code here:
        String reg = fIdTextField.getText();
        String modell = fordonsBeskrivningTextField.getText();
        String regDatum = regDatePicker.getDateStringOrEmptyString();
        int �r = �rsmodellYearChooser.getYear();
        
        
        if(valideringsklass.tomtFalt(fIdTextField) && valideringsklass.longFordonsId(fIdTextField) && valideringsklass.tomtFalt(fordonsBeskrivningTextField) && valideringsklass.tomDate(regDatePicker)){
          try{
           idb.insert("Insert into fordon values ('" + reg + "','" + modell + "','" + regDatum + "','" + �r + "')");
           JOptionPane.showMessageDialog(null, "Nytt fordon registrerat");
          }
          catch(InfException e){
              JOptionPane.showMessageDialog(null, "N�got av f�lten har f�r m�nga karakt�rer (6 f�r regnr och 100 f�r fordonsmodellen)");
              System.out.println(e.getMessage());
          }
          
        }
        
    }//GEN-LAST:event_nyttFordonBTNActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel beskrivningLBL;
    private javax.swing.JTextField fIdTextField;
    private javax.swing.JTextField fordonsBeskrivningTextField;
    private javax.swing.JButton nyttFordonBTN;
    private javax.swing.JLabel regDateLBL;
    private com.github.lgooddatepicker.components.DatePicker regDatePicker;
    private javax.swing.JLabel regNrLBL;
    private javax.swing.JLabel �rsModellLBL;
    private com.toedter.calendar.JYearChooser �rsmodellYearChooser;
    // End of variables declaration//GEN-END:variables
}
