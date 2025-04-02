package poo.e17menuestadistica;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class E17MenuEstadistica {

    private static String usuario;
    private static String[] nombre;
    private static float[] estatura;
    private static ImageIcon iconoUsuario, iconoPassword, iconoError, iconoSesionDenegada;
    private static ImageIcon iconoRegistrar, iconoEstatura, iconoReporte, iconoMenu;

    public static void main(String[] args) {
        inicializarSistema();
        boolean esUsuarioValido = validarUsuario();
        //Si el usuario es válido damos la bienvenida y mostramos el menú
        if (esUsuarioValido) {
            JOptionPane.showMessageDialog(null, "Bienvenido al sistema: " + usuario, "Sistema estadísico", 0, iconoUsuario);
            String menu = """
                             Menu de opciones
                             
                             [1] Registrar
                             [2] Reporte
                             [3] Salir
                             
                             Elige una opción
                             """;
            int opcion;
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Sesión activa: " + usuario, 0, iconoMenu, null, null).toString());
                switch (opcion) {
                    case 1:
                        registrarDatos();
                        break;
                    case 2:
                        mostrarReporte();
                        break;
                    case 3:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no válida", "Error", 0, iconoError);
                }
            } while (opcion != 3);
        } else {
            JOptionPane.showMessageDialog(null, "Intentos agotados", "Sesión denegada", 0, iconoSesionDenegada);
        }
    }

    //Metod que no devuelve valor y no necesita paràmetro
    private static void inicializarSistema() {
        String path = "src/main/java/imagenes/";
        iconoUsuario = new ImageIcon(path + "usuario.png");
        iconoPassword = new ImageIcon(path + "password.png");
        iconoError = new ImageIcon(path + "error.png");
        iconoSesionDenegada = new ImageIcon(path + "denegado.png");
        iconoRegistrar = new ImageIcon(path + "registrar.png");
        iconoEstatura = new ImageIcon(path + "estatura.png");
        iconoReporte = new ImageIcon(path + "reporte.png");
        iconoMenu = new ImageIcon(path + "menuPrincipal.png");
        nombre = new String[10];
        estatura = new float[10];
    }

    private static boolean validarUsuario() {
        //Constantes validas para el inicion de sesión
        final String USUARIO_VALIDO = "Gilberto";
        final String PASSWORD_VALIDO = "789";
        //Declaracion de las variables
        String password;
        //Objeto para enmascarar la contraseña
        JPasswordField passwordOculto = new JPasswordField();
        //Pedir datos de entrada
        boolean esUsuarioValido = false;
        int intentosFallidos = 0;
        do {
            usuario = JOptionPane.showInputDialog(null, "Usuario", "Validar Usuario ", 0, iconoUsuario, null, null).toString();
            //Pasamos como parámetro el objeto passwordOculto
            JOptionPane.showConfirmDialog(null, passwordOculto, "Password", JOptionPane.OK_CANCEL_OPTION, 0, iconoPassword);
            //Obtenemos la contraseña introducida guardada en el objeto passwordOculto
            password = new String(passwordOculto.getPassword());
            //Limpiar la passwordOculto
            passwordOculto.setText("");
            if (usuario.equalsIgnoreCase(USUARIO_VALIDO)
                    && password.equalsIgnoreCase(PASSWORD_VALIDO)) {
                esUsuarioValido = true;
            } else {
                intentosFallidos++;
                JOptionPane.showMessageDialog(null, "Usuario o password incorrecto", "Error", 0, iconoError);
            }
        } while (!esUsuarioValido && intentosFallidos < 3);
        return esUsuarioValido;
    }

    private static void registrarDatos() {
        for (int i = 0; i < 10; i++) {
            nombre[i] = JOptionPane.showInputDialog(null, "Nombre ", "Registro " + (i + 1), 0, iconoUsuario, null, null).toString();
            estatura[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Estatura de " + nombre[i], "Registro " + (i + 1), 0, iconoEstatura, null, null).toString());
        }
    }

    private static void mostrarReporte() {
        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            mensaje.append(nombre[i]).append("      ").append(estatura[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje, "Reporte", 0, iconoReporte);
    }

    public static boolean esNumero(String valor) {
        long numero;
        try {
            numero = Long.parseLong(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
