/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplevotingsystem;
import Images.TheModel;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author NANCY
 */
public class VotePresident extends javax.swing.JFrame {
       Connection con=null;
    Statement stm=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
     String verify;
     double per;
    DecimalFormat df2 = new DecimalFormat(" .#");

    /**
     * Creates new form JTableWithImage
     */
    public VotePresident(  ) {
        initComponents();
         setLocationRelativeTo(null);
         //con=ConnectionToDatabase.conn();
          con=creatConnection.conn();
         this.verify=verify;
        populateJTable();
         jButton3.hide();
         YesNo();
        
              
//         try{
////
//            stm=con.createStatement();
//            String sql="Select  count(AKUA) AS Total from presidentvote";
//            rs=stm.executeQuery(sql);
//            rs.next();
//                      double numberOfStudentverify=50;
//                     double contact=rs.getInt("Total");
//                  per=(contact/numberOfStudentverify)*100;
//                   String total= contact+""+df2.format(per)+"%";
//                    //String total=PPA.setText(contact+"   "+df2.format(per)+"%");
//                     jTextField1.setText(total);
//                     
//                       //  String sql21="INSERT INTO presidentcounter(AKUA) VALUES('14 14%')";
//
//            // String sql2="INSERT INTO presidentcounter(AKUA) VALUES("+contact+" "+df2.format(per)+"%"+")";
//             String sql2="INSERT INTO presidentcounter(AKUA) VALUES('"+contact+"'' ' '"+df2.format(per)+"%"+"')";
//            ps=con.prepareStatement(sql2);
//                ps.execute();
//    
//    }catch(Exception e){
//    JOptionPane.showMessageDialog(null, e.getMessage());
//    }
        
        
    }

   
    
    
    

    // create a methode to populate data Into JTable from Mysql database And Displaying Picture
public void populateJTable(){
    try{
    
   
MyQueryPresidentVote mq = new MyQueryPresidentVote();
ArrayList<NewClassVote> list = mq.BindTable();
String[] columnName = {"Id","firstname","lastname","image"};
Object[][] rows = new Object[list.size()][4];
for(int i = 0; i < list.size(); i++){
rows[i][0] = list.get(i).getID();
rows[i][1] = list.get(i).getFName();
rows[i][2] = list.get(i).getLName();
if(list.get(i).getMyImage() != null){
ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getMyImage()).getImage().getScaledInstance(200, 120, Image.SCALE_SMOOTH) );
rows[i][3] = image;
}
else{
rows[i][3] = null;
}
}
TheModel model  = new TheModel(rows, columnName);
jTable1.setModel(model);
jTable1.setRowHeight(120);
jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
}
    catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setText("PRESIDENTIAL VOTING PAGE");

        jButton3.setBackground(new java.awt.Color(51, 255, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("NO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(355, 355, 355))
            .addGroup(layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
          int index=jTable1.getSelectedRow();
          TableModel model=jTable1.getModel();
          String vote=model.getValueAt(index, 0).toString().toUpperCase().trim();
         // JOptionPane.showMessageDialog(null,vote);
          
             int p = JOptionPane.showConfirmDialog(null, "Are you really Sure you  want to Vote for this Person?","Confirm",JOptionPane.YES_NO_OPTION);
        if(p==0){
            int a = JOptionPane.showConfirmDialog(null, "Are you 100% Sure, after voting no Changes?","Confirm",JOptionPane.YES_NO_OPTION);
        if(a==0){
   int counter=1;

 try{
     //Selecting from initial votes
     String query="SELECT VOTES FROM presidentvoting WHERE ID='"+vote+"' ";
      // String query="SELECT VOTES FROM presidentvoting WHERE='P1' ";
     ps=con.prepareStatement(query);
     rs=ps.executeQuery();
     if(rs.next()){
     int holdCurrentVote=rs.getInt("VOTES");
     
     int total=holdCurrentVote+counter;
      stm=con.createStatement();
      //Counting number of people veried
     
     
      String sql= "update presidentvoting set  VOTES=? where ID=?";
       ps=con.prepareStatement(sql);
       ps.setInt(1,total);
       ps.setString(2,vote);
       ps.executeUpdate();
       
            Thnaks pv = new Thnaks();
                     pv.show();
                     this.dispose();

                    
       
       //JOptionPane.showMessageDialog(null,"Voting Successfully");
     }  else{
         JOptionPane.showMessageDialog(null,"Error!");
     }                                              
}catch(Exception e){
    JOptionPane.showMessageDialog(null,e.getMessage());
}
        
        
        }
        
        
        }
          
      
     
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 int p = JOptionPane.showConfirmDialog(null, "Are you really Sure you  want to Skip Person?","Confirm",JOptionPane.YES_NO_OPTION);
        if(p==0){
        try{
                Thnaks pv = new Thnaks();
                     pv.show();
                     this.dispose();

        }catch(Exception e){JOptionPane.showMessageDialog(null,e.getMessage());
        
        }}
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
            java.util.logging.Logger.getLogger(VotePresident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VotePresident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VotePresident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VotePresident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VotePresident().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

void YesNo(){
    
    try{
         stm=con.createStatement();
                 String sql3="Select  count(ID) AS Total from presidentcandidate";
                 rs=stm.executeQuery(sql3);
                  rs.next();
                  int total=rs.getInt("total");
                   if(total==1){
                      jButton3.show();
                  
                  }
                  
       
    
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e.getMessage());
    
    }

}

}
