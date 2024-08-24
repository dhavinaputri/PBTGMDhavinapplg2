
package pertemuan15tugas1;
import kalkulatorpack.Kalkulator;


public class Pertemuan15Tugas1 {

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        int hasilTambah = kalkulator.tambah(10, 5);
        System.out.println("Hasil Pertambahan: " + hasilTambah);

        int hasilKurang = kalkulator.kurang(10, 5);
        System.out.println("Hasil Pengurangan: " + hasilKurang);

        float hasilKali = kalkulator.kali(10, 5);
        System.out.println("Hasil Perkalian: " + hasilKali);

        float hasilBagi = kalkulator.bagi(10, 5);
        System.out.println("Hasil Pembagian: " + hasilBagi);
    }
}
