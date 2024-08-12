
package com.mycompany.pertemuan9tugas1;

public class Pertemuan9Tugas1 {

    public static void main(String[] args) {
       int i = 1;
      while (i <= 5) {
          int j = 1;
          while (j <= i) {
              System.out.print("* ");
              j++;
          }
          System.out.println(); // baris baru
          i++;
      }
  }
}