/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.e11signozodiacal;

import javax.swing.JOptionPane;

public class E11SignoZodiacal {

    
    public static void main(String[] args) {
        Object[] mes={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        String m;
        byte dia;
        dia = Byte.parseByte(JOptionPane.showInputDialog("Introduce el día"));
        m = JOptionPane.showInputDialog(null, "Elige el mes", "Signo Zodiacal", 0, null, mes, mes[0]).toString();
        //JOptionPane.showMessageDialog(null, m);
        if (dia >=21 && m.equals("Marzo") || (dia<=19 && m.equals("Abril")) ) {
            JOptionPane.showMessageDialog(null, "Aries");
        }
        if (dia >=20 && m.equals("Abril") || (dia<=20 && m.equals("Mayo")) ) {
            JOptionPane.showMessageDialog(null, "Tauro");
        }
        if (dia >=21 && m.equals("Mayo") || (dia<=20 && m.equals("Junio")) ) {
            JOptionPane.showMessageDialog(null, "Geminis");
        }
        if (dia >=21 && m.equals("Junio") || (dia<=22 && m.equals("Julio")) ) {
            JOptionPane.showMessageDialog(null, "Cancer");
        }
        if (dia >=23 && m.equals("Julio") || (dia<=22 && m.equals("Agosto")) ) {
            JOptionPane.showMessageDialog(null, "Leo");
        }
        if (dia >=23 && m.equals("Agosto") || (dia<=22 && m.equals("Septiembre")) ) {
            JOptionPane.showMessageDialog(null, "Virgo");
        }
        if (dia >=23 && m.equals("Septiembre") || (dia<=22 && m.equals("Octubre")) ) {
            JOptionPane.showMessageDialog(null, "Libra");
        }
        if (dia >=23 && m.equals("Octubre") || (dia<=21 && m.equals("Noviembre")) ) {
            JOptionPane.showMessageDialog(null, "Escorpio");
        }
        if (dia >=22 && m.equals("Noviembre") || (dia<=21 && m.equals("Diciembre")) ) {
            JOptionPane.showMessageDialog(null, "Sagitario");
        }
        if (dia >=22 && m.equals("Diciembre") || (dia<=19 && m.equals("Enero")) ) {
            JOptionPane.showMessageDialog(null, "Capricornio");
        }
        if (dia >=20 && m.equals("Enero") || (dia<=18 && m.equals("Febrero")) ) {
            JOptionPane.showMessageDialog(null, "Acuario");
        }
        if (dia >=19 && m.equals("Febrero") || (dia<=20 && m.equals("Marzo")) ) {
            JOptionPane.showMessageDialog(null, "Piscis");
        }
    }
}
