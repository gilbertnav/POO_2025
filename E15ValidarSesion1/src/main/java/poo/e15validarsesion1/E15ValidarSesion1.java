package poo.e15validarsesion1;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class E15ValidarSesion1 {

    public static void main(String[] args) {
        ImageIcon iconoUsuario = new ImageIcon("src/main/java/imagenes/usuario.png");
        ImageIcon iconoPassword = new ImageIcon("src/main/java/imagenes/password.png");
        ImageIcon iconoError = new ImageIcon("src/main/java/imagenes/error.png");
        //Constantes validas para el inicion de sesión
        final String USUARIO_VALIDO = "Gilberto";
        final String PASSWORD_VALIDO = "789";
        //Declaracion de las variables
        String usuario;
        String password;
        //Objeto para enmascarar la contraseña
        JPasswordField passwordOculto = new JPasswordField();
        //Pedir datos de entrada
        boolean esUsuarioValido =false;
        do {
            usuario = JOptionPane.showInputDialog(null, "Usuario" , "Validar Usuario ", 0, iconoUsuario, null, null).toString();
           //Pasamos como parámetro el objeto passwordOculto
            JOptionPane.showConfirmDialog(null, passwordOculto, "Password", JOptionPane.OK_CANCEL_OPTION, 0, iconoPassword);
            //Obtenemos la contraseña introducida guardada en el objeto passwordOculto
            password = new String(passwordOculto.getPassword());
            //Limpiar la passwordOculto
            passwordOculto.setText("");
            if (usuario.equalsIgnoreCase(USUARIO_VALIDO)
                    && password.equalsIgnoreCase(PASSWORD_VALIDO)) {
                esUsuarioValido = true;
                //JOptionPane.showMessageDialog(null, usuario + ": Bienvenido al sistema :)");
                JOptionPane.showMessageDialog(null, "Bienvenido al sistema: " + usuario, "Sistema estadísico", 0, iconoUsuario);
            } else {
              //  JOptionPane.showMessageDialog(null, "Usuario no válido");   
                JOptionPane.showMessageDialog(null, "Usuario o password incorrecto", "Error", 0, iconoError);
            }
        } while (!esUsuarioValido);
    }
}
