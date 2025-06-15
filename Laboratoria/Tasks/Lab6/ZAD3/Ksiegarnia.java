package Tasks.Lab6.ZAD3;

import java.util.ArrayList;

public class Ksiegarnia {
    protected String nazwa;
    protected ArrayList<Ksiazka> ksiazki;
    protected ArrayList<Klient> klienci;

    public Ksiegarnia(String nazwa) {
        this.nazwa = nazwa;
        this.ksiazki = new ArrayList<>();
        this.klienci = new ArrayList<>();
    }

    public void dodajKsiazke(Ksiazka ksiazka){
        ksiazki.add(ksiazka);
    }
    public void dodajKlienta(Klient klient){
        klienci.add(klient);
    }

    public void opisKsiegarnia(){
        System.out.println("Nazwa: " + nazwa);

        System.out.println("Lista ksiazek:\n");
        for(Ksiazka ksiazka : ksiazki){
            ksiazka.opis();
            System.out.println();
        }
        System.out.println("Lista klientow:\n");
        for(Klient klient : klienci){
            klient.opisKlienta();
            System.out.println();
        }
    }
}
