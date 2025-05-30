package poo.e20estadisticaArchivo;

import java.io.IOException;
import javax.swing.JOptionPane;

public class OpPaciente {

    //Almacena la posicion de los pacientes dentro del arreglo
    public static int pos = -1;
    //Declaración del objeto
    private Paciente paciente;
    //Para poder accederlo desde cualquier clase
    //se comporta como una variable global del sistema
    public static Paciente[] arregloPacientes = new Paciente[20];
    private int expediente;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private int edad;
    private float estatura;
    private float peso;
    private char sexo;

    public void crearExpediente() throws IOException {
        expediente = Integer.parseInt(JOptionPane.showInputDialog("Expediente"));
        int posEnc;
        posEnc = buscarPaciente(expediente);
        if (posEnc == -1) {
            paciente = new Paciente();
            //Guardar valores en variables locales

            nombre = JOptionPane.showInputDialog("Nombre");
            apPaterno = JOptionPane.showInputDialog("Apellido Paterno");
            apMaterno = JOptionPane.showInputDialog("Apellido Materno");
            edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
            estatura = Float.parseFloat(JOptionPane.showInputDialog("Estatura"));
            peso = Float.parseFloat(JOptionPane.showInputDialog("Peso"));
            sexo = JOptionPane.showInputDialog("Sexo").charAt(0);

            //Guardar valores en el objeto
            paciente.setExpediente(expediente);
            paciente.setNombre(nombre);
            paciente.setApPaterno(apPaterno);
            paciente.setApMaterno(apMaterno);
            paciente.setEdad(edad);
            paciente.setEstatura(estatura);
            paciente.setPeso(peso);
            paciente.setSexo(sexo);
            //Aumentamos en 1 el valor de pos
            pos++;
            //Guardamos el objeto en el arreglo
            arregloPacientes[pos] = paciente;
            //Guardando el arreglo en el archivo
            OpArchivo.guardarExpediente();
            JOptionPane.showMessageDialog(null, "Expediente generado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "El expediente ya existe");
        }
    }

    public void consultarPaciente() {
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Exp.       N O M B R E        EDAD   ESTATURA   PESO   SEXO\n");
        mensaje.append("____________________________________________________________\n");
        for (int i = 0; i <= pos; i++) {
            if (!arregloPacientes[i].isEliminado()) {
                mensaje.append(arregloPacientes[i].getExpediente() +"----");
                mensaje.append(arregloPacientes[i].getNombre() + " ");
                mensaje.append(arregloPacientes[i].getApPaterno() +" ");
                mensaje.append(arregloPacientes[i].getApMaterno() + " ---- ");
                mensaje.append(arregloPacientes[i].getEdad()+" años ---- ");
                mensaje.append(arregloPacientes[i].getEstatura()+ " m ---- ");
                mensaje.append(arregloPacientes[i].getPeso()+ " Kg. ---- ");
                mensaje.append(arregloPacientes[i].getSexo()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }

    private int buscarPaciente(int expediente) {
        //Posición donde encuentre el expediente en el arreglo
        int posEnc = -1;
        for (int i = 0; i <= pos; i++) {
            if (arregloPacientes[i].getExpediente() == expediente &&
                !arregloPacientes[i].isEliminado()    ) {
                posEnc = i;
            }
        }
        return posEnc;
    }
    
    private int buscarPacienteEliminado(int expediente) {
        //Posición donde encuentre el expediente en el arreglo
        int posEnc = -1;
        for (int i = 0; i <= pos; i++) {
            if (arregloPacientes[i].getExpediente() == expediente &&
                arregloPacientes[i].isEliminado()    ) {
                posEnc = i;
            }
        }
        return posEnc;
    }

    public void consultaIndividual() {
        expediente = Integer.parseInt(JOptionPane.showInputDialog("Expediente"));
        int posEnc;
        posEnc = buscarPaciente(expediente);
        if (posEnc != -1) {
            StringBuilder mensaje = new StringBuilder();
            mensaje.append("No de Expediente: ").append(arregloPacientes[posEnc].getExpediente()).append("\n");
            mensaje.append("N o m b r e     : ").append(arregloPacientes[posEnc].getNombre()).append("\n");
            mensaje.append("Apellido Paterno: ").append(arregloPacientes[posEnc].getApPaterno()).append("\n");
            mensaje.append("Apellido Materno: ").append(arregloPacientes[posEnc].getApMaterno()).append("\n");
            mensaje.append("E  d  a  d      : ").append(arregloPacientes[posEnc].getEdad()).append("\n");
            mensaje.append("E s t a t u r a : ").append(arregloPacientes[posEnc].getEstatura()).append("\n");
            mensaje.append("P  e  s  o      : ").append(arregloPacientes[posEnc].getPeso()).append("\n");
            mensaje.append("S  e  x  o      : ").append(arregloPacientes[posEnc].getSexo()).append("\n");
            JOptionPane.showMessageDialog(null, mensaje);
        } else {
            JOptionPane.showMessageDialog(null, "El expediente no existe");
        }
    }

    public void modificarPaciente() {
        expediente = Integer.parseInt(JOptionPane.showInputDialog("Expediente a modificar"));
        int posEnc;
        posEnc = buscarPaciente(expediente);
        if (posEnc != -1) {
            StringBuilder menu = new StringBuilder();
            int opc;
            do {
                menu.delete(0, menu.capacity());
                menu.append("Exp. Num. ").append(arregloPacientes[posEnc].getExpediente() + "\n");
                menu.append("[1] Nombre: ").append(arregloPacientes[posEnc].getNombre() + "\n");
                menu.append("[2] Ap Paterno: ").append(arregloPacientes[posEnc].getApPaterno() + "\n");
                menu.append("[3] Ap Materno: ").append(arregloPacientes[posEnc].getApMaterno() + "\n");
                menu.append("[4] Edad: ").append(arregloPacientes[posEnc].getEdad() + "\n");
                menu.append("[5] Estatura: ").append(arregloPacientes[posEnc].getEstatura() + "\n");
                menu.append("[6] Sexo: ").append(arregloPacientes[posEnc].getSexo() + "\n");
                menu.append("[7] Peso: ").append(arregloPacientes[posEnc].getPeso() + "\n");
                menu.append("[8] Salir \n\n ");
                menu.append("Elige una opción ");
                opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
                switch (opc) {
                    case 1:
                        nombre = JOptionPane.showInputDialog("Nombre");
                        arregloPacientes[posEnc].setNombre(nombre);
                        break;
                    case 2:
                        apPaterno = JOptionPane.showInputDialog("Apellido paterno");
                        arregloPacientes[posEnc].setApPaterno(apPaterno);
                        break;
                    case 3:
                        apMaterno = JOptionPane.showInputDialog("Apellido materno");
                        arregloPacientes[posEnc].setApMaterno(apMaterno);
                        break;
                }
            } while (opc != 8);
        }else{
            JOptionPane.showMessageDialog(null, "Expediente no encontrado");
        }

    }
    
    public void bajaTemporal(){
        expediente = Integer.parseInt(JOptionPane.showInputDialog("Expediente a eliminar"));
        int posEnc;
        posEnc = buscarPaciente(expediente);
        if (posEnc != -1) {
            arregloPacientes[posEnc].setEliminado(true);
            JOptionPane.showMessageDialog(null, "Expediente eliminado");
        }else{
            JOptionPane.showMessageDialog(null, "Expediente no encontrado");
        }
    }
    
    public void restaurarExpediente(){
        
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Exp.   N O M B R E\n");
        for (int i = 0; i <= pos; i++) {
            if (arregloPacientes[i].isEliminado()) {
                mensaje.append(arregloPacientes[i].getExpediente() + "-------");
                mensaje.append(arregloPacientes[i].getNombre() + " ");
                mensaje.append(arregloPacientes[i].getApPaterno()+ " ");
                mensaje.append(arregloPacientes[i].getApMaterno()+ "\n");
            }
        }
        mensaje.append("\nExpediente a restaurar...");
        expediente = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        int posEnc;
        posEnc = buscarPacienteEliminado(expediente);
        if (posEnc != -1) {
            arregloPacientes[posEnc].setEliminado(false);
            JOptionPane.showMessageDialog(null, "Expediente restaurado");
        }else{
            JOptionPane.showMessageDialog(null, "Expediente no encontrado");
        }
    }
    
    public void eliminarExpediente(){
        expediente = Integer.parseInt(JOptionPane.showInputDialog("Expediente a eliminar"));
        int posEnc;
        posEnc = buscarPaciente(expediente);
        if (posEnc != -1) {
            //Si el expedientes es el último registrado en el  arreglo
            if (posEnc == pos) {
                arregloPacientes[posEnc] = null;
                pos--;
            }else{
                for (int i = posEnc+1; i <=pos; i++) {
                    arregloPacientes[i-1]=arregloPacientes[i];
                }
                arregloPacientes[pos] = null;
                pos--;
            }
            JOptionPane.showMessageDialog(null, "Expediente eliminado");
        }else{
            JOptionPane.showMessageDialog(null, "Expediente no encontrado");
        }
    }
    //Elimina los expedientes con baja temporal
    public void limpiarExpedientes(){
        int noEliminados=0;
        //Cuenta cuantos registros no están eliminados
        for (int i = 0; i <=pos; i++) {
            if (!arregloPacientes[i].isEliminado()) 
                noEliminados++;
        }
        //Creamos arregloAux para los registros que no esté eliminados
        Paciente[] arregloAux = new Paciente[noEliminados];
        int indice=0;
        for (int i = 0; i <=pos; i++) {
            //Si el registro no está eliminado lo guardamos arregloAux
            if (!arregloPacientes[i].isEliminado()) 
               arregloAux[indice++] = arregloPacientes[i];
        }
        //Copiamos el arregloAux al arreglo original
        arregloPacientes = arregloAux;
        //modificamos el valor de pos de acuerdo el numero de
        //registros que no estén eliminados.
        pos =noEliminados -1;
    }
}
