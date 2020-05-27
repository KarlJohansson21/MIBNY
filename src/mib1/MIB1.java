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
public class MIB1 {

    private static InfDB idb;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            String userDir = System.getProperty("user.dir"); //Hämtar in vilken mapp projektet ligger i 
            String windowsOrMac = System.getProperty("os.name");//Kanske dumt namn eftersom det typ antyder att det är av datatypen boolean men ganska beskrivande 
            String sokVag = "";
            switch (windowsOrMac){
            case "Mac OS": 
                    sokVag = userDir + "/db/MIBDBNY.FDB";
                    
                    break;
                  
            case "Windows 10":
            
                sokVag = userDir + "\\db\\MIBDBNY.FDB";
                System.out.println(sokVag);
                
                break;
        
        }
            idb = new InfDB(sokVag);
            new huvudFonster(idb).setVisible(true);
           
            
            

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
        
        
    }
    
}
