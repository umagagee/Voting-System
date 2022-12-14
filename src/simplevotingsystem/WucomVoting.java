/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplevotingsystem;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class WucomVoting extends javax.swing.JFrame {
    Connection con=null;
    Statement stm=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
    String imagePath=null;
    String username;
    double per;

    /**
     * Creates new form PresidentialVoting
     */
    public WucomVoting() {
        initComponents();
        setLocationRelativeTo(null);
         con=ConnectionToDatabase.conn();
         PresidentCnadidate();
         jButton2.hide();
         jButton3.hide();
         lblFn.hide();
         lblLn.hide();
         YesNo();
    }
    
         int pos=0;
    
    //Function to Resize Image to fit into Jlabel 
    public ImageIcon ResizeImage(String imagePath,byte[] pic){
    ImageIcon myImage = null;
     if(imagePath!=null){
      myImage=new ImageIcon(imagePath);
     }
     else{
     myImage=new ImageIcon(pic);
     }
     
     Image img1 = myImage.getImage();
     Image img2 = img1.getScaledInstance(labelPicture.getWidth(),labelPicture.getHeight(),Image.SCALE_SMOOTH);
     ImageIcon image =new ImageIcon(img2);
     return image;
    };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelPicture = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblLn = new javax.swing.JLabel();
        lblFn = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "WUCOM VOTING PAGE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 48))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        labelPicture.setBackground(new java.awt.Color(255, 255, 255));
        labelPicture.setOpaque(true);

        jButton1.setBackground(new java.awt.Color(51, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("VOTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..." }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        lblLn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblLn.setText("jLabel2");

        lblFn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblFn.setText("jLabel2");

        jButton2.setBackground(new java.awt.Color(51, 255, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("YES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 255, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("NO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(labelPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(lblFn)
                        .addGap(18, 18, 18)
                        .addComponent(lblLn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLn)
                    .addComponent(lblFn))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int p = JOptionPane.showConfirmDialog(null, "Are you really Sure you  want to Vote for this Person?","Confirm",JOptionPane.YES_NO_OPTION);
        if(p==0){
            int a = JOptionPane.showConfirmDialog(null, "Are you 100% Sure, after voting no Changes?","Confirm",JOptionPane.YES_NO_OPTION);
        if(a==0){
   int counter=1;
String hold=jComboBox1.getSelectedItem().toString();

 try{
     //Selecting from initial votes
     String query="SELECT VOTES FROM wucomvoting WHERE ID='"+hold+"' ";
      // String query="SELECT VOTES FROM presidentvoting WHERE='P1' ";
     ps=con.prepareStatement(query);
     rs=ps.executeQuery();
     if(rs.next()){
     int holdCurrentVote=rs.getInt("VOTES");
     
     int total=holdCurrentVote+counter;
      
                  
     
      String sql= "update wucomvoting set  VOTES=? where ID=?";
       ps=con.prepareStatement(sql);
       ps.setInt(1,total);
       ps.setString(2,jComboBox1.getSelectedItem().toString());
       ps.executeUpdate();
       
        String sql3="Select  * from Treasurecandidate";
                 ps=con.prepareStatement(sql3);
                 rs=ps.executeQuery();
                  if(rs.next()){
                      TreasureVoting pv = new TreasureVoting();
                            pv.show();
                            this.dispose();
                      }
                  else{
                      
                         
                          Thnaks pv = new Thnaks();
                            pv.show();
                            this.dispose();
       
                           }
      
                  
       
//       JOptionPane.showMessageDialog(null,"Voting Successfully");
     }  else{
         JOptionPane.showMessageDialog(null,"Error!");
     }                                              
}catch(Exception e){
    JOptionPane.showMessageDialog(null,e.getMessage());
}
        
        
        }
        
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
String hold=jComboBox1.getSelectedItem().toString();
try{
    String sql="select FIRSTNAME,LASTNAME,IMAGE from wucomcandidate where   ID='"+hold+"' ";
    ps=con.prepareStatement(sql);
    rs=ps.executeQuery();
    if(rs.next()){
      String fName=rs.getString("FirstName");
      String lName=rs.getString("LastName");  
      byte[]pic=rs.getBytes("IMAGE");
      
      
       lblFn.setText(fName);
       lblLn.setText(lName);
      ImageIcon image=new ImageIcon(pic);
                Image im= image.getImage();
                Image myimg=im.getScaledInstance(labelPicture.getWidth(), labelPicture.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage=new ImageIcon(myimg);
                labelPicture.setIcon(newImage);
                
                lblFn.show();
                lblLn.show();
    }
    

}catch(Exception e){
    JOptionPane.showMessageDialog(null,e.getMessage());
}
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
int p = JOptionPane.showConfirmDialog(null, "Are you really Sure you  want to Vote for this Person?","Confirm",JOptionPane.YES_NO_OPTION);
        if(p==0){
            int a = JOptionPane.showConfirmDialog(null, "Are you 100% Sure, after voting no Changes?","Confirm",JOptionPane.YES_NO_OPTION);
        if(a==0){
   int counter=1;
String hold=jComboBox1.getSelectedItem().toString();

 try{
     //Selecting from initial votes
     String query="SELECT VOTES FROM wucomvoting WHERE ID='"+hold+"' ";
      // String query="SELECT VOTES FROM presidentvoting WHERE='P1' ";
     ps=con.prepareStatement(query);
     rs=ps.executeQuery();
     if(rs.next()){
     int holdCurrentVote=rs.getInt("VOTES");
     
     int total=holdCurrentVote+counter;
      
                  
     
      String sql= "update wucomvoting set  VOTES=? where ID=?";
       ps=con.prepareStatement(sql);
       ps.setInt(1,total);
       ps.setString(2,jComboBox1.getSelectedItem().toString());
       ps.executeUpdate();
       
        String sql3="Select  * from Treasurecandidate";
                 ps=con.prepareStatement(sql3);
                 rs=ps.executeQuery();
                  if(rs.next()){
                      TreasureVoting pv = new TreasureVoting();
                            pv.show();
                            this.dispose();
                      }
                  else{
                      
                         
                          Thnaks pv = new Thnaks();
                            pv.show();
                            this.dispose();
       
                           }
      
                  
       
//       JOptionPane.showMessageDialog(null,"Voting Successfully");
     }  else{
         JOptionPane.showMessageDialog(null,"Error!");
     }                                              
}catch(Exception e){
    JOptionPane.showMessageDialog(null,e.getMessage());
}
        
        
        }
        
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try{
 String sql3="Select  * from Treasurecandidate";
                 ps=con.prepareStatement(sql3);
                 rs=ps.executeQuery();
                  if(rs.next()){
                      TreasureVoting pv = new TreasureVoting();
                            pv.show();
                            this.dispose();
                      }
                  else{
                      
                         
                          Thnaks pv = new Thnaks();
                            pv.show();
                            this.dispose();
       
                           }
}catch(Exception e){
    JOptionPane.showMessageDialog(null,e.getMessage());
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
 setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WucomVoting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WucomVoting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WucomVoting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WucomVoting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WucomVoting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelPicture;
    private javax.swing.JLabel lblFn;
    private javax.swing.JLabel lblLn;
    // End of variables declaration//GEN-END:variables


void PresidentCnadidate(){
    try{
        String sql="SELECT ID FROM wucomcandidate";
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
            String id=rs.getString("ID");
        jComboBox1.addItem(id);
        }
       // JOptionPane.showMessageDialog(null, "No Candidate found");
        
    
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e.getMessage());
    
    }

}

void YesNo(){
    
    try{
         stm=con.createStatement();
                 String sql3="Select  count(ID) AS Total from wucomcandidate";
                 rs=stm.executeQuery(sql3);
                  rs.next();
                  int total=rs.getInt("total");
                  if(total==0){
                      this.setVisible(false);
                      Thnaks  fv = new    Thnaks();
                       fv.show();
                      
                  
                  }else if(total==1){
                      jButton1.hide();
                      jButton2.show();
                      jButton3.show();
                  
                  }
                  else if(total>1){
                      jButton1.show();
                      jButton2.hide();
                      jButton3.hide();
                  
                  }
       
    
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e.getMessage());
    
    }

}

}
