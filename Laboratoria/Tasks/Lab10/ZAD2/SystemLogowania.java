package Tasks.Lab10.ZAD2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SystemLogowania {
    Scanner sc = new Scanner(System.in);
    Map<String, String> uzytkownik = new HashMap<>();

    public void MenuLogowania() {

        while (true) {
            System.out.println("\n1. Dodaj użytkownika");
            System.out.println("2. Zaloguj się");
            System.out.println("0. Wyjście");
            System.out.println("Wybierz opcje:");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.println("Podaj login:");
                    String login = sc.nextLine().trim();
                    if (uzytkownik.containsKey(login)) { //sprawdza czy podany uzytkownik istnieje
                        System.out.println("Taki użytkownik już istnieje.");
                    } else {
                        System.out.println("Podaj hasło:");
                        String password = sc.nextLine().trim();
                        uzytkownik.put(login, password);
                        System.out.println("Użytkownik " + login + " został dodany.");
                    }
                    break;
                case "2":
                    System.out.println("Podaj login:");
                    String loginUzytkownika = sc.nextLine().trim();
                    if (uzytkownik.containsKey(loginUzytkownika)) {
                        System.out.println("Podaj hasło");
                        String hasloUzytkownika = sc.nextLine().trim();
                        //sprawdzanie czy podane haslo jest poprawne dla podanego wczesniej uzytkownika
                        if (uzytkownik.get(loginUzytkownika).equals(hasloUzytkownika)) {
                            System.out.println("Zalogowano pomyślnie!");
                        } else {
                            System.out.println("Błędne hasło!");
                        }
                    } else {
                        System.out.println("Taki login nie istnieje.");
                    }
                    break;
                case "0":
                    System.out.println("Wyjście...");
                    return;
                default:
                    System.out.println("Błędne dane");
            }
        }
    }
}
