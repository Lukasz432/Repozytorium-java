package Tasks.Lab5;


//utworzenie klasy typu student
public class Student {
    private Osoba osoba;
    private int nr_indeksu;
    private String specjalnosc;
    private int rok_studiow;

    //konstruktor klasy student, ktory inicjuje dane osoba, nr indeksu, specjalnosc, rok
    public Student(Osoba osoba, int nr_indeksu, String specjalnosc, int rok_studiow) {
        this.osoba = osoba;
        this.nr_indeksu = nr_indeksu;
        this.specjalnosc = specjalnosc;
        this.rok_studiow = rok_studiow;
    }

    // to samo co wczesniej tylko bez roku
    public Student(Osoba osoba, int nr_indeksu, String specjalnosc) {
        this.osoba = osoba;
        this.nr_indeksu = nr_indeksu;
        this.specjalnosc = specjalnosc;
        this.rok_studiow = 1;
    }

    //to samo co wczesniej tylko bez specjalnosci
    public Student(Osoba osoba, int nr_indeksu) {
        this.osoba = osoba;
        this.nr_indeksu = nr_indeksu;
        this.specjalnosc = "Brak danych";
        this.rok_studiow = 1;
    }

    // to samo co wczesniej tylko bez nr indeksu
    public Student(Osoba osoba) {
        this.osoba = osoba;
        this.nr_indeksu = 0;
        this.specjalnosc = "Brak danych";
        this.rok_studiow = 0;
    }
    
    //metoda wypisujaca informacje o studencie
    public void pokazDane(){
        osoba.pokazDane();
        System.out.println("Nr indeksu: "+ (nr_indeksu != 0 ? nr_indeksu : "brak danych"));
        System.out.println("Specjalnosc: "+ (specjalnosc != "Brak danych" ? specjalnosc : "brak danych"));
        System.out.println("Rok studiow: "+ rok_studiow);
        System.out.println("-------");
    }
}
