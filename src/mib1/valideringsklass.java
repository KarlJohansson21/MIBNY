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
        //Kollar om f�lt �r tomma och is�fall meddelar anv�ndaren om det, verkar bara kunna kolla av ett f�lt i taget vilket �r lite segt men det funkar 
        if (faltCheck.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Ett eller flera f�lt �r tomma, skriv in ett v�rde!");
            resultat = false;

        }
        return resultat;
    }
    public static boolean tomCombo(JComboBox comboCheck){
        boolean resultat = true;
        //Kollar om comboboxar �r tomma och is�fall meddelar anv�ndaren om det, verkar bara kunna kolla av en combobox i taget vilket �r lite segt men det funkar 
        if(comboCheck.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Combolisten saknar v�rde, v�lj ett v�rde!");
            resultat = false;
        }
        return resultat;
    }

    public static boolean tomDate(DatePicker dateCheck){
        boolean resultat = true;
        
        if(dateCheck.getDateStringOrEmptyString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Du m�ste fylla i ett datum!");
            resultat = false;
        }
        return resultat;
    }
    
     

    
    public static boolean longPassword(JPasswordField passwordCheck) {
        boolean resultat = true;
         if(passwordCheck.getText().length() > 6) {
              JOptionPane.showMessageDialog(null, "L�senordet f�r vara max 6 tecken, v�lj ett kortare l�senord!");
            resultat = false;
         }
         return resultat;
    }
    public static boolean longFordonsId(JTextField karakt�rCheck) {
        boolean resultat = true;
         if(karakt�rCheck.getText().length() > 6) {
              JOptionPane.showMessageDialog(null, "Registreringsnummret f�r vara max 6 tecken, v�lj ett kortare registreringsnummer!");
            resultat = false;
         }
         return resultat;
    }
    
    
   /* public static boolean kollaDatum(String korrektDatumFormat) {
        boolean result = false;

        //Str�ng med f�rbest�md "mall" om hur det inskicade str�ngv�rdet ska se ut.
        String regExDatum = "\\d{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|[3][01])";

        //Om det inskicade str�ngv�rdet matchar regexstr�ngen ovan.
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
            JOptionPane.showMessageDialog(null, "Fyll i datum enligt f�ljande mall: \"YYYY-MM-DD\"");
        }
        return result;
    }*/
}
