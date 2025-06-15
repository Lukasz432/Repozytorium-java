package Tasks.Lab6.ZAD2;

public class SamochodOsobowy extends Samochod {
    float Waga; //2t - 4,5t
    float PojemnoscSilnika; //0.8 - 3.0
    int iloscOsob;

    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor,
                           int rokProdukcji, int przebieg, float waga, float pojemnoscSilnika, int iloscOsob) {
        super(marka, model, nadwozie, kolor, rokProdukcji, przebieg);
        setWaga(waga);
        setPojemnoscSilnika(pojemnoscSilnika);
        this.iloscOsob = iloscOsob;
    }

    public SamochodOsobowy() {
        super();
    }

    @Override
    public void setPrzebieg(int przebieg) {
        super.setPrzebieg(przebieg);
    }

    @Override
    public void opis() {
        super.opis();
        System.out.println("Waga: " + Waga + " t");
        System.out.println("Pojemnosc silnika: " + PojemnoscSilnika + " l");
        System.out.println("Ilosc osob: " + iloscOsob);
    }

    void setWaga(float waga){
        if(waga>=2 && waga<=4.5)
            this.Waga=waga;
        else
            System.out.println("Niepoprawna waga samochodu");
    }

    void setPojemnoscSilnika(float pojemnoscSilnika){
        if(pojemnoscSilnika>=0.8 && pojemnoscSilnika<=3)
            this.PojemnoscSilnika=pojemnoscSilnika;
        else
            System.out.println("Niepoprawna pojemnosc silnika samochodu");
    }
}
