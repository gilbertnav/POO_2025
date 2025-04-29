package poo.e17menuestadistica;
import javax.swing.JOptionPane;
public class E17MenuEstadistica {
    public static void main(String[] args) {
        
        Sistema.inicializarSistema();
        boolean esUsuarioValido = Sistema.validarUsuario();
        //Si el usuario es válido damos la bienvenida y mostramos el menú
        if (esUsuarioValido) {
            JOptionPane.showMessageDialog(null, "Bienvenido al sistema: " + Sistema.usuario, "Sistema estadísico", 0, Sistema.iconoUsuario);
            String menu = """
                            Menu de opciones
                          
                            [1] Registrar 
                            [2] Consulta Individual
                            [3] Modificacion
                            [4] Reporte
                            [5] Salir
                             
                            Elige una opción""";
                                            
                             
            int opcion;
            //Se saldrá del menú hasta que se elija la opción 5
            do {
                boolean esNumValido;
                String valor;
                //Permite validar al usuario
                do {
                    valor = JOptionPane.showInputDialog(null, menu, "Sesión activa: " + Sistema.usuario, 0, Sistema.iconoMenu, null, null).toString();
                    esNumValido = Sistema.esNumero(valor);
                    if (!esNumValido) {
                        JOptionPane.showMessageDialog(null, "Opcion no valida");
                    }
                } while (!esNumValido);
                opcion = Integer.parseInt(valor);
                //Si el valor de opción está en el rango de 1 a 4 es una opción válida
                if (opcion >= 1 && opcion <= 5) {
                    switch (opcion) {
                        case 1: Paciente.registrarDatos();
                            break;
                        case 2: Paciente.consultaIndividual();
                            break;
                        case 3: Paciente.modificar();
                            break;
                        case 4: Paciente.mostrarReporte();
                            break;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Opcion no válida", "Error", 0, Sistema.iconoError);
                }
            } while (opcion != 5);
        } else {
            JOptionPane.showMessageDialog(null, "Intentos agotados", "Sesión denegada", 0, Sistema.iconoSesionDenegada);
        }
    }
}
