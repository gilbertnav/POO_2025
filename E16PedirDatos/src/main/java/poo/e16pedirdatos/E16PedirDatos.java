//Pedir nombre y estatura de 10 personas,
//guardarlas en un arreglo y visualizar 
//los datos en pantalla

package poo.e16pedirdatos;

import javax.swing.JOptionPane;

public class E16PedirDatos {
    //Declaracion del arreglo
    private static String[] nombre;
    private static float[] estatura;
    public static void main(String[] args) {
        //Inicializacion del arreglo
        nombre = new String[10];
        estatura = new float[10];
        //Pedir nombres
        for (int i = 0; i < 10; i++) {
            nombre[i] = JOptionPane.showInputDialog("Nombre " + (i+1));
        }
        //Visualizar los nombres
        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            mensaje.append(nombre[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
