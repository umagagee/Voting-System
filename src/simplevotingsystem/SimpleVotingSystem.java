/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplevotingsystem;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author UMAGAGEE
 */
public class SimpleVotingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
          UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
//       votingTimer vt = new votingTimer();
//       vt.votingEndTimer();
         
 creatConnection l = new creatConnection();
l.show();

    }
    
}
