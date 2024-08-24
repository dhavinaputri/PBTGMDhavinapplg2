
package aritmatika;


public class Penjumlahan extends OperasiAritmatika {

    public Penjumlahan(double a, double b) {
        super(a, b);
    }

    @Override
    protected double hitung() {
        return a + b;
    }
    
    public double getHasil() {
        return hitung();
    }
}