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
import java.text.DecimalFormat;
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
public class MyQueryFinancialVote {
     Connection con=null;
    Statement stm=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
     double per;
    DecimalFormat df2 = new DecimalFormat(" .#");

public ArrayList<NewClassVote> BindTable(){
ArrayList<NewClassVote> list = new ArrayList<NewClassVote>();
con=ConnectionToDatabase.conn();

try {
stm = con.createStatement();
rs = stm.executeQuery("SELECT * FROM financialcandidate");
//String sql2="SELECT * FROM presidentcandidate,presidentvoting WHERE presidentcandidate.ID=presidentvoting.ID";
       //ps =con.prepareStatement(sql2);
       // rs=ps.executeQuery();
NewClassVote p;
while(rs.next()){
    p = new NewClassVote(rs.getString("ID"),rs.getString("FIRSTNAME"),rs.getString("LASTNAME"),rs.getBytes("IMAGE"));
list.add(p);
}
} catch (Exception ex) {
JOptionPane.showMessageDialog(null, ex.getMessage());
}
return list;
}
}
    

