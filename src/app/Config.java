/*
 * Muhammad Aditio Kamal Ibrahim
 * 201743501232
 *
 */
package app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Aditio
 */
public class Config {
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/db_emerad"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
            System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return mysqlconfig;
    }    
}
