package Tasks.Lab6.ZAD1;

public class Okrag extends Figura {
    private Punkt srodek;
    private double promien;


    //konstruktor pusty
    public Okrag() {
        super();
        this.srodek = new Punkt(0,0);
        this.promien = 0;
    }

    //konstruktor okreslajacy punkt i srodek
    public Okrag(Punkt srodek, double promien) {
        this.srodek = new Punkt(srodek);
        this.promien = promien;
    }

    public double getPowierzchnia(){
        return Math.PI * promien * promien;
    }

    public double getSrednica(){
        return srodek.getX() + promien/2;
    }

    public double setPromien(double promien){
        return this.promien = promien;
    }

    public double getPromien(){
        return this.promien;
    }

    public boolean wSrodku(Punkt punkt){
        double x = punkt.getX() - srodek.getX();
        double y = punkt.getY() - srodek.getY();
        return (x*x + y*y) <= (promien*promien);
    }
}
