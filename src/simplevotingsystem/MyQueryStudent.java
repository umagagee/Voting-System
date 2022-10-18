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
public class MyQueryStudent {
     Connection con=null;
    Statement stm=null;
    ResultSet rs=null;
    PreparedStatement ps=null;

public ArrayList<StudentNewClass> BindTable(){
ArrayList<StudentNewClass> list = new ArrayList<StudentNewClass>();
con=ConnectionToDatabase.conn();

try {
stm = con.createStatement();
rs = stm.executeQuery("SELECT * FROM student ORDER BY STUDENTID ASC ");
//String sql2="SELECT * FROM presidentcandidate,presidentvoting WHERE presidentcandidate.ID=presidentvoting.ID";
       //ps =con.prepareStatement(sql2);
       // rs=ps.executeQuery();
StudentNewClass p;
while(rs.next()){
    p = new StudentNewClass(rs.getString("STUDENTID"),rs.getString("FIRSTNAME"),rs.getString("MIDDLENAME"),rs.getString("LASTNAME"),rs.getString("GENDER"));
list.add(p);
}
} catch (Exception ex) {
JOptionPane.showMessageDialog(null, ex.getMessage());
}
return list;
}
}
    

