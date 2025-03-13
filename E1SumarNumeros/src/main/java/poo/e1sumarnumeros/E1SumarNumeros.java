/*
Alumno:   
Materia: POO
Ejercicio 1: Sumar 2 numeros
Fecha : 3 - Marzo - 2025
*/

package poo.e1sumarnumeros;

import javax.swing.JOptionPane;

public class E1SumarNumeros {

    private static float num1, num2, suma;

    public static void main(String[] args) {
        //float num1, num2, suma;
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Numero 1"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Numero 2"));
        suma = num1 + num2;
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
    }
}
