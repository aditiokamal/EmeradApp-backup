/*
 * Muhammad Aditio Kamal Ibrahim
 * 201743501232
 *
 */
package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Aditio
 */
public class LoginValidation {
    Connection con;
    Statement stm;
    
    public void config(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/db_emerad", "root", "");
            stm = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal."+e.getMessage());
        }
    } 
  
}
