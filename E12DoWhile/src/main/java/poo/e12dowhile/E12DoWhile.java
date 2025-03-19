//Mostrar 10 numeros en pantalla (1-10)
package poo.e12dowhile;

import javax.swing.JOptionPane;

public class E12DoWhile {

    public static void main(String[] args) {
        int cuenta = 0;
        StringBuilder mensaje = new StringBuilder();
        do {
            //++ incremento en 1
            cuenta++; //cuenta = cuenta + 1
            mensaje.append(cuenta).append("\n");
        } while (cuenta < 10);
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
