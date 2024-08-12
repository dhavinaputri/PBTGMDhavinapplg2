
package com.mycompany.pertemuan12tugas1;


class Pertemuan12Tugas1 extends pegawai{
    int bonus = 1000000;
    
 public float hitungGajiTotal(){
     return gaji + bonus + tunjanganMakan + transport;
 }

    public static void main(String args[]) {
     Pertemuan12Tugas1 SA = new Pertemuan12Tugas1 (); 
     
     System.out.println("Tunjangan Makan: " + SA.tunjanganMakan);
     System.out.println("Transport: " + SA.transport);
     System.out.println("Gaji Total: " + SA.hitungGajiTotal());
     System.out.println("Gaji System Analyst:"+SA.gaji);
     System.out.println("Bonus System Analyst:"+SA.bonus);
 }
}