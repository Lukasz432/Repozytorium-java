package Tasks.Lab6.ZAD3;

public class Podrecznik extends Ksiazka {
    protected String przedmiot;


    public Podrecznik(String tytul, String autor, double cena, String przedmiot) {
        super(tytul, autor, cena);
        this.przedmiot = przedmiot;
    }

    @Override
    public void opis() {
        super.opis();
        System.out.println("Przedmiot: " + przedmiot);
    }
}
