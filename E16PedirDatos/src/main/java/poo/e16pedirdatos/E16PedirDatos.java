//Pedir nombre y estatura de 10 personas,
//guardarlas en un arreglo y visualizar 
//los datos en pantalla

package poo.e16pedirdatos;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class E16PedirDatos {
    //Declaracion del arreglo
    private static String[] nombre;
    private static float[] estatura;
    public static void main(String[] args) {
        ImageIcon iconoUsuario = new ImageIcon("src/main/java/imagenes/usuario.png");
        ImageIcon iconoEstatura = new ImageIcon("src/main/java/imagenes/estatura.png");
        ImageIcon iconoReporte = new ImageIcon("src/main/java/imagenes/reporte.png");
        //Inicializacion del arreglo
        nombre = new String[10];
        estatura = new float[10];
        //Pedir nombres  (i+1)   i= i+1
        for (int i = 0; i < 10; i++) {
           nombre[i]=JOptionPane.showInputDialog(null, "Nombre " , "Registro " + (i+1), 0, iconoUsuario, null, null).toString();
           estatura[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Estatura de " + nombre[i], "Registro " + (i+1), 0, iconoEstatura, null, null).toString());
        }
        //Visualizar los nombres
        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            mensaje.append(nombre[i]).append("      ").append(estatura[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje, "Reporte", 0, iconoReporte);
    }
}
