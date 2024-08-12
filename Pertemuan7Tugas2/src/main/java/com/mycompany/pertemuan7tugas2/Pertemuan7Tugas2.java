
package com.mycompany.pertemuan7tugas2;
import java.util.Scanner;

public class Pertemuan7Tugas2 {

    public static void main(String[] args) {
       Scanner myInput = new Scanner(System.in);
        
    System.out.println("Masukan NIM Anda:");
    String nim = myInput.nextLine(); 
    
    System.out.println("Masukan Nama Anda:");
    String name = myInput.nextLine(); 
    
    System.out.println("Masukan Tahun Anda:");
    int tahun = myInput.nextInt();
    
    myInput.nextLine(); 
    
   System.out.print("PILIH PEMINATAN: ");
   char peminatan = myInput.next().charAt(0);
    
   switch (tahun) {
            case 1: 
            System.out.println("Bahasa Inggris, Bahasa Jepang, Bahasa China"); 
            break; 

            case 2: 
                switch( peminatan ) { 
                case 'C': 
                System.out.println("Sistem Operasi, Pemrograman Java, Struktur Data"); 
                break; 
                case 'E': 
                System.out.println("Algoritma, Logika Informatika"); 
                break; 
                case 'M': 
                System.out.println("DBMS, Manajemen Proyek "); 
                break; 
                } 
            break; 

            case 3: 
                switch( peminatan ) { 
                case 'C': 
                System.out.println("Organisasi Komputer, MultiMedia"); 
                break; 
                case 'E': 
                System.out.println("Perancangan Sistem, Pemrograman WEB"); 
                break;
                case 'M': 
                System.out.println("Pemrograman Mobile, Pemrograman Java 2"); 
                break; 
                } 
            break;

            case 4: 
                switch( peminatan ) { 
                case 'C': 
                System.out.println("Komunikasi Data, MultiMedia"); 
                break; 
                case 'E': 
                System.out.println(" Sistem Terdistribusi, Image Processing"); 
                break; 
                case 'M': 
                System.out.println("SIM, Sistem Jaringan "); 
                break; 
                } 
            break;
        }
    
    }
}