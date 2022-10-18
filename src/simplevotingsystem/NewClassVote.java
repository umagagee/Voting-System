/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplevotingsystem;

import javax.swing.Icon;

/**
 *
 * @author NANCY
 */
public class NewClassVote {
private String id;
private String firstName;
private String lastName;
private byte[] Image;


public NewClassVote(String Id, String fn, String ln,byte[] image ){
this.id = Id;
this.Image = image;
this.firstName = fn;
this.lastName = ln;

}

   

   
public String getID(){
return id;
}
public void setID(String ID){
this.id = ID;
}


public String getFName(){
return firstName;
}
public void setFName(String fName){
this.firstName = fName;
}

public String getLName(){
return lastName;
}
public void setLName(String lName){
this.lastName = lName;
}






public byte[] getMyImage(){
return Image;
}
}
// Step 2 Create A Class Named "MyQuery
/**
*
* @author 1bestcsharp.blogspot.com
*/


/**
*
* @author 1bestcsharp.blogspot.com
*/

/**
*
* @author 1bestcsharp.blogspot.com
*/

