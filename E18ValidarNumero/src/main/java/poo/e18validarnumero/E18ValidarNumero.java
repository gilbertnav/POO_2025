package poo.e18validarnumero;

import javax.swing.JOptionPane;

public class E18ValidarNumero {

    public static void main(String[] args) {
        byte edad;
        boolean esNumeroValido =false;
        do {
            try {
                edad = Byte.parseByte(JOptionPane.showInputDialog("Edad"));
                JOptionPane.showMessageDialog(null, "Tu edad es: " + edad);
                esNumeroValido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes introducir un numero");
            }
        } while (!esNumeroValido);
        
    }
   
}
