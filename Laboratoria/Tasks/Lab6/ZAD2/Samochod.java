package Tasks.Lab6.ZAD2;

import java.util.Scanner;

public class Samochod {
    String Marka;
    String Model;
    String Nadwozie;
    String Kolor;
    int RokProdukcji;
    int Przebieg;

    public Samochod(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg) {
        Marka = marka;
        Model = model;
        Nadwozie = nadwozie;
        Kolor = kolor;
        RokProdukcji = rokProdukcji;
        setPrzebieg(przebieg);
    }

    public Samochod() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj marke samochodu: ");
        this.Marka = scanner.nextLine();

        System.out.println("Podaj model samochodu: ");
        this.Model = scanner.nextLine();

        System.out.println("Podaj typ nadwozia samochodu: ");
        this.Nadwozie = scanner.nextLine();

        System.out.println("Podaj kolor samochodu: ");
        this.Kolor = scanner.nextLine();

        System.out.println("Podaj rok produkcji samochodu: ");
        this.RokProdukcji = scanner.nextInt();

        System.out.println("Podaj przebieg samochodu: ");
        setPrzebieg(scanner.nextInt());
    }

    public void setPrzebieg(int przebieg){
        if (przebieg >= 0) {
            this.Przebieg = przebieg;
        }
        else {
            System.out.println("Przebieg nie mozne byc ujemny");
            this.Przebieg = 0;
        }
    }

    public void opis(){
        System.out.println("\n\nSamochod:" +"\nMarka: "+ this.Marka +"\nModel: "+ this.Model + "\nNadwozie: "
                + this.Nadwozie + "\nKolor: " + this.Kolor + "\nRok produkcji: " + this.RokProdukcji +
                "\nPrzebieg: " + this.Przebieg + "km");
    }
}
