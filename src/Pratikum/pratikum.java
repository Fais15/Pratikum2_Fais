/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum;
public class pratikum {
    private double penumpang;
    private double maxpenumpang;
    private double penumpangBaru;
    private double counter;
    
    public pratikum(double maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang=0;
    }
    public void addpenumpang(double penumpang){
        double temp;
        temp=this.penumpang+penumpang;
        if(temp>maxpenumpang){
            System.out.println("penumpang melebihi kuota");
        }
        else
        {
            this.penumpang=temp;
            counter++;
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
    public double getAverage(){
        return penumpang/counter;
    }
    public void cetak(){
        System.out.println("penumpang bus sekarang "+penumpang);
        System.out.println("maksimum penumpang yang seharusnya adalah "+maxpenumpang);
    }
}


