package Tasks.Lab5;

//utworzenie nowej klasy osoba
public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;

    //3 parametry
    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    //2 parametry
    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }
    //bez parametrow
    public Osoba() {
        this.imie = "Nieznany";
        this.nazwisko = "Nieznany";
        this.wiek = 0;
    }

    //metoda wypisujaca dane o osobie
    public void pokazDane() {
        System.out.println("Imie: " + imie + "\nNazwisko: " + nazwisko + "\nWiek: " + wiek+"\n");
    }
}
