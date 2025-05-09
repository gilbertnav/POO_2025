package poo.e20estadisticaobj;

import javax.swing.JOptionPane;

public class E20EstadisticaObj {

    public static void main(String[] args) {
       OperacionesPaciente opPaciente = new OperacionesPaciente();
        String menu = """
                      [1] Crear expediente
                      [2] Mostrar pacientes
                      [3] consulta individual
                      [4] Salir
                      
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
            }
        } while (opcion != 4);
    }
}
