package Tasks.Lab9;

import Tasks.Lab9.ZAD3.UczestnikWydarzenia;
import Tasks.Lab9.ZAD4.Osoba;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class TasksLab9 {


    public void Task01(){
        List<String> imiona = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj imie:");
            String input = scanner.nextLine();
            imiona.add(input);


            if (input.equals("-")){
                break;
            }
        }
        
    }
    public void Task02(){
        List<String> imiona = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Wpisz \"-\" zamiast imiona pierwszej osoby aby zakończyć\n");
            System.out.println("Podaj imiona pary:");

            System.out.println("Podaj imię pierwszej osoby:");
            String imie1 = scanner.nextLine();

            if (imie1.equals("-")){//zakończenie pętli
                break;
            }
            System.out.println("Podaj imię drugiej osoby:");
            String imie2 = scanner.nextLine();

            imiona.add(imie1);
            imiona.add(imie2);
        }
        System.out.println("Podaj jedno imię którejkolwiek pary:");
        String szukaniePary = scanner.nextLine();
        int index = imiona.indexOf(szukaniePary);

        if (index != -1){
            if (index % 2 == 0){
                System.out.println("Para: "+ imiona.get(index +1));
            } else {
                System.out.println("Para: "+ imiona.get(index -1));
            }
        }

    }
    public void Task03(){
        List<UczestnikWydarzenia> uczestnicy = new ArrayList<>();

        uczestnicy.add(new UczestnikWydarzenia(1,"Gosia", 23));
        uczestnicy.add(new UczestnikWydarzenia(2,"Nikolas", 20));
        uczestnicy.add(new UczestnikWydarzenia(3,"Edek", 17));

        System.out.println("Lista uczestników:");
        //wyswietlanie listy uczestnikow
        for (UczestnikWydarzenia uczestnik : uczestnicy){
            System.out.println(uczestnik);
        }

        System.out.println("\nPełnoletni uczestnicy:");
        // wyswietlanie danych o pelnoletnich uzytownikach
        for (UczestnikWydarzenia uczestnik : uczestnicy) {
            if (uczestnik.isPelnoletni()) {
                System.out.println("ID: "+ uczestnik.getId() + " | Imię: " +uczestnik.getImie());
            }
        }
    }
    public void Task04(){
        List<Osoba> listaOsob = new ArrayList<>();

        //tworzenie listy osob
        listaOsob.add(new Osoba("Nikolas", "Kida", 20));
        listaOsob.add(new Osoba("Marcin", "Kida", 20));
        listaOsob.add(new Osoba("Dominik","Kuraś",21));
        listaOsob.add(new Osoba("Wojtek", "Knapik", 20));

        System.out.println("Lista osób: ");
        for (Osoba osoba : listaOsob){
            System.out.println(osoba);
        }

        //tworzenie subListy
        List<Osoba> subList = listaOsob.subList(0, 2);
        System.out.println("Pod lista: (od 0 do 2)");
        for (Osoba osoba : subList){
            System.out.println(osoba);
        }
        listaOsob.removeAll(subList);
        System.out.println("Pod lista osób po usunięciu: ");
        System.out.println(listaOsob);

    }
    public void Task05() {
        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();

        ListIterator<Integer> iterator = list1.listIterator(list1.size()); //uzycie listIteraror'a
        while (iterator.hasPrevious()) {
            list2.add(iterator.previous());
        }

        System.out.println("Lista pierwsza");
        int count = 0; // by poprawnie stawialo przecinki
        for (Integer i : list1) {
            System.out.print(i);
            if (count < list1.size() - 1) {
                System.out.print(", ");
                count++;
            }
        }
        System.out.println();

        System.out.println("Druga lista");
        count = 0;
        for (Integer i : list2) {
            System.out.print(i);
            if (count < list2.size() - 1) {
                System.out.print(", ");
                count++;
            }
        }
    }
}