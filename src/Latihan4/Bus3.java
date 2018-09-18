/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author Windows 10
 */
public class Bus3 {
    private int penumpang;
    private int maxpenumpang;
    private int penumpangBaru;
    
    public Bus3(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang=0;
    }
    public void addpenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if(temp>maxpenumpang){
            System.out.println("penumpang melebihi kuota");
        }
        else
        {
            this.penumpang=temp;
        }
    }
    public void getpenumpang(int password){
        if (password==24){
            System.out.println("password benar");
        }
        else
        {
            System.out.println("Password salah");
        }
    }
    public void cetak(){
        System.out.println("penumpang bus sekarang "+penumpang);
        System.out.println("maksimum penumpang yang seharusnya adalah "+maxpenumpang);
    }
}
