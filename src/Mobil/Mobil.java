/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobil;
public class Mobil {
     private String password;
     private int penumpang;
     
     public String getPassword(){
        return password;
    }
     public int getPenumpang(){
         return penumpang;
     }
     public void setPassword(String newPassword){
         password = newPassword;
     }
     public void setPenumpang(int newPenumpang){
         penumpang = newPenumpang;
     }
}
