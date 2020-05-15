/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib1;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author KarlJ
 */
public class valideringsklass {

    public static boolean tomtFalt(JTextField faltCheck) {
        boolean resultat = true;
        //Kollar om fält är tomma och isåfall meddelar användaren om det 
        if (faltCheck.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Fältet är tomt, skriv in ett värde!");
            resultat = false;

        }
        return resultat;
    }
    public static boolean tomCombo(JComboBox comboCheck){
        boolean resultat = true;
        //Kollar om comboboxar är tomma och isåfall meddelar användaren om det 
        if(comboCheck.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Combolisten saknar värde, välj ett värde!");
            resultat = false;
        }
        return resultat;
    }
}
