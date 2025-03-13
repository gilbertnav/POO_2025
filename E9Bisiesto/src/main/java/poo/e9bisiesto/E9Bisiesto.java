package poo.e9bisiesto;
import javax.swing.JOptionPane;
public class E9Bisiesto {
    public static void main(String[] args) { 
        int annio;
        annio=Integer.parseInt(JOptionPane.showInputDialog("Año"));
        //Un año bisiesto es divisible entre 4 pero no entre 100
        //Un año bisiesto es divisible entre 400
        if ((annio % 4 == 0 && annio % 100 != 0) || (annio % 400 == 0)) {
            JOptionPane.showMessageDialog(null,annio+" es bisiesto");           
        } else {
            JOptionPane.showMessageDialog(null,annio+" no es bisiesto");             
        }
    }
}
