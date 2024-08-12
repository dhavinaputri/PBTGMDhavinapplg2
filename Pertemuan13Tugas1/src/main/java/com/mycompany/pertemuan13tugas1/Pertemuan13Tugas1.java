
package com.mycompany.pertemuan13tugas1;

public class Pertemuan13Tugas1 {

     public static void main(String[] args) {
        SimpleCalculator objek = new SimpleCalculator(); 
        
        System.out.println("Hasil Pertambahan : " + objek.tambah(20, 10, 90));
        System.out.println("Hasil Pengurangan : " + objek.kurang(10, 20));
        System.out.println("Hasil Perkalian : " + objek.kali(20, 10));
        System.out.println("Hasil Pembagian : " + objek.bagi(20, 10));
    }
}