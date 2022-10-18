/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplevotingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author NANCY
 */
public class MyQueryPresident {
     Connection con=null;
    Statement stm=null;
    ResultSet rs=null;
    PreparedStatement ps=null;

public ArrayList<NewClass> BindTable(){
ArrayList<NewClass> list = new ArrayList<NewClass>();
con=ConnectionToDatabase.conn();

try {
stm = con.createStatement();
rs = stm.executeQuery("SELECT * FROM presidentcandidate,presidentvoting WHERE presidentcandidate.ID=presidentvoting.ID");
//String sql2="SELECT * FROM presidentcandidate,presidentvoting WHERE presidentcandidate.ID=presidentvoting.ID";
       //ps =con.prepareStatement(sql2);
       // rs=ps.executeQuery();
NewClass p;
while(rs.next()){
    p = new NewClass(rs.getString("ID"),rs.getString("FIRSTNAME"),rs.getString("LASTNAME"),rs.getString("VOTES"),rs.getBytes("IMAGE"));
list.add(p);
}
} catch (Exception ex) {
JOptionPane.showMessageDialog(null, ex.getMessage());
}
return list;
}
}
    

