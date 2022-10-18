/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplevotingsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;



/**
 *
 * @author DELL
 */
public class votingTimer {
    
     Connection con=null;
    Statement stm=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
     String username;
     
     void votingEndTimer(){
         
                //Store Time
         SimpleDateFormat dateFormat=new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
         Date current_dateTime = new Date(); 
          Date store_dateTime = new Date();//("yyy-MM-dd hh:mm:ss")
        String storeDateTime = dateFormat.format(current_dateTime);
         
                 //CurrentTime
          SimpleDateFormat currentDateFormat=new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
          String currentDateTime = currentDateFormat.format(current_dateTime);
          
          JOptionPane.showMessageDialog(null,currentDateTime);
          JOptionPane.showMessageDialog(null,current_dateTime);
          
          try{
              con=ConnectionToDatabase.conn();
                             String sql1="Select endtime from votingends";
                   ps=con.prepareStatement(sql1);
                   rs=ps.executeQuery();
                   if(rs.last()){
                      store_dateTime = rs.getDate("endtime");     //8pm                     9pm      
                      if(current_dateTime.compareTo(store_dateTime) >=0 ){
                         JOptionPane.showMessageDialog(null,"Voting has Ended");
                          //JOptionPane.showMessageDialog(null,"Continue to vote is not Time");

                      }else{
                            JOptionPane.showMessageDialog(null,"Voting has Ended");
                          
                          PracticingResultCheck hp = new PracticingResultCheck();
                          hp.show();

                      }
                   }
                 else{
                  JOptionPane.showMessageDialog(null,"Not Found");
                }
          }catch(Exception e)   {
          
          }   

   
     
     }
    
}
