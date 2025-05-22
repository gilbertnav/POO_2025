package poo.e20estadisticaobj;

import javax.swing.JOptionPane;

public class E20EstadisticaObj {

    public static void main(String[] args) {
       OperacionesPaciente opPaciente = new OperacionesPaciente();
        String menu = """
                      [1] Crear expediente
                      [2] Mostrar pacientes
                      [3] Consulta individual
                      [4] Modificar paciente
                      [5] Baja temporal
                      [6] Restaurar expediente
                      [7] Eliminar expediente
                      [7] Eliminar expediente
                      [8] Limpiar expedientes
                      [9] Salir
                      
                      Elige una opción
                      """;
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion) {
                case 1:opPaciente.crearExpediente();
                    break;
                case 2:opPaciente.consultarPaciente();
                    break;
                case 3:opPaciente.consultaIndividual();
                    break;
                case 4: opPaciente.modificarPaciente();
                    break;
                case 5: opPaciente.bajaTemporal();
                    break;
                case 6: opPaciente.restaurarExpediente();
                    break;
                case 7: opPaciente.eliminarExpediente();
                    break;
                case 8: opPaciente.limpiarExpedientes();
                    break;
            }
        } while (opcion != 9);
    }
}
