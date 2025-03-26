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
        ImageIcon iconoUsuario = new ImageIcon("src/main/java/poo/e16pedirdatos/usuario.png");
        ImageIcon iconoEstatura = new ImageIcon("src/main/java/poo/e16pedirdatos/estatura.png");
        ImageIcon iconoReporte = new ImageIcon("src/main/java/poo/e16pedirdatos/reporte.png");
        //Inicializacion del arreglo
        nombre = new String[10];
        estatura = new float[10];
        //Pedir nombres
        for (int i = 0; i < 10; i++) {
            nombre[i]=JOptionPane.showInputDialog(null, "Nombre" + (i+1), "Recopilar datos", 0, iconoUsuario, null, null).toString();
           // nombre[i] = JOptionPane.showInputDialog("Nombre " + (i+1));
           estatura[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Estatura de " + nombre[i], "Recopilar datos", 0, iconoEstatura, null, null).toString());
           // estatura[i] = Float.parseFloat(JOptionPane.showInputDialog("Estatura de " + nombre[i]));
        }
        //Visualizar los nombres
        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            mensaje.append(nombre[i]).append("      ").append(estatura[i]).append("\n");
        }
        //JOptionPane.showMessageDialog(null, mensaje);
        JOptionPane.showMessageDialog(null, mensaje, "Reporte", 0, iconoReporte);
    }
}
