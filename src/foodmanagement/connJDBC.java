/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodmanagement;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author atjacp2093
 */
public class connJDBC {
    static String url = "jdbc:mysql://localhost:3306//foodmanagement";
    static String user = "root";
    static String password = "";
    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
        }
        return connection;
    }
    
}
