package Tasks.Lab5;

public class ListaStudentow {
    private final Student[] studenci = new Student[100];

    public ListaStudentow() {
        for(int i = 0; i < studenci.length; i++){
            studenci[i] = podstawowyStudent();
        }
    }

    private Student podstawowyStudent(){
        Osoba osoba = new Osoba("","",0);
        return new Student(osoba);
    }

    public void dodanieStudenta(int indeks, Student student){
        if(indeks >= 0 && indeks < studenci.length){//indeks nalezy od 1 do 100
            studenci[indeks] = student;
        }
        else{
            System.out.println("Nieprawidlowy indeks");
        }
    }
    public void edycjaStudenta(int indeks,Student student){
        if(indeks >= 0 && indeks < studenci.length){
            studenci[indeks] = student;
        }
        else{
            System.out.println("Nieprawidlowy indeks");
        }
    }
    public void usuniecieStudenta(int indeks){
        if(indeks >= 0 && indeks < studenci.length){
            studenci[indeks] = podstawowyStudent();
        }
        else{
            System.out.println("Nieprawidlowy indeks");
        }
    }

    public void pokazStudenta(int indeks){
        if(indeks >= 0 && indeks < studenci.length){
            studenci[indeks].pokazDane();
        }
        else{
            System.out.println("Nieprawidlowy indeks");
        }
    }

    public void wyswietlWszystkichStudentow(){
        for(int i = 0; i < studenci.length; i++){
            studenci[i].pokazDane();
            System.out.println("\n");
        }
    }

    public void pokazStudentowWzakresie(int indeksPoczatkowy, int indeksKoncowy){
        if(indeksPoczatkowy >= 0 && indeksKoncowy < studenci.length && indeksPoczatkowy <= indeksKoncowy){
            for(int i = indeksPoczatkowy; i <= indeksKoncowy; i++){
                studenci[i].pokazDane();
                System.out.println("\n");
            }
        }
        else{
            System.out.println("Nieprawidlowy zakres");
        }
    }
}
