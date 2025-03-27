
package poo.e15validarsesion1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class E15ValidarSesion1 {

    public static void main(String[] args) {
        ImageIcon iconoReporte = new ImageIcon("src/main/java/imagenes/reporte.png");
        //Constantes validas para el inicion de sesión
        final String USUARIO_VALIDO = "alumno";
        final String PASSWORD_VALIDO = "789";
        //Declaracion de las variables
        String usuario;
        String password;
        //Objeto para enmascarar la contraseña
        JPasswordField passwordOculto = new JPasswordField();
        //Pedir datos de entrada
        boolean esUsuarioValido =false;
        do {
            usuario = JOptionPane.showInputDialog("Usuario");
           //Pasamos como parámetro el objeto passwordOculto
            JOptionPane.showConfirmDialog(null, passwordOculto, "Password", JOptionPane.OK_CANCEL_OPTION, 0, iconoReporte);
            //Obtenemos la contraseña introducida guardada en el objeto passwordOculto
            password = new String(passwordOculto.getPassword());
            //Limpiar la passwordOculto
            passwordOculto.setText("");
            if (usuario.equalsIgnoreCase(USUARIO_VALIDO)
                    && password.equalsIgnoreCase(PASSWORD_VALIDO)) {
                esUsuarioValido = true;
                JOptionPane.showMessageDialog(null, usuario + ": Bienvenido al sistema :)");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no válido");               
            }
        } while (!esUsuarioValido);
    }
}
