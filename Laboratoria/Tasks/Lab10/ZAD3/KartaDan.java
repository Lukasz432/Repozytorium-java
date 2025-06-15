package Tasks.Lab10.ZAD3;

import java.util.Scanner;

public class KartaDan {
    public void ListaDan() {
        Scanner sc = new Scanner(System.in);
        FunkcjeDoMenu menu = new FunkcjeDoMenu();

        while (true){
            System.out.println("1. Dodanie nowego dania");
            System.out.println("2. Wyświetlenie całej karty dań");
            System.out.println("3. Usunięcie dania");
            System.out.println("4. Obliczanie rachunku za wybrane dania");
            System.out.println("0. Wyjście");

            System.out.println("Wybierz opcje:");
            int choose = sc.nextInt();

            switch (choose){
                case 0:
                    System.out.println("Wyjście...");
                    return;
                case 1:
                    menu.dodanieDania();
                    break;
                case 2:
                    menu.ListaDan();
                    break;
                case 3:
                    menu.UsuwanieDan();
                    break;
                case 4:
                    menu.WyliczanieCeny();
                    break;
                default:
                    System.out.println("Podano błędne dane.");
            }
        }
    }
}
