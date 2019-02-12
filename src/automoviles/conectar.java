/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package automoviles;
import java.sql.*; //libreria para la vinculacion
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane; //VINCULACION CON LOS ELEMENTOS DE LOS FORMULARIOS

/**
 *
 * @author USUARIO
 */
public class conectar {
    Connection con=null; //variable
    public Connection conexion () {//metodo
        try {
            
Class.forName("com.mysql.jdbc.Driver");//escoger la segunda opcion
con=DriverManager.getConnection("jdbc:mysql://localhost/automoviles","root","dario");//
System.out.println("conexion establecida");
JOptionPane.showConfirmDialog(null, "conexion establecida");
        } catch (ClassNotFoundException | SQLException e) {
            //Logger.getLogger(conectar.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error de conexion");
            JOptionPane.showConfirmDialog(null, "error de conexion"+e);
        }
        return con;
} 
}
