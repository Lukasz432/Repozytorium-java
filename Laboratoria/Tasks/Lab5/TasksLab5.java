package Tasks.Lab5;

import java.util.Scanner;

public class TasksLab5 {
    Scanner scanner = new Scanner(System.in);



    protected void Task01() {

        //Obiekt utworzony z pomoca 3 parametrow
        Osoba osoba1 = new Osoba("Jan", "Kowalski", 25);
        osoba1.pokazDane();

        //Obiekt utworzony z pomoca 2 parametrow
        Osoba osoba2 = new Osoba("Michal", 26);
        osoba2.pokazDane();

        Osoba osoba3 = new Osoba();
        osoba3.pokazDane();

    }
    protected void Task02() {
        Student student1 = new Student(new Osoba("Jan", "Kowalski", 25), 123456, "Informatyka", 2);
        student1.pokazDane();

        Student student2 = new Student(new Osoba("Michal", "Nowak", 26), 12354);
        student2.pokazDane();

        Student student3 = new Student(new Osoba("Jan", "Kowalski", 25));
        student3.pokazDane();

        Student student4 = new Student(new Osoba("Michal", 23));
        student4.pokazDane();

    }
    protected void Task03() {
        System.out.print("Podaj imie studenta: ");
        String imie = scanner.nextLine();
        System.out.print("Podaj nazwisko studenta: ");
        String nazwisko = scanner.nextLine();
        System.out.print("Podaj wiek studenta: ");
        int wiek = scanner.nextInt();
        System.out.print("Podaj numer indeksu studenta: ");
        int index = scanner.nextInt();
        System.out.print("Podaj specjalnosc studenta: ");
        String specjalnosc = scanner.nextLine();
        System.out.print("Podaj rok studenta: ");
        int rok = scanner.nextInt();

        //
        Student nowyStudent = new Student(new Osoba(imie, nazwisko, wiek),index,specjalnosc,rok);
        nowyStudent.pokazDane();
    }
    protected void Task04() {
        ListaStudentow lista = new ListaStudentow();

        //przykladowe dodanie nowego studenta (pod indeks 0 i 1)
        lista.dodanieStudenta(0,new Student(new Osoba("Jan", "Kowalski", 23),
                123456, "Informatyka", 2));
        lista.dodanieStudenta(1,new Student(new Osoba("Michal", "Nowak", 20),
                1234567,"Informatyka",1));


        //przykladowe wyswietlenie konkretnego studenta
        lista.pokazStudenta(0);
        System.out.println("===============");


        //przykladowa edycja studenta na pozycji 0
        lista.edycjaStudenta(0,new Student(new Osoba("Marcin","Kowalski",19),
                123756,"Biologia",1));


        //pokazanie wszystkich studentow na liscie
        //lista.wyswietlWszystkichStudentow();


        //pokazanie studentow w zakresie indeksu od 0 do 5
        lista.pokazStudentowWzakresie(0,5);
        System.out.println("===============");


        //przykladowe usuniecie danych studenta (nadpisanie je podstawowymi danymi)
        lista.usuniecieStudenta(0);

        lista.pokazStudenta(0);
    }
}
