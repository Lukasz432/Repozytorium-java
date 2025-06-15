package Tasks.Lab10.ZAD3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FunkcjeDoMenu {
    Scanner sc = new Scanner(System.in);
    Map<String, Double> listaDan = new HashMap<>();
    public void dodanieDania() {
        System.out.println("Podaj danie:");
        String danie = sc.next();
        if (listaDan.containsKey(danie)) {// jezeli nazwa dania istnieje to nie zostanie dodane
            System.out.println("Takie danie już istnieje.");
        } else {
            System.out.println("Podaj cene dania:");
            double cena = sc.nextDouble();
            listaDan.put(danie, cena);//dodanie dania
            System.out.println("Dodano: " + danie + " - " + cena + "zł");
        }
    }
    public void ListaDan(){
        System.out.println("====Menu====");
        for (Map.Entry<String, Double> entry : listaDan.entrySet()) {//for each
            System.out.println(entry.getKey() + " - " + entry.getValue()+"zł");
        }
        System.out.println("============");
    }
    public void UsuwanieDan(){
        System.out.println("Podaj nazwę dania do usunięcia:");
        String nazwa = sc.next();
        if (listaDan.containsKey(nazwa)) {
            System.out.println("Usunięto " + nazwa);
            listaDan.remove(nazwa);
        } else {
            System.out.println("Takie danie nie istnieje.");
        }
    }
    public void WyliczanieCeny(){

        double sumaCenyDania = 0;
        System.out.println("Wybierz dania(oddziel je przecinkiem)");
        String[] wybraneDania = sc.nextLine().split(",");


        ArrayList<String> DaniaWybrane = new ArrayList<>();

        for (String danie : wybraneDania) {
            danie = danie.trim();//usuniecie spacji
            if (listaDan.containsKey(danie)) {
                sumaCenyDania += listaDan.get(danie);
                DaniaWybrane.add(danie);
            } else {
                System.out.println("Takie danie nie istnieje.");
            }
        }
        System.out.println("Rachunek za " + DaniaWybrane + ": " + sumaCenyDania + "zł");

    }
}
