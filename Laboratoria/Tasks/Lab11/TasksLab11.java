package Tasks.Lab11;

public class TasksLab11 {
    public void Task01() {
        enum Swiatlo {
            CZERWONE("Stój!"),
            ZOLTE("Uwaga!"),
            ZIELONE("Jedź!");
            
            private String komunikat;
            
            Swiatlo(String komunikat) {
                this.komunikat = komunikat;
            }
            
            public String getKomunikat() {
                return komunikat;
            }
        }
        Swiatlo swiatlo = Swiatlo.CZERWONE;
        System.out.println(swiatlo.getKomunikat());
    }
    public void Task02() {
        enum PizzaSize {
            MALA(17),
            SREDNIA(25),
            DUZA(40);

            private double srednica;

            PizzaSize(double srednica) {
                this.srednica = srednica;
            }
            public double getSrednica() {
                return srednica;
            }
            public double getCena() {
                return srednica * 1.5;
            }
        }
        PizzaSize pizzaSize = PizzaSize.DUZA;
        System.out.println("Cena: " + pizzaSize.getCena());
        System.out.println("Średnica: " + pizzaSize.getSrednica());
    }
}
