package poo.e20estadisticaobj;

import javax.swing.JOptionPane;

public class E20EstadisticaObj {

    public static void main(String[] args) {
       OperacionesPaciente opPaciente = new OperacionesPaciente();
//       opPaciente.crearExpediente();
//       opPaciente.consultarPaciente();
        String menu = """
                      [1] Crear expediente
                      [2] Mostrar paciente
                      [3] Salir
                      
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
            }
        } while (opcion != 3);
    }
}
