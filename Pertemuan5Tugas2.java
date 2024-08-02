/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan5tugas2;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Pertemuan5Tugas2 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Masukan Alas Segitiga:");
            double alas = myInput.nextDouble();
        System.out.println("Masukan Tinggi Segitiga:");
            double tinggi =myInput.nextDouble();
            
            double luas = (alas * tinggi) / 2; //output input by user
            System.out.println("Luas Segitiga:" + luas);
    }
}
