/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplevotingsystem;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author UMAGA GEE
 */
public class PasswordHashing {
    
    String hashPassword(String passwordToHash,String generatedPassword){
    try{
    MessageDigest md=MessageDigest.getInstance("MD5");
    md.update(passwordToHash.getBytes());
    
    byte [] bytes = md.digest();
    //Converting the byte to Hexadecimal
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<bytes.length; i++){
        sb.append(Integer.toString(bytes[i] & 0xff + 0x100, 16).substring(1));
    }
    //Get Complete hashed password in hex Format
    generatedPassword = sb.toString();
    
}catch(NoSuchAlgorithmException  e){
    e.printStackTrace();
}
    return generatedPassword;
    }
    
}
