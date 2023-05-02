
package db3programming;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Db3programming {

    public static void main(String[] args) {
        String URL ="jdbc:mysql://hostname:port/dbname";
        String username = "root";
        String password = "mysql@sit";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            Connection con = DriverManager.getConnection(URL, username, password);
            System.out.println("Databased Connected");
            Statement statement= con.createStatement();
            String sql = "select * from student";
            ResultSet results = statement.executeQuery(sql);
            
            while(results.next()){
                System.out.println(results.getString(1)+" "+results.getString(2)+" "
                        + results.getString(3)+" "+results.getString(4)
                );
            }
        }
        catch (ClassNotFoundException ex){
        Logger.getLogger(Db3programming.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(Db3programming.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
