
package com.mycompany.pertemuan10tugas2;

public class Aritmatika {
    private double bilangan1;
    private double bilangan2;
    
    //Konstruktor
    public Aritmatika(double bilangan1, double bilangan2) {
        this.bilangan1 = bilangan1;
        this.bilangan2 = bilangan2;
     }
    //Metode untuk melakukan pengurangan
    public double pengurangan(){
        return bilangan1 - bilangan2;
    }
    
    //Metode untuk melakukan perkalian
    public double perkalian() {
        return bilangan1 * bilangan2;
    }
    
    // Metode untuk melakukan pembagian
    public double pembagian() {
        if (bilangan2 != 0) {
            return bilangan1 / bilangan2;
        } else {
            throw new ArithmeticException("Pembagi tidak boleh nol.");
        }
    }

    // Metode untuk melakukan pangkat
    public double pangkat() {
        return Math.pow(bilangan1, bilangan2);
    }
}

