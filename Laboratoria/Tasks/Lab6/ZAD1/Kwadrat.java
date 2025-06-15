package Tasks.Lab6.ZAD1;

public class Kwadrat extends Prostokat {
    public Kwadrat(double bok) {
        super(bok,bok);
    }

    public double getBok(){
        return this.wys;
    }

    public void setBok(double bok){
        this.wys=bok;
        this.szer=bok;
    }

    @Override
    public String opis() {
        return super.opis();
    }
}
