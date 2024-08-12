
package com.mycompany.pertemuan10tugas1;

public class Pertemuan10Tugas1 {

    public static void main(String[] args) {
   Aritmatika3 aritmatika = new Aritmatika3();
      int a = 10, b = 20;

      aritmatika.setTambah(a, b);
      System.out.println("Bilangan 1 = " + a);
      System.out.println("Bilangan 2 = " + b);
      System.out.println("Hasil Pertambahan: " + aritmatika.getTambah());

      aritmatika.setKurang(a, b);
      System.out.println("Hasil Pengurangan: " + aritmatika.getKurang());

      aritmatika.setKali(a, b);
      System.out.println("Hasil Perkalian: " + aritmatika.getKali());

      aritmatika.setBagi(a, b);
      System.out.println("Hasil Pembagian: " + aritmatika.getBagi());

      aritmatika.setPangkat(a, 2);
      System.out.println("Hasil Pangkat: " + aritmatika.getPangkat());
  }
}
