package poo.e11switch;

import javax.swing.JOptionPane;

public class E11Switch {

    public static void main(String[] args) {
        float num1, num2, res;
        int opcion;
        //Objeto StringBuilder
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("1. Sumar\n");
        mensaje.append("2. Restar\n");
        mensaje.append("3. Multiplicar\n");
        mensaje.append("4. Dividir\n\n");
        mensaje.append("Elige una opción");
        opcion=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        switch (opcion) {
            case 1:num1 = Float.parseFloat(JOptionPane.showInputDialog("Numero 1"));
                   num2 = Float.parseFloat(JOptionPane.showInputDialog("Numero 2"));
                   res = num1 + num2;
                   JOptionPane.showMessageDialog(null, "La suma es: " + res);
                break;
            case 2:num1 = Float.parseFloat(JOptionPane.showInputDialog("Numero 1"));
                   num2 = Float.parseFloat(JOptionPane.showInputDialog("Numero 2"));
                   res = num1 - num2;
                   JOptionPane.showMessageDialog(null, "La resta es: " + res);
                break;
            case 3:num1 = Float.parseFloat(JOptionPane.showInputDialog("Numero 1"));
                   num2 = Float.parseFloat(JOptionPane.showInputDialog("Numero 2"));
                   res = num1 * num2;
                   JOptionPane.showMessageDialog(null, "La multiplicacion es: " + res);
                break;
            case 4:num1 = Float.parseFloat(JOptionPane.showInputDialog("Numero 1"));
                   num2 = Float.parseFloat(JOptionPane.showInputDialog("Numero 2"));
                   res = num1 / num2;
                   JOptionPane.showMessageDialog(null, "La division es: " + res);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion noválida");
        }
    }
}
