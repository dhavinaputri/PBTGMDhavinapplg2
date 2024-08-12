
package com.mycompany.pertemuan8tugas1;
import java.util.Scanner;

public class Pertemuan8Tugas1 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        
        System.out.println("Nilai Awal ?");
        int nilaiAwal = myInput.nextInt();
        
        System.out.println("Nilai Akhir ?");
        int nilaiAkhir = myInput.nextInt();
        
        System.out.println("Hasilnya:");
        for(int i= nilaiAwal; i <= nilaiAkhir; i+=5) {
        System.out.println(i);
        }
    }
}
