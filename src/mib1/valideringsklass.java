/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.github.lgooddatepicker.components.DatePicker;
import javax.swing.JPasswordField;


/**
 *
 * @author KarlJ
 */
public class valideringsklass {

    public static boolean tomtFalt(JTextField faltCheck) {
        boolean resultat = true;
        //Kollar om fält är tomma och isåfall meddelar användaren om det, verkar bara kunna kolla av ett fält i taget vilket är lite segt men det funkar 
        if (faltCheck.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Ett eller flera fält är tomma, skriv in ett värde!");
            resultat = false;

        }
        return resultat;
    }
    public static boolean tomCombo(JComboBox comboCheck){
        boolean resultat = true;
        //Kollar om comboboxar är tomma och isåfall meddelar användaren om det, verkar bara kunna kolla av en combobox i taget vilket är lite segt men det funkar 
        if(comboCheck.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Combolisten saknar värde, välj ett värde!");
            resultat = false;
        }
        return resultat;
    }

    public static boolean tomDate(DatePicker dateCheck){
        boolean resultat = true;
        
        if(dateCheck.getDateStringOrEmptyString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Du måste fylla i ett datum!");
            resultat = false;
        }
        return resultat;
    }
    
     

    
    public static boolean longPassword(JPasswordField passwordCheck) {
        boolean resultat = true;
         if(passwordCheck.getText().length() > 6) {
              JOptionPane.showMessageDialog(null, "Lösenordet får vara max 6 tecken, välj ett kortare lösenord!");
            resultat = false;
         }
         return resultat;
    }
    public static boolean longFordonsId(JTextField karaktärCheck) {
        boolean resultat = true;
         if(karaktärCheck.getText().length() > 6) {
              JOptionPane.showMessageDialog(null, "Registreringsnummret får vara max 6 tecken, välj ett kortare registreringsnummer!");
            resultat = false;
         }
         return resultat;
    }
    
    
   /* public static boolean kollaDatum(String korrektDatumFormat) {
        boolean result = false;

        //Sträng med förbestämd "mall" om hur det inskicade strängvärdet ska se ut.
        String regExDatum = "\\d{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|[3][01])";

        //Om det inskicade strängvärdet matchar regexsträngen ovan.
        if (korrektDatumFormat.matches(regExDatum)) {

            //Skapar nytt SimpleDateFormat objekt med formatet "yyyy-MM-dd".
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            try {
                sdf.parse(korrektDatumFormat);
                result = true;
            } catch (ParseException e) {
                //
            }
        }
        if (!result) {
            JOptionPane.showMessageDialog(null, "Fyll i datum enligt följande mall: \"YYYY-MM-DD\"");
        }
        return result;
    }*/
}
