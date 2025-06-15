package Tasks.Lab7.ZAD1;

import Tasks.Lab6.ZAD3.Ksiazka;

import java.util.ArrayList;

public abstract class Pojazd {
    protected ArrayList<Pojazd>dostepnePojazdy;


    protected boolean czyDostepny;
    protected String model;
    protected String id;

    public Pojazd(boolean czyDostepny, String model, String id) {
        this.czyDostepny = czyDostepny;
        this.model = model;
        this.id = id;
        this.dostepnePojazdy = new ArrayList<>();
    }

    public boolean isCzyDostepny() {
        return czyDostepny;
    }

    public String getModel() {
        return model;
    }

    public String getId() {
        return id;
    }

    public void wyporzycz() {
        this.czyDostepny = false;
    }
    public void zwroc(){
        this.czyDostepny = true;
    }
    public abstract double obliczKoszt(int IloscGodzin);
}
