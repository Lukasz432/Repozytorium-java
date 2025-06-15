package Tasks;
import java.util.Scanner;

//klasa do wczytywania danych
public class InputData {

    //obiekt klasy scanner
    Scanner input = new Scanner(System.in);

    //metody do pobierania danych od uzytkownika/wczytywania danych
    public int InputInt() {
        int value = input.nextInt();
        input.nextLine();
        return value;
    }
    public float InputFloat() {
        float value = input.nextFloat();
        input.nextLine();
        return value;
    }
    public boolean InputBool() {
        boolean value = input.nextBoolean();
        input.nextLine();
        return value;
    }
    public double InputDouble() {
        double value = input.nextDouble();
        input.nextLine();
        return value;
    }
    public String InputString() {
        String value = input.nextLine();
        return value;
    }
}