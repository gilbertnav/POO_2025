/*
Alumno:   
Materia: POO
Ejercicio 3: Estructura selectiva if (Teoria)
Fecha : 5 - Marzo - 2025
*/
package poo.e3estructuraif;

import javax.swing.JOptionPane;

public class E3EstructuraIf {

    public static void main(String[] args) {
        //Operadores relacionales
        /*
            > mayor que
            < menor que
            == igual que
            >= mayor o igual
            <= menor o igual
            !=  diferente de
        */
//        int a = 34;
//        int b = 50;
//        int c = 34;
//        
//        JOptionPane.showMessageDialog(null,a +" > " + b + " = "+ (a > b));
//        JOptionPane.showMessageDialog(null,a +" = " + c + " = "+ (a == c));
//        JOptionPane.showMessageDialog(null,a +" <> " + c + " = "+ (a != c));
        int numero1, numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro numero"));
        if (numero1 == numero2) {
            JOptionPane.showMessageDialog(null, "Numeros iguales");
        }
            
        
    }
}
