package Tasks.Lab7.ZAD1;

public class Samochod extends Pojazd {
    private double cenaZaGodz;

    public Samochod(boolean czyDostepny, String model, String id, double cenaZaGodz) {
        super(czyDostepny, model, id);
        this.cenaZaGodz = cenaZaGodz;
    }

    @Override
    public double obliczKoszt(int IloscGodzin) {
        return IloscGodzin * cenaZaGodz;
    }


}
