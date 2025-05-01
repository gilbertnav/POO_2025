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
        
        //Guardar valores en el objeto
        paciente.setExpediente(expediente);
        paciente.setNombre(nombre);
        JOptionPane.showMessageDialog(null, "Expediente generado exitosamente");
    }
    
    public void consultarPaciente(){
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Expediente: ").append(paciente.getExpediente()+"\n");
        mensaje.append("Nombre: ").append(paciente.getNombre());
        JOptionPane.showMessageDialog(null, mensaje);
    }
           
    
}
 