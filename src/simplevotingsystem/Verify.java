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
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author UMAGA GEE
 */
public final class Verify extends java.awt.Frame {
    Connection con=null;
    Statement stm=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
    String username;
    String verify;
    static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
     String GenratedCode=randomAlphaNumeric(10);
  

    

    /**
     * Creates new form Verify
     */
    public Verify( ) {
        initComponents();
        setLocationRelativeTo(null);
        // con=ConnectionToDatabase.conn();
         con=creatConnection.conn();
         votingEndTimer() ;
         
      
        Invalid.hide();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Invalid = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED))));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtVerify.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        txtVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVerifyActionPerformed(evt);
            }
        });
        jPanel1.add(txtVerify, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 270, 60));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("Verify");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 110, 60));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setText("Next Page");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 630, 190, 60));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel1.setText("VERIFICATION PAGE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel3.setText("Enter Index Number");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        Invalid.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        Invalid.setForeground(new java.awt.Color(255, 0, 0));
        Invalid.setText("*This Index Number is already Verify");
        jPanel1.add(Invalid, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Home_48px.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 640, 50, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/57.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 710));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm

    }//GEN-LAST:event_exitForm

    private void txtVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVerifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVerifyActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
homePage a=new homePage();
        this.setVisible(false);
        a.show();  

    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 String verify=txtVerify.getText().trim();
     try{
       
            if(verify.equals("")){
                JOptionPane.showMessageDialog(null, "Field is empty");

            }
            else{
                String check="Select * from student where STUDENTID='"+verify+"' " ;
                ps=con.prepareStatement(check);
                rs=ps.executeQuery();
                if(rs.next()){
                    String in= rs.getString("STUDENTID");
                    
                    //Comparing the Index Number with what the user enter with what in the student table
                    if(verify.equals(in)){
                        //Checking if the the student has already Verify
                        String sql1="Select * from verification where fk1_IndexNumber='"+verify+"' " ;
                       ps=con.prepareStatement(sql1);
                       rs=ps.executeQuery();
                       if(rs.next()){
                           Invalid.show();
                       
                       
                       }else{
                     
                       String sql="INSERT INTO Verification (FK1_INDEXNUMBER,code) values (?,?)";
                        ps=con.prepareStatement(sql);
                        ps.setString(1, txtVerify.getText().trim());
                        ps.setString(2,GenratedCode);
                        ps.execute();
                        Code C = new Code();
                    
                        C.setVisible(true);
                        txtVerify.setText("");
                        

                       }
                
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Invalid Index Number");
                    }

                }
                else{
                   JOptionPane.showMessageDialog(null, "Invalid Index Number");
                }

            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            // Invalid.show();

        }
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Menu C = new Menu();
                        C.show();
                       this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
           
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Verify().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Invalid;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static final javax.swing.JTextField txtVerify = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
void votingEndTimer(){
         
                //Store Time
         SimpleDateFormat dateFormat=new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
         Date current_dateTime = new Date(); 
          Date store_dateTime = new Date();//("yyy-MM-dd hh:mm:ss")
        String storeDateTime = dateFormat.format(current_dateTime);
        
        
        java.sql.Timestamp Curretdate = new  java.sql.Timestamp(new java.util.Date().getTime());
         java.sql.Timestamp storetdate = new  java.sql.Timestamp(new java.util.Date().getTime());
         
                 //CurrentTime
          SimpleDateFormat currentDateFormat=new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
          String currentDateTime = currentDateFormat.format(current_dateTime);
          
         // JOptionPane.showMessageDialog(null,currentDateTime);
       //  JOptionPane.showMessageDialog(null,Curretdate);
          
          try{
              con=ConnectionToDatabase.conn();
                             String sql1="Select endtime from votingends";
                   ps=con.prepareStatement(sql1);
                   rs=ps.executeQuery();
                   if(rs.last()){
                      storeDateTime = rs.getString("endtime");     //8pm                     9pm      
                      if(currentDateTime.compareTo(storeDateTime) >=0 ){
                          
                           ps=con.prepareStatement("INSERT INTO LOGOUT (SignoutTime,Username) values (?,?)");
                  //Creating instance for Date and Time
                  
                  ps.setTimestamp(1, Curretdate);
                  ps.setString(2, LogIn.UserName.getText().trim().toUpperCase());
                  ps.execute();
                  con.close();
                         JOptionPane.showMessageDialog(null,"Voting has Ended");
                          //JOptionPane.showMessageDialog(null,"Continue to vote is not Time");
                      System.exit(0);
                      }else if(Curretdate.compareTo(storetdate) <0 ){
                            //JOptionPane.showMessageDialog(null,"Voting has Ended");
                          JOptionPane.showMessageDialog(null,"Continue to vote is not Time");
                         

                      }
                   }
                 else{
                  JOptionPane.showMessageDialog(null,"Not Found");
                }
          }catch(Exception e)   {
                JOptionPane.showMessageDialog(null, e.getMessage());
          
          }   

}

 public static String randomAlphaNumeric(int count) {
StringBuilder builder = new StringBuilder();
while (count-- != 0) {
int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
builder.append(ALPHA_NUMERIC_STRING.charAt(character));
}
return builder.toString();
}
}