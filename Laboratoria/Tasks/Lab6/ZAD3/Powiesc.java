package Tasks.Lab6.ZAD3;

public class Powiesc extends Ksiazka {
    protected String gatunek;

    public Powiesc(String tytul, String autor, double cena, String gatunek) {
        super(tytul, autor, cena);
        this.gatunek = gatunek;
    }

    @Override
    public void opis() {
        super.opis();
        System.out.println("Gatunek: " + gatunek);
    }
}
