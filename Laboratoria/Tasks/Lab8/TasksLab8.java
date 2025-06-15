package Tasks.Lab8;

import java.util.Scanner;

public class TasksLab8 {

    Scanner scanner = new Scanner(System.in);


    public void Task01() {
        System.out.println("Podaj liczbę: ");

        try {
            String input = scanner.next();
            double liczba = Double.parseDouble(input);//konwercja wartosci do liczby

            if (liczba < 0) {
                throw new IllegalArgumentException("Nie można obliczyć pierwiastka z liczby ujemnej");
            }
            double pierwiastek = Math.sqrt(liczba);
            System.out.println("Pierwiastek z liczby " + liczba + " = " + pierwiastek);

        } catch (NumberFormatException e) {
            System.out.println("Błąd: Podano niepoprawna liczbę");
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd: " + e.getMessage());
        }

    }

    public void Task02() {
        System.out.println("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        try {
            int silnia = obliczSilnie(liczba);
            System.out.println("Silnia liczby " + liczba + " = " + silnia);
        } catch (BlednaWartoscDlaSilniException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }

    public void Task03(){
        try {
            Adres adres = new Adres("ul", 2, "12345", "miasto");
            System.out.println(adres);
        } catch (NieprawidlowyAdresException e) {
            System.out.println("Błąd: " + e.getMessage());
        }

        try {
            Adres adres1 = new Adres("", 0, "", "");
        } catch (NieprawidlowyAdresException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }


    public int obliczSilnie(int liczba) throws BlednaWartoscDlaSilniException {
        if (liczba < 0) {
            throw new BlednaWartoscDlaSilniException("Liczba musi byc większa od zera!");
        }

        int wynik = 1;
        for (int i = 2; i <= liczba; i++) {
            wynik *= i;
        }

        return wynik;
    }

}
