
package poo.e10validarfecha1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class E10ValidarFecha1 {

    public static void main(String[] args) {
        Object[] listaDia = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
        Object[] listaMes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
                        "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        ImageIcon icono = new ImageIcon("src//main//java//poo//e10validarfecha1//imagenes//calendario64.png");
        byte dia;
        String mes;
        short annio;
        dia = Byte.parseByte(JOptionPane.showInputDialog(null, "Elige el día", "Validar fecha", 0, icono, listaDia, listaDia[0]).toString()) ;
        JOptionPane.showMessageDialog(null, dia);
        mes = JOptionPane.showInputDialog(null, "Elige el mes", "Validar fecha", 0, icono, listaMes, listaMes[0]).toString();
    }
}
