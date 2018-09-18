/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum;

/**
 *
 * @author Windows 10
 */
public class Ujipratikum1 {
    public static void main(String[] args) {
        int password;
        
        pratikum busBesar = new pratikum(40);
        busBesar.cetak();
        
        busBesar.getpenumpang(17);
        busBesar.getpenumpang(24);
        busBesar.cetak();
        busBesar.addpenumpang  (2);
        busBesar.cetak();
        busBesar.addpenumpang  (1);
        busBesar.cetak();
        busBesar.addpenumpang  (2);
        busBesar.cetak();
        busBesar.addpenumpang  (2);
        busBesar.cetak();
        System.out.println("Rata-rata Penumpang : "+busBesar.getAverage());
    }
}
