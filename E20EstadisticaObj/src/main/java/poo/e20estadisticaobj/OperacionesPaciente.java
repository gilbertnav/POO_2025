package poo.e20estadisticaobj;

import javax.swing.JOptionPane;

public class OperacionesPaciente {
    //Declaración del objeto
    private Paciente paciente;
    private int expediente;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private int edad;
    private float estatura;
    private float peso;
    private char sexo;
    
    public void crearExpediente(){
        paciente = new Paciente();
        //Guardar valores en variables locales
        expediente = Integer.parseInt(JOptionPane.showInputDialog("Expediente"));
        nombre = JOptionPane.showInputDialog("Nombre");
        apPaterno = JOptionPane.showInputDialog("Apellido Paterno");
        apMaterno = JOptionPane.showInputDialog("Apellido Materno");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
        estatura = Float.parseFloat(JOptionPane.showInputDialog("Estatura"));
        peso = Float.parseFloat(JOptionPane.showInputDialog("Estatura"));
        sexo = JOptionPane.showInputDialog("Estatura").charAt(0);
        
        //Guardar valores en el objeto
        paciente.setExpediente(expediente);
        paciente.setNombre(nombre);
        paciente.setApPaterno(apPaterno);
        paciente.setApMaterno(apMaterno);
        paciente.setEdad(edad);
        paciente.setEstatura(estatura);
        paciente.setPeso(peso);
        paciente.setSexo(sexo);
        
        JOptionPane.showMessageDialog(null, "Expediente generado exitosamente");
    }
    
    public void consultarPaciente(){
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("No de Expediente: ").append(paciente.getExpediente()).append("\n");
        mensaje.append("N o m b r e     : ").append(paciente.getNombre()).append("\n");
        mensaje.append("Apellido Paterno: ").append(paciente.getApPaterno()).append("\n");
        mensaje.append("Apellido Materno: ").append(paciente.getApMaterno()).append("\n");
        mensaje.append("E  d  a  d      : ").append(paciente.getEdad()).append("\n");
        mensaje.append("E s t a t u r a : ").append(paciente.getEstatura()).append("\n");
        mensaje.append("P  e  s  o      : ").append(paciente.getPeso()).append("\n");
        mensaje.append("S  e  x  o      : ").append(paciente.getSexo()).append("\n");
        JOptionPane.showMessageDialog(null, mensaje);
    }
           
    
}
 