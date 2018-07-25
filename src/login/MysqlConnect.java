
package login;

/**
 *
 * @author Tauqeer
 */
import java.sql.*;
import javax.swing.*;
public class MysqlConnect {
    Connection conn = null;
    
    public static Connection ConnectDB(){
    
    try{
    Class.forName("com.mysql.jdbc.Driver"); //loading the driver
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/svhf","root","tauqeer");
    
    JOptionPane.showMessageDialog(null,"Connected Successfully");
    return conn;
    }catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
    return null;
    }
    }
}
