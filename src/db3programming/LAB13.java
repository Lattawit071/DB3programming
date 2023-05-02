
package db3programming;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LAB13 {

   
   public static void main(String[] args) {
        String URL ="jdbc:mysql://hostname:port/dbname";
        String username = "root";
        String password = "mysql@sit";
        
        
             
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, username, password);
            String sql = "update student set E-mail = ? where studentID = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, "xxxx@gmail.com");
            preparedStatement.setString(2, "111111");
            preparedStatement.executeUpdate();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        }
             
   

    }

}
