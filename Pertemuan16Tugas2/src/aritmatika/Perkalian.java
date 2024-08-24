
package aritmatika;


public class Perkalian extends OperasiAritmatika {

    public Perkalian(double a, double b) {
        super(a, b);
    }

    @Override
    protected double hitung() {  
        return a * b;
    }

    public double getHasil() {
        return hitung();
    }
}
