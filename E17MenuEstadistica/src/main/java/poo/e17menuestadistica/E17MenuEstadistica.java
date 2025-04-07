package poo.e17menuestadistica;

import javax.swing.JOptionPane;

public class E17MenuEstadistica {

   
  
    public static void main(String[] args) {
      
        Paciente.inicializarSistema();
        boolean esUsuarioValido = Paciente.validarUsuario();
        //Si el usuario es válido damos la bienvenida y mostramos el menú
        if (esUsuarioValido) {
            JOptionPane.showMessageDialog(null, "Bienvenido al sistema: " + Paciente.usuario, "Sistema estadísico", 0, Paciente.iconoUsuario);
            String menu = """
                             Menu de opciones
                             
                             [1] Registrar
                             [2] Reporte
                             [3] Salir
                             
                             Elige una opción
                             """;
            int opcion;
            do {
                boolean esNumValido;
                String valor;

                do {
                    valor = JOptionPane.showInputDialog(null, menu, "Sesión activa: " + Paciente.usuario, 0, Paciente.iconoMenu, null, null).toString();
                    esNumValido = Paciente.esNumero(valor);
                    if (!esNumValido) {
                        JOptionPane.showMessageDialog(null, "Opcion no valida");
                    }
                } while (!esNumValido);
                opcion = Integer.parseInt(valor);

                switch (opcion) {
                    case 1:
                        Paciente.registrarDatos();
                        break;
                    case 2:
                        Paciente.mostrarReporte();
                        break;
                    case 3:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no válida", "Error", 0, Paciente.iconoError);
                }
            } while (opcion != 3);
        } else {
            JOptionPane.showMessageDialog(null, "Intentos agotados", "Sesión denegada", 0, Paciente.iconoSesionDenegada);
        }
    }

   
}
