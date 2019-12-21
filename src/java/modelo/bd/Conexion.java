package modelo.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {

    private static String user = "root";
    private static String password = "patito_2010";
    private static String url = "jdbc:mysql://localhost:3306/fotofelix?useUnicode=true&uiantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static String driver = "com.mysql.jdbc.Driver";

    public static Connection getConexion() {
        Connection con = null;
        try {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Conexión -> getConexion: \n" + e.getMessage());
        }
        return con;
    }
}
