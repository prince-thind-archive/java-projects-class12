/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raj
 */
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import javax.swing.*;
      public class Connect {
      Connection con=null;
        public static Connection ConnectDB(){
             try{
           
          Class.forName("com.mysql.jdbc.Driver");
         Connection con = (Connection)
 DriverManager.getConnection("jdbc:mysql://localhost:3306/hmsdb","root","sql");
          return con;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
    }      
    }
    }
