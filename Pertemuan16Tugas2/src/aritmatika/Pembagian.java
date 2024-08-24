
package aritmatika;


public class Pembagian extends OperasiAritmatika {

    public Pembagian(double a, double b) {
        super(a, b);
    }

    @Override
    protected double hitung() { 
        return a / b;
    }
    
    public double getHasil() {
        return hitung();
    }
}