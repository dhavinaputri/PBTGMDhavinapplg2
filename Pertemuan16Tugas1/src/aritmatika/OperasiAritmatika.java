
package aritmatika;

public abstract class OperasiAritmatika {
    protected double a;
    protected double b;

    public OperasiAritmatika(double a, double b) {
        this.a = a;
        this.b = b;
    }
    protected abstract double hitung(); 
}