package Tasks.Lab6.ZAD1;

public class Prostokat extends Figura {
	double wys=0, szer=0;
	
	public Prostokat(double wys, double szer){
		super();
		this.wys = wys;
		this.szer = szer;
			
	}

    public double getPowierzchnia() {
        return (szer * wys);
    }

	//konstruktor przeciazony
	Prostokat(float wys, float szer, String kolor) {
		super(kolor);
		this.wys = wys;
		this.szer = szer;
		punkt = new Punkt(0,0);
	}

	public void przesun(float x, float y) {
		punkt.setX(punkt.getX() + x);
		punkt.setY(punkt.getY() + y);
	}

	@Override
	public String opis() {
		return super.opis();
	}
}