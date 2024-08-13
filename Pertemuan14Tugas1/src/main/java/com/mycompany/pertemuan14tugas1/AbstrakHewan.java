
package com.mycompany.pertemuan14tugas1;

public abstract class AbstrakHewan {
    // method abstract
    public abstract void suara();
    // method non abstract
    public void suara2() {
        System.out.println(" ini method konkrit dari parent class");
    }
}