package Tasks.Lab6.ZAD3;

public class Klient {
    protected String imie;
    protected String nazwisko;

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void opisKlienta(){
        System.out.println("Imie: " +imie);
        System.out.println("Nazwisko: " +nazwisko);
    }
}
