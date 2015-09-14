
package app;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author luck
 */
public class App {

     public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Screensize pantalla= new Screensize();
        Login a = new Login();
        a.setVisible(true);
        a.setBounds((pantalla.ancho / 2) - (a.getWidth() / 2), (pantalla.alto / 2) - (a.getHeight() / 2),a.getWidth(),a.getHeight());
    }
}
