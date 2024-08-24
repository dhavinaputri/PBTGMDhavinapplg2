
package aritmatika;


public class Pengurangan extends OperasiAritmatika {

    public Pengurangan(double a, double b) {
        super(a, b);
    }

    @Override
    protected double hitung() {  
        return a - b;
    }
    
    public double getHasil() {
        return hitung();
    }
}