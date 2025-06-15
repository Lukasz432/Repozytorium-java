package Tasks.Lab9.ZAD3;

import java.util.Objects;

public class UczestnikWydarzenia {
    int id;
    String imie;
    int wiek;


    public UczestnikWydarzenia(int id, String imie, int wiek) {
        this.id = id;
        this.imie = imie;
        this.wiek = wiek;
    }

    public int getId() {
        return id;
    }

    public String getImie() {
        return imie;
    }

    public boolean isPelnoletni() {
        return wiek >= 18;
    }

    @Override
    public String toString() {
        return  "ID = " + id +
                " | imię = " + imie +
                ", wiek = " + wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UczestnikWydarzenia that = (UczestnikWydarzenia) o;
        return id == that.id && wiek == that.wiek && Objects.equals(imie, that.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imie, wiek);
    }
}
