package poo.e13menumejorado;

import javax.swing.JOptionPane;

public class E13MenuMejorado {

    public static void main(String[] args) {
        float num1, num2, res;
        int opcion;
        //Objeto StringBuilder
        do {
            String mensaje = """
                         1. Sumar
                         2. Restar
                         3. Multiplicar
                         4. Dividir
                         5. Salir
                         
                         Elige una opcion
                         """;

            opcion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            switch (opcion) {
                case 1:
                    num1 = Float.parseFloat(JOptionPane.showInputDialog("Numero 1"));
                    num2 = Float.parseFloat(JOptionPane.showInputDialog("Numero 2"));
                    res = num1 + num2;
                    JOptionPane.showMessageDialog(null, "La suma es: " + res);
                    break;
                case 2:
                    num1 = Float.parseFloat(JOptionPane.showInputDialog("Numero 1"));
                    num2 = Float.parseFloat(JOptionPane.showInputDialog("Numero 2"));
                    res = num1 - num2;
                    JOptionPane.showMessageDialog(null, "La resta es: " + res);
                    break;
                case 3:
                    num1 = Float.parseFloat(JOptionPane.showInputDialog("Numero 1"));
                    num2 = Float.parseFloat(JOptionPane.showInputDialog("Numero 2"));
                    res = num1 * num2;
                    JOptionPane.showMessageDialog(null, "La multiplicacion es: " + res);
                    break;
                case 4:
                    num1 = Float.parseFloat(JOptionPane.showInputDialog("Numero 1"));
                    num2 = Float.parseFloat(JOptionPane.showInputDialog("Numero 2"));
                    res = num1 / num2;
                    JOptionPane.showMessageDialog(null, "La division es: " + res);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no válida");
            }
        } while (opcion != 5);

    }
}
