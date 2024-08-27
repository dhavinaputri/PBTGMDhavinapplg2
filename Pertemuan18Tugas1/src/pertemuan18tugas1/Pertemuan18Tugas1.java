
package pertemuan18tugas1;


public class Pertemuan18Tugas1 {

    public static void validate(int age) {
        if (age < 17) {
            throw new ArithmeticException("Orang ini belum eligible untuk vote!");  // ini adalah contoh throw (Melempar exception )
        } else {
            System.out.println("Orang ini sudah eligible untuk vote!");
        }
    }

    public static void main(String[] args) {
        try {
            validate(13);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());  // ini adalah contoh Block try catch (Menangkap Exception)
        }
        System.out.println("Rest of the code...");
    }
}


// throw (Melempar Exception): 
// Digunakan untuk melempar exception secara eksplisit, biasanya ketika sebuah kondisi error ditemukan,
// sehingga exception tersebut harus ditangani oleh kode yang memanggilnya atau kode di level yang lebih tinggi.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Blok try-catch (Menangkap Exception) :
// Digunakan untuk menangkap dan menangani exception yang terjadi selama eksekusi program,
// sehingga program dapat terus berjalan setelah exception ditangani.