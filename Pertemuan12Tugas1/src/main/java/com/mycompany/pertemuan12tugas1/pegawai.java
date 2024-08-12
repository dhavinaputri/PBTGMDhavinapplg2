/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan12tugas1;

public class pegawai {
    float gaji =4000000;
    float tunjanganMakan = 400000;
    float transport = 500000;
}

class SystemAnalyst extends pegawai{
    int bonus = 1000000;
    
 public static void main(String args[]) {
     SystemAnalyst SA=new SystemAnalyst (); 
     System.out.println("Gaji System Analyst:"+SA.gaji);
      System.out.println("Bonus System Analyst:"+SA.bonus);
 }
}
