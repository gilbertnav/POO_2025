package poo.e19validacion2;

import javax.swing.JOptionPane;

public class E19Validacion2 {

    public static void main(String[] args) {
        boolean esNumValido;
        String valor;
        byte edad;
        do{
            valor = JOptionPane.showInputDialog("Edad:");
            esNumValido = esNumero(valor);
            if (!esNumValido) {
                JOptionPane.showMessageDialog(null, "Edad no valida");
            }
        }while(!esNumValido);
    }

    public static boolean esNumero(String valor) {
        long numero;
        try {
            numero = Long.parseLong(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
