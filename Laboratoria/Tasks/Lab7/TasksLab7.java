package Tasks.Lab7;
import Tasks.InputData;
import Tasks.Lab7.ZAD1.HulajnogaElektryczna;
import Tasks.InputData;

public class TasksLab7 {

    public void Task01(){
        HulajnogaElektryczna test1 = new HulajnogaElektryczna(true,"test","A1234", 7);


        while(true){
            System.out.println("1. Wyswietl dostepne pojazdy");
            System.out.println("2. Wypozycz pojazd");
            System.out.println("3. Zwroc pojazd");
            System.out.println("4. Naladuj hulajnoge elektryczna");
            System.out.println("0. Wyjscie...");

            int choose = new InputData().InputInt();
            switch(choose){
                case 1:
                    break;
                case 2:
                    System.out.println("Podaj ilosc godzin na ktora chcesz wynajac pojazd: ");
                    int czas = new InputData().InputInt();
                    double cena = test1.obliczKoszt(czas);
                    System.out.println("Cena : "+" "+cena+"zl");

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("Wyjscie...");
                    return;
                default:
                    System.out.println("Bledne dane");
            }
        }

    }

    public void Task02(){

    }
}
