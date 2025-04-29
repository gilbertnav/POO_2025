package poo.e17menuestadistica;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
public class Sistema {
    public static String usuario;
    public static ImageIcon  iconoUsuario,iconoPassword, iconoError, iconoSesionDenegada, iconoBuscar, iconoOk;
    public static ImageIcon iconoRegistrar, iconoEstatura, iconoReporte, iconoMenu, iconoInformacion, iconoPregunta;
     //Metodo que no devuelve valor y no necesita paràmetro
    public  static void inicializarSistema() {
        String path = "src/main/java/imagenes/";
        iconoBuscar = new ImageIcon(path + "buscar.png");
        iconoInformacion = new ImageIcon(path + "informacion.png");
        iconoPregunta = new ImageIcon(path + "pregunta.png");
        iconoUsuario = new ImageIcon(path + "usuario.png");
        iconoPassword = new ImageIcon(path + "password.png");
        iconoError = new ImageIcon(path + "error.png");
        iconoSesionDenegada = new ImageIcon(path + "denegado.png");
        iconoRegistrar = new ImageIcon(path + "registrar.png");
        iconoEstatura = new ImageIcon(path + "estatura.png");
        iconoReporte = new ImageIcon(path + "reporte.png");
        iconoMenu = new ImageIcon(path + "menuPrincipal.png");
        iconoOk = new ImageIcon(path + "ok.png");
        Paciente.nombre = new String[10];
        Paciente.estatura = new float[10];
        Paciente.pos = -1;
    }
    
    public static boolean validarUsuario() {
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
    
    public static boolean esNumero(String valor) {
        //  long numero;
        try {
            Long.valueOf(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
