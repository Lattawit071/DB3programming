
package db3programming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LAB9 {
    public static void main(String[] args) {
        
    
        String URL ="jdbc:mysql://hostname:port/dbname";
        String username = "root";
        String password = "mysql@sit";
        
        
             
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, username, password);
            Statement statement= con.createStatement();
            String sql = "insert into student(StudentID,firstname,lastname,E-mail,deptID)"
                    +"values('111111','aaaa','bbbb','aaaa@gmail.com','IT')";
            statement.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (ClassNotFoundException ex) {
                Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
            }
            }  
            
}

