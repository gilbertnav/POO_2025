package poo.e20estadisticaobj;

import javax.swing.JOptionPane;

public class OperacionesPaciente {
    //Almacena la posicion de los pacientes dentro del arreglo
    private int pos;
    //Declaración del objeto
    private Paciente paciente;
    private Paciente[] arregloPacientes;
    private int expediente;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private int edad;
    private float estatura;
    private float peso;
    private char sexo;
    
    //Constructor de la clase
    public OperacionesPaciente() {
        arregloPacientes = new Paciente[20];
        //-1 indica que no hay pacientes en el arreglo
        pos = -1;
    }

    public void crearExpediente() {
        expediente = Integer.parseInt(JOptionPane.showInputDialog("Expediente"));
        int posEnc;
        posEnc = buscarPaciente(expediente);
        if (posEnc == -1) {
            
        }else{
            JOptionPane.showMessageDialog(null, "El expediente ya existe");
        }
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
        JOptionPane.showMessageDialog(null, "Expediente generado exitosamente");
    }

    public void consultarPaciente() {
        StringBuilder mensaje = new StringBuilder();
        for (int i=0; i<=pos; i++) {
            mensaje.append("No de Expediente: ").append(arregloPacientes[i].getExpediente()).append("\n");
            mensaje.append("N o m b r e     : ").append(arregloPacientes[i].getNombre()).append("\n");
            mensaje.append("Apellido Paterno: ").append(arregloPacientes[i].getApPaterno()).append("\n");
            mensaje.append("Apellido Materno: ").append(arregloPacientes[i].getApMaterno()).append("\n");
            mensaje.append("E  d  a  d      : ").append(arregloPacientes[i].getEdad()).append("\n");
            mensaje.append("E s t a t u r a : ").append(arregloPacientes[i].getEstatura()).append("\n");
            mensaje.append("P  e  s  o      : ").append(arregloPacientes[i].getPeso()).append("\n");
            mensaje.append("S  e  x  o      : ").append(arregloPacientes[i].getSexo()).append("\n");
            mensaje.append("----------------------------------------------"); 
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    private int buscarPaciente(int expediente){
        //Posición donde encuentre el expediente en el arreglo
        int posEnc=-1;
        for (int i = 0; i <= pos; i++) {
            if (arregloPacientes[i].getExpediente()==expediente) {
                posEnc = i;
            }
        }
        return posEnc;
    }
    
    public void consultaIndividual(){
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
        }else{
            JOptionPane.showMessageDialog(null, "El expediente no existe");
        }
    }
}
