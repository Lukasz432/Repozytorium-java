package Tasks.Lab6.ZAD1;

public class Punkt {
    public double x, y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //drugi konstruktor
    public Punkt(Punkt punkt){
        this.x = punkt.x;
        this.y = punkt.y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void zeruj(){
        this.x = 0;
        this.y = 0;
    }

    public void opis(){
        System.out.println("Punkt(" + x + ", " + y+")");
    }


    public void przesuniecie(double x, double y){
        this.x += x;
        this.y += y;
    }
}
