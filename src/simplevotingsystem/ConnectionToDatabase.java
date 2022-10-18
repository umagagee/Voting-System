/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplevotingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
class ConnectionToDatabase {
        public static Connection conn(){
        
         Connection con;
   String serverIP="localhost";
    String user="root";
    String pass="";
    String host="jdbc:mysql://"+serverIP+":3306/voting_db";
            try{
        // java.lang.Class.forName("com.mysql.jdbc.Driver");
         // con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegemanagementdb","root","0000");
       con=DriverManager.getConnection(host, user, pass);
        // JOptionPane.showMessageDialog(null,"Connected");
         
         return con;
}catch(Exception ex){
JOptionPane.showMessageDialog(null, ex.getMessage());

}
            return null;
}

    
}
