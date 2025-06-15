package Tasks.Lab6;

import Tasks.Lab6.ZAD1.*;
import Tasks.Lab6.ZAD2.Samochod;
import Tasks.Lab6.ZAD2.SamochodOsobowy;
import Tasks.Lab6.ZAD3.*;

public class TasksLab6 {
    Punkt punkt = new Punkt(5,8);
    Punkt punkt1 = new Punkt(3,6);
    Punkt punkt2 = new Punkt(8,11);


    public void Task01(){

        punkt.opis();
        punkt1.opis();
        punkt2.opis();

        System.out.println("----------");
        punkt.przesuniecie(3,1);
        punkt1.przesuniecie(1,2);
        punkt2.przesuniecie(-2,-3);
        punkt.opis();
        punkt1.opis();
        punkt2.opis();

        System.out.println("\n9. Figura");
        Figura figura = new Figura("czewony");
        System.out.println(figura.opis());

        System.out.println("\n9. Prostokat");
        Prostokat prostokat = new Prostokat(5,6);
        System.out.println("Powierzchnia: "+prostokat.getPowierzchnia());

        System.out.println("\n9. Trojkat");
        Trojkat trojkat = new Trojkat(4,6);
        System.out.println("Wysokosc: "+trojkat.wys);
        System.out.println("Podstawa: "+trojkat.podst);

        System.out.println("\n15. Prostokat");
        Prostokat prostokat1 = new Prostokat(5,6);
        prostokat1.przesun(3,5);
        System.out.println("Lokalizacja po przesunieciu: ["+punkt.getX() + ", " + punkt.getY()+"]");

        System.out.println("\n17. Kwadrat");
        Kwadrat kwadrat = new Kwadrat(4);
        System.out.println("Bok kwadratu: "+kwadrat.getBok());
        System.out.println("Powierzchnia kwadratu: "+kwadrat.getPowierzchnia());

        System.out.println("\n19.");
        System.out.println(kwadrat.opis());
        System.out.println(trojkat.opis());
        System.out.println(prostokat.opis());
        System.out.println(figura.opis());

        Okrag okrag = new Okrag();
        okrag.setPromien(7);
        System.out.println("\nPole powierzchni okregu: "+ okrag.getPowierzchnia());
    }

    public void Task02(){

        Samochod samochod1 = new Samochod("Audi", "A4", "D", "Bialy", 2015, 10000);
        samochod1.opis();
        System.out.println("-------");
        Samochod samochod2 = new Samochod("Toyota", "Jaris", "C", "Czarny", 2001, 4021);
        samochod2.opis();
        System.out.println("-------");
        Samochod samochod3 = new SamochodOsobowy("Audi", "A4", "D", "Bialy", 2015, 10000, 2.5f, 0.8f, 2);
        samochod3.opis();
    }

    public void Task03(){
        Ksiegarnia ksiegarnia = new Ksiegarnia("Ksiegarnia");

        Ksiazka powiesc1 = new Powiesc("Wiedzmin","Andrzej Sapkowski", 39.99, "Fantasy");
        Ksiazka podrecznik1 = new Podrecznik("Wzorce Projektowe","<AUTOR>", 29.99, "Informatyka");

        ksiegarnia.dodajKsiazke(powiesc1);
        ksiegarnia.dodajKsiazke(podrecznik1);

        ksiegarnia.dodajKlienta(new Klient("Jan", "Kowalski"));
        ksiegarnia.dodajKlienta(new Klient("Dominik", "Nowak"));

        ksiegarnia.opisKsiegarnia();
    }
}
