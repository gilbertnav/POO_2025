/*
Alumno:   
Materia: POO
Ejercicio 6: Pedir un numero entero y determinar si es par o impar 
Fecha : 6 - Marzo - 2025
Operador a utilizar:     / division entera y real
                         % residuo de una division (MOD)
               
*/
package com.mycompany.e6parimpar;
import javax.swing.JOptionPane;

public class E6ParImpar {
    public static void main(String[] args) {
        short numero;
        numero = Short.parseShort(JOptionPane.showInputDialog("Introduce un numero"));
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, numero + " es par");
        }
        if (numero % 2 == 1) {
            JOptionPane.showMessageDialog(null, numero + " es impar");
        }
    }
}
