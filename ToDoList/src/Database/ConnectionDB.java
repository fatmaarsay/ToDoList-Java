
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConnectionDB {
     Connection conn = null;

    public Connection getConnection() {

        
        try {
            Class.forName("org.sqlite.JDBC");
             conn = DriverManager.getConnection("jdbc:sqlite:ToDoList.db");
             System.out.println("Database Bağlantısı BAŞARILI");
        }
        catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Database Bağlantısı BAŞARISIZ... HATA: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Bağlantı BAŞARISIZ... HATA: " + ex.getMessage());

        }
        return conn;
    }
}
