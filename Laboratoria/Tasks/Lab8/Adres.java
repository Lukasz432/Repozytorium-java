package Tasks.Lab8;

public class Adres {

    String ulica;
    int numerDomu;
    String kodPocztowy;
    String miasto;

    public Adres(String ulica, int numerDomu, String kodPocztowy, String miasto) throws NieprawidlowyAdresException {
        try {
            if (ulica == null || ulica.isEmpty()) {
                System.out.println("Ulica nie może być nullem");
            }
            if (numerDomu <= 0) {
                System.out.println("Numer domu musi byc większy od 0");
            }
            if (kodPocztowy == null || kodPocztowy.isEmpty()) {
                System.out.println("Kod pocztowy nie może byc nullem");
            }
            if (miasto == null || miasto.isEmpty()) {
                System.out.println("Miasto nie może byc nullem");
            }
        } catch (NieprawidlowyAdresException e) {
            System.out.println("Błąd:\n"+ e.getMessage());
        }

        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }

    @Override
    public String toString() {
        return "Adres: " + ulica + " " + numerDomu + ", " + kodPocztowy + " " + miasto;
    }
}
