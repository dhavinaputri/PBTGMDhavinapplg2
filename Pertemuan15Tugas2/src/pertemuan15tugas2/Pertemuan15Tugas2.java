
package pertemuan15tugas2;

import kalkulator.Pengurangan;
import kalkulator.Pembagian;
import kalkulator.Perkalian;

public class Pertemuan15Tugas2 {

     public static void main(String[] args) {
        Pengurangan kurang = new Pengurangan();
        Pembagian bagi = new Pembagian();  
        Perkalian kali = new Perkalian();  

        // Operasi kalkulasi
        int hasilKurang = kurang.kurang(10, 5);
        int hasilBagi = bagi.bagi(10, 2);  
        int hasilKali = kali.kali(10, 2);  

        // Menampilkan hasil
        System.out.println("Hasil Pengurangan (10 - 5): " + hasilKurang);
        System.out.println("Hasil Pembagian (10 / 2): " + hasilBagi);
        System.out.println("Hasil Perkalian (10 * 2): " + hasilKali);
    }
}