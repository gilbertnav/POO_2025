package poo.e17menuestadistica;
import javax.swing.JOptionPane;

public class Paciente {
    //Controla el numero de registros del arreglo
    public static String[] nombre;
    public static float[] estatura;
    public static int pos;
    private static String pacienteBuscado;
    private static int posEnc;
    public static void registrarDatos() {
        int resp = 0;
        do {
            pos++;
            if (pos > 9) {
                pos--;
                JOptionPane.showMessageDialog(null, "Arreglo lleno");
            } else {
                nombre[pos] = JOptionPane.showInputDialog(null, "Nombre ", "Registro " + (pos + 1), 0, Sistema.iconoUsuario, null, null).toString();
                estatura[pos] = Float.parseFloat(JOptionPane.showInputDialog(null, "Estatura de " + nombre[pos], "Registro " + (pos + 1), 0, Sistema.iconoEstatura, null, null).toString());
                //JOptionPane.showMessageDialog(null, "Registro agregado");
                resp = JOptionPane.showConfirmDialog(null, "¿Agregar otro registro?", "Registro realizado...", JOptionPane.OK_CANCEL_OPTION, 0, Sistema.iconoPregunta);
                // JOptionPane.showMessageDialog(null, resp);
            }
        } while (resp == 0);
    }

    public static void mostrarReporte() {
        if (pos >= 0) {
            StringBuilder mensaje = new StringBuilder();
            for (int i = 0; i <= pos; i++) {
                mensaje.append(nombre[i]).append("      ").append(estatura[i]).append("\n");
            }
            JOptionPane.showMessageDialog(null, mensaje, "Reporte", 0, Sistema.iconoReporte);
        } else {
            JOptionPane.showMessageDialog(null, "No hay registros a mostrar", "Error", 0, Sistema.iconoError);
        }
    }

    private static int buscarNombre(String paciente) {
        //Almacena la posición del nombre buscado
        int posEnc = -1;
        for (int i = 0; i <= pos; i++) {
            if (paciente.equalsIgnoreCase(nombre[i])) {
                posEnc = i;
            }
        }
        return posEnc;
    }

    public static void consultaIndividual() {
        if (pos >= 0) {
            pacienteBuscado = JOptionPane.showInputDialog(null, "Nombre del paciente ", "Consulta Individual ", 0, Sistema.iconoBuscar, null, null).toString();
            posEnc = buscarNombre(pacienteBuscado);
            if (posEnc != -1) {
                StringBuilder mensaje = new StringBuilder();
                mensaje.append(nombre[posEnc]).append("      ").append(estatura[posEnc]).append("\n");
                JOptionPane.showMessageDialog(null, mensaje, "Paciente encontrado", 0, Sistema.iconoReporte);
            } else {
                JOptionPane.showMessageDialog(null, "Paciente no encontrado", "Error", 0, Sistema.iconoError);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay registros a mostrar", "Error", 0, Sistema.iconoError);
        }
    }

    public static void modificar() {
        if (pos >= 0) {
            pacienteBuscado = JOptionPane.showInputDialog(null, "Nombre del paciente ", "Modificar paciente ", 0, Sistema.iconoBuscar, null, null).toString();
            posEnc = buscarNombre(pacienteBuscado);
            if (posEnc != -1) {
                StringBuilder menu = new StringBuilder();
                int opc;
                String valor;
                boolean esNumValido;
                do {
                    //Limpia el menú con los datos cada vez que se repie el do-while
                    menu.delete(0, menu.capacity());
                    menu.append("Menu de modificacines\n\n");
                    //Muestra el nombre y estatura que se desea modificar
                    menu.append("1. Nombre: ").append(nombre[posEnc]).append("\n");
                    menu.append("2. Estatura: ").append(estatura[posEnc]).append("\n");
                    menu.append("3. Salir ").append("\n\n");
                    menu.append("Elige una opción...");
                    //Permite validar al usuario
                    do {
                        valor = JOptionPane.showInputDialog(null, menu, "Sesión activa: " + Sistema.usuario, 0, Sistema.iconoMenu, null, null).toString();
                        esNumValido = Sistema.esNumero(valor);
                        if (!esNumValido) {
                            JOptionPane.showMessageDialog(null, "Opción no válida", "Error", 0, Sistema.iconoError);
                        }
                    } while (!esNumValido);
                    opc = Integer.parseInt(valor);
                    switch (opc) {
                        case 1:
                            nombre[posEnc] = JOptionPane.showInputDialog(null, "Nuevo nombre:", "Nombre actual: " + nombre[posEnc], 0, Sistema.iconoUsuario, null, null).toString();
                            JOptionPane.showMessageDialog(null, "Nombre cambiado con exito", "Modificación exitosa", 0, Sistema.iconoOk);
                            break;
                        case 2:
                            estatura[posEnc] = Float.parseFloat(JOptionPane.showInputDialog(null, "Nueva estatura ", "Estatura actual de: " + nombre[posEnc], 0, Sistema.iconoEstatura, null, null).toString());
                            JOptionPane.showMessageDialog(null, "Estatura cambiada con exito", "Modificación exitosa", 0, Sistema.iconoOk);
                            break;
                        case 3:
                    }
                } while (opc != 3);
            } else {
                JOptionPane.showMessageDialog(null, "Paciente no encontrado", "Error", 0, Sistema.iconoError);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay registros a mostrar", "Error", 0, Sistema.iconoError);
        }
    }

}
