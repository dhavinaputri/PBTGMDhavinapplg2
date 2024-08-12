
package com.mycompany.pertemuan6tugas1;
import java.util.Scanner;

public class Pertemuan6Tugas1 {

    public static void main(String[] args) {
        
        Scanner myInput = new Scanner(System.in);
            System.out.println("Masukan Nim Anda ? :");
            String nim = myInput.nextLine();
        
            System.out.println("Masukan Nama Anda ? :");
            String nama = myInput.nextLine();
            
            System.out.println("Masukan Nilai Anda ? :");
            int Nilai = myInput.nextInt();
        
        if (Nilai <50) {
            System.out.println("grade D");
        } else if (Nilai>= 50 && Nilai <60){
            
            System.out.println("grade D");
        } else if (Nilai>= 60 && Nilai <70) {
            
            System.out.println("grade C");
        } else if (Nilai>= 70 && Nilai <80) {
            
            System.out.println("grade B");
        } else if (Nilai>= 80 && Nilai <90) {
            
            System.out.println("grade A");
        } else if (Nilai>= 90 && Nilai <100) {
            
            System.out.println("grade A++");
        } else {
            
            System.out.println("Data Nilai Salah !");
            
        }
    }
}
