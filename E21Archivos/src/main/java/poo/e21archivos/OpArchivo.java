package poo.e21archivos;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class OpArchivo {
    public static void crearSistema() {
        try {
            File carpeta = new File("c:\\sistema");
            File archivo = new File("c:\\sistema\\paciente.txt");
            if (!carpeta.exists()) {
                carpeta.mkdir();
                archivo.createNewFile();
                JOptionPane.showMessageDialog(null, "Sistema creado...");
            }
        } catch (IOException ex) {
            Logger.getLogger(OpArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
