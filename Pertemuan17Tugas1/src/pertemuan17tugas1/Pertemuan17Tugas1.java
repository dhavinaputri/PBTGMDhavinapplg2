
package pertemuan17tugas1;
import java.util.Scanner;

public class Pertemuan17Tugas1 {

   public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        
        System.out.println("Masukan Jumlah Kota : ");
        int jumlahKota = myInput.nextInt();
        
        myInput.nextLine();
        
        String[] kotaArray = new String[jumlahKota];
        
        for (int i = 0; i < jumlahKota; i++) {
            System.out.println("Kota ke " + (i + 1) + " : ");
            kotaArray[i] = myInput.nextLine();
        }
        
        System.out.println("Kota-kota yang dimasukan:");
        for (String kota : kotaArray) {
            System.out.println(kota);
        }
    }
}
