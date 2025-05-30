package poo.e20estadisticaArchivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class OpArchivo {
    private static String pathPacientes = "c:\\sistema\\paciente.txt";
    private static String pathCarpeta = "c:\\sistema";
    private static File carpeta, archivo;
    public static void crearSistema() {
        try {
            carpeta = new File(pathCarpeta);
            archivo = new File(pathPacientes);
            if (!carpeta.exists()) {
                carpeta.mkdir();
                archivo.createNewFile();
                JOptionPane.showMessageDialog(null, "Sistema creado...");
            }else{
                //Si el archivo no está vacío, carga los datos
                //en arregloPacientes
                if (archivo.length() != 0 ) {
                    cargarDatos();
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(OpArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void cargarDatos() throws FileNotFoundException, IOException {
        FileReader frPaciente = new FileReader(pathPacientes);
        BufferedReader brPaciente = new BufferedReader(frPaciente);
        Paciente paciente;
        //Mientras existan datos a leer en el archivo
        while(brPaciente.ready()){
            paciente = new Paciente();
            paciente.setExpediente(Integer.parseInt(brPaciente.readLine()));
            paciente.setNombre(brPaciente.readLine());
            paciente.setApPaterno(brPaciente.readLine());
            paciente.setApMaterno(brPaciente.readLine());
            paciente.setEdad(Integer.parseInt(brPaciente.readLine()));
            paciente.setEstatura(Float.parseFloat(brPaciente.readLine()));
            paciente.setPeso(Float.parseFloat(brPaciente.readLine()));
            paciente.setSexo(brPaciente.readLine().charAt(0));
            paciente.setEliminado(Boolean.parseBoolean(brPaciente.readLine()));
            //Incrementamos el valor de pos
            OpPaciente.pos++;
            OpPaciente.arregloPacientes[OpPaciente.pos]=paciente;
        }
        frPaciente.close();
        brPaciente.close();
    }
    
    public static void guardarExpediente() throws IOException {
        archivo.delete();
        archivo.createNewFile();
        FileWriter fwExpediente = new FileWriter(pathPacientes, true);
        PrintWriter pwExpediente = new PrintWriter(fwExpediente);
        for (int i = 0; i <=OpPaciente.pos; i++) {
           //Guardando los datos en el archivo
            pwExpediente.println(OpPaciente.arregloPacientes[i].getExpediente());
            pwExpediente.println(OpPaciente.arregloPacientes[i].getNombre());
            pwExpediente.println(OpPaciente.arregloPacientes[i].getApPaterno());
            pwExpediente.println(OpPaciente.arregloPacientes[i].getApMaterno());
            pwExpediente.println(OpPaciente.arregloPacientes[i].getEdad());
            pwExpediente.println(OpPaciente.arregloPacientes[i].getEstatura());
            pwExpediente.println(OpPaciente.arregloPacientes[i].getPeso());
            pwExpediente.println(OpPaciente.arregloPacientes[i].getSexo());
            pwExpediente.println(OpPaciente.arregloPacientes[i].isEliminado());
        }
        pwExpediente.close();
        fwExpediente.close();
           
    }
}
