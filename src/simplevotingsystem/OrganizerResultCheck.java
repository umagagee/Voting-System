/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplevotingsystem;

import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author UMAGA GEE
 */
public class OrganizerResultCheck extends java.awt.Frame {
     Connection con=null;
    Statement stm=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
     String username;
    double Total=24;
    double per;
    DecimalFormat df2 = new DecimalFormat(" .#");

    /**
     * Creates new form PracticingResultCheck
     */
    public OrganizerResultCheck() {
        initComponents();
         setLocationRelativeTo(null);
       // con=ConnectionToDatabase.conn();
        con=creatConnection.conn();
        jLabelFn.hide();
        jLabelLn.hide();
        jLabelPercent.hide();
        showCnadidate();
      
populateJTable();
//showD();
    }
    
    public void populateJTable(){
    try{
    
   
MyQueryOrganizer mq = new MyQueryOrganizer();
ArrayList<NewClass> list = mq.BindTable();
String[] columnName = {"ID","IMAGE","FIRSTNAME","","LASTNAME","VOTES"};
Object[][] rows = new Object[list.size()][6];
for(int i = 0; i < list.size(); i++){

rows[i][0] = list.get(i).getID();

if(list.get(i).getMyImage() != null){
ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getMyImage()).getImage().getScaledInstance(200, 120, Image.SCALE_SMOOTH) );
rows[i][1] = image;
}
else{
rows[i][1] = null;
}
rows[i][2] = list.get(i).getFName();
rows[i][3] = list.get(i).getLName();
rows[i][4] = list.get(i).getLName();


rows[i][5] = list.get(i).getVote();

}
Images.TheModel model  = new Images.TheModel(rows, columnName);
jTable1.setModel(model);
jTable1.setRowHeight(120);
jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);

 jTable1.getColumnModel().getColumn(3).setPreferredWidth(0);
}
    catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
     }
    void showD(){
       
      try{

  // String sql1="SELECT * FROM presidentcounter ORDER BY id DESC LIMIT 1;";
             
                     String sql2="SELECT * FROM organizercandidate,organizervoting WHERE organizercandidate.ID=organizervoting.ID";
                    ps =con.prepareStatement(sql2);
                     rs=ps.executeQuery();
                      //pst.execute();
                     jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                  
                  

    }catch(Exception e)
    {
           JOptionPane.showMessageDialog(null, e.getMessage());

    }
    }
    

 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        presidentPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelLn = new javax.swing.JLabel();
        jLabelPercent = new javax.swing.JLabel();
        uhvyjukv = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabelFn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        presidentPanel.setBorder(new javax.swing.border.MatteBorder(null));
        presidentPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        presidentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setText("ORGANIZER RESULT");
        presidentPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Logout_Rounded_Left_48px_1.png"))); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        presidentPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 140, 50));

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setRowHeight(35);
        jScrollPane1.setViewportView(jTable1);

        presidentPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 840, 410));

        jLabelLn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelLn.setText("jLabel2");
        presidentPanel.add(jLabelLn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        jLabelPercent.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelPercent.setText("jLabel2");
        presidentPanel.add(jLabelPercent, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));

        uhvyjukv.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        uhvyjukv.setForeground(new java.awt.Color(255, 0, 0));
        uhvyjukv.setText("For Percentage Click here");
        presidentPanel.add(uhvyjukv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..." }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        presidentPanel.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 210, 30));

        jLabelFn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelFn.setText("jLabel2");
        presidentPanel.add(jLabelFn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setOpaque(true);
        presidentPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 210, 190));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(presidentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1267, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(presidentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.EAST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm

    }//GEN-LAST:event_exitForm

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PracticingResultCheck rc = new PracticingResultCheck();
        rc.show();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
 String hold=jComboBox2.getSelectedItem().toString();
try{
    
    
    String sql="select FIRSTNAME,LASTNAME,IMAGE from organizercandidate where   ID='"+hold+"' ";
    ps=con.prepareStatement(sql);
    rs=ps.executeQuery();
    if(rs.next()){
      String fName=rs.getString("FirstName");
      String lName=rs.getString("LastName");  
      byte[]pic=rs.getBytes("IMAGE");
      
      
       jLabelFn.setText(fName);
       jLabelLn.setText(lName);
      ImageIcon image=new ImageIcon(pic);
                Image im= image.getImage();
                Image myimg=im.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage=new ImageIcon(myimg);
                jLabel2.setIcon(newImage);
                
        //Selecting from initial votes
     String query="SELECT VOTES FROM organizervoting WHERE ID='"+hold+"' ";
      // String query="SELECT VOTES FROM presidentvoting WHERE='P1' ";
     ps=con.prepareStatement(query);
     rs=ps.executeQuery();
     if(rs.next()){
     int holdTotalVote=rs.getInt("VOTES");
     
      stm=con.createStatement();
     String sql4="Select  count(fk1_IndexNumber) AS TotalVerify from verification";
                  rs=stm.executeQuery(sql4);
                  rs.next();
                  double numberOfStudentverify=rs.getInt("TotalVerify"); //Storing number of people verified
                 
                 
                  per=(holdTotalVote/numberOfStudentverify)*100;
                  String percentage = Double.toString(per); 
                  String fnalPercentaeg=percentage+"%";
                  jLabelPercent.setText(fnalPercentaeg);
        }        
                
         jLabelFn.show();
         jLabelLn.show();
         jLabelPercent.show();
    }
    

}catch(Exception e){
    JOptionPane.showMessageDialog(null,e.getMessage());
}
    }//GEN-LAST:event_jComboBox2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrganizerResultCheck().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFn;
    private javax.swing.JLabel jLabelLn;
    private javax.swing.JLabel jLabelPercent;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel presidentPanel;
    private javax.swing.JLabel uhvyjukv;
    // End of variables declaration//GEN-END:variables
void updateResult(){

}

void showCnadidate(){
try{
    String sql="Select ID from organizercandidate";
    ps=con.prepareStatement(sql);
    rs=ps.executeQuery();
    while(rs.next()){
        String dp = rs.getString("ID");
    jComboBox2.addItem(dp);
    }

}catch(Exception e){
    JOptionPane.showMessageDialog(null,e.getMessage());
    
}

}
    
}
