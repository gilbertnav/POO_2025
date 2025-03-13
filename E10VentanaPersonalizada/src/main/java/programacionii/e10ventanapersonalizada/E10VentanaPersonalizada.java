/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package programacionii.e10ventanapersonalizada;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class E10VentanaPersonalizada {

    public static void main(String[] args) {
        //Declaracion del objeto para manejar el icono 
        ImageIcon icono;
        icono = new ImageIcon("src//main//java//programacionii//e10ventanapersonalizada//calculadora.png");
        //Areglos de objetos
        Object[] dia = {1, 2, 3, 4, 5, 6, 7};
      //  Object[] mes = {"Enero", "Febrero", "Marzo"};
        //Guarda la opción seleccionada por el usuario
        Object opcionElegida;
        JOptionPane.showMessageDialog(null, "Tu promedio es", "Promedio del semestre", 0, icono);
        double cuadrado, numero;
        opcionElegida = JOptionPane.showInputDialog(null, "Calificacion 1", "Prueba", 0, icono, dia, dia[1]);
        if (opcionElegida == null) {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningún día");
        } else {
            //Convirtiendo el valor Object a un tipo double
            numero = Double.parseDouble(opcionElegida.toString());
            cuadrado = Math.pow(numero, 2);
            JOptionPane.showMessageDialog(null, "Cuadrado: " + cuadrado);
        }
        // JOptionPane.showInputDialog(null, "Elige el mes", "Prueba", 0, icono, mes, mes[1]);
    }
}
