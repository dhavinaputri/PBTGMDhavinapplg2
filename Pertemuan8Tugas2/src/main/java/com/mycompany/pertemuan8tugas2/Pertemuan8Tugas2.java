
package com.mycompany.pertemuan8tugas2;
import java.util.Scanner;

public class Pertemuan8Tugas2 {

    public static void main(String[] args) {
       Scanner myInput = new Scanner(System.in);
        
        System.out.println("Tahun Akhir ?");
        int tahunAkhir = myInput.nextInt();
        
        System.out.println("Tahun Awal ?");
        int tahunAwal = myInput.nextInt();
        
        System.out.println("Hasilnya:");
        for(int tahun= tahunAkhir; tahun >= tahunAwal; tahun--) {
        System.out.println(tahun);
        }
    }
}
