
package pertemuan17tugas2;


public class Pertemuan17Tugas2 {

    public static void main(String[] args) {
        // Membuat array multidimensi untuk nama negara dan ibu kotanya
        String[][] negaraIbukota = {
            {"Indonesia", "Jakarta"},
            {"Jepang", "Tokyo"},
            {"Iran", "Teheran"},
            {"Malaysia", "Kuala Lumpur"},
            {"Thailand", "Bangkok"}
        };
        
     for (int i = 0; i < negaraIbukota.length; i++) {
            String negara = negaraIbukota[i][0];
            String ibukota = negaraIbukota[i][1];
            System.out.println("Ibukota " + negara + " adalah " + ibukota);
        }
    }
}