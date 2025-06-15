package Tasks.Lab2;

import Tasks.InputData;

public class TasksLab2 {

    //obiekt klasy Inputdata
    InputData inputData = new InputData();

    protected void Task01(){
        //podawanie danych do wzoru
        System.out.print("Podaj a:");
        int a = inputData.InputInt();
        System.out.print("Podaj b:");
        int b = inputData.InputInt();
        System.out.print("Podaj c:");
        int c = inputData.InputInt();

        //wypisanie wzoru i obliczenie x1 i x2
        System.out.printf("Wzor:"+a+"x^2"+b+"x+"+c+"=0\n");
        int x1 = (int) (-b + Math.sqrt(b*b - 4 * a * c)) / (2 * a);
        int x2 = (int) (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        //wypisanie wyniku
        System.out.printf("x1 = "+x1);
        System.out.printf("\nx2 = "+x2);
    }
    protected void Task02(){
        System.out.printf("Podaj x: ");
        double x = inputData.InputDouble();


        double resultAx = a2(x);
        double resultBx = b2(x);
        double resultCx = c2(x);

        System.out.printf("Wynik dla x = "+x+ ":\n");
        System.out.printf("a(x): "+resultAx);
        System.out.printf("\nb(x): "+resultBx);
        System.out.printf("\nc(x): "+resultCx);
    }
    protected void Task03() {
        System.out.printf("Podaj x: ");
        int x = inputData.InputInt();
        System.out.printf("Podaj y: ");
        int y = inputData.InputInt();
        System.out.printf("Podaj z: ");
        int z = inputData.InputInt();

        //sortowanie liczb
        int temp;
        if (x > y){
            temp = x;
            x = y;
            y = temp;
        }
        if (y > z){
            temp = y;
            y = z;
            z = temp;
        }
        if (x > y){
            temp = x;
            x = y;
            y = temp;
        }
        System.out.printf("Posortowane liczby: %d %d %d\n",x,y,z);
    }
    protected void Task04() {
        System.out.printf("Czy pada deszcz (true/false): ");
        boolean Deszcz = inputData.InputBool();
        System.out.printf("Czy jest autobus na przystanku (true/false): ");
        boolean Autobus = inputData.InputBool();

        if (Deszcz && Autobus){
            System.out.printf("Wez parasol");
            System.out.printf("Dostaniesz sie na uczelnie");
        } else if (Deszcz && !Autobus){
            System.out.printf("Nie dostaniesz sie na uczelnie");
        } else if (!Deszcz && Autobus){
            System.out.printf("Dostaniesz sie na uczelnie");
            System.out.printf("Milego dnia i pieknej pogody");
        }
    }
    protected void Task05() {
        System.out.print("Czy jest znizka na samochod (true/false): ");
        boolean Samochod = inputData.InputBool();
        System.out.print("Czy dostales premie (true/false):");
        boolean Premia = inputData.InputBool();

        if (!Samochod || Premia){
            System.out.print("Mozesz kupic samochod\n Znizki na samochod nie ma");
        } else if (!Samochod || !Premia){
            System.out.print("Zakup samochodu trzeba odlozyc na pozniej\nZnizki na samochod nie ma");
        }else if (Samochod || Premia){
            System.out.print("Mozesz kupic samochod");
        }
    }
    protected void Task06() {
        System.out.print("Wybierz operacje:");
        System.out.print("\n1. Dodawanie\n2. Odejmowanie\n3. Mnozenie\n4. Dzielenie\n5. Reszta\n");
        int choose6 = inputData.InputInt();
        System.out.print("Podaj a: ");
        int a6 = inputData.InputInt();
        System.out.print("Podaj b: ");
        int b6 = inputData.InputInt();

        switch (choose6) {
            case 1:
                System.out.print("Wynik = " + (a6 + b6) + "\n");
                break;
            case 2:
                System.out.print("Wynik = " + (a6 - b6) + "\n");
                break;
            case 3:
                System.out.print("Wynik = " + (a6 * b6) + "\n");
                break;
            case 4:
                System.out.print("Wynik = " + (a6 / b6) + "\n");
            case 5:
                System.out.print("Wynik = " + (a6 % b6) + "\n");
                break;
            default:
                System.out.println("Bledne dane");
        }
    }

    //zad 2
    private double a2(double x){
        if (x > 0){
            return 2 * x;
        }
        else if (x==0){
            return 0;
        }
        else {
            return -3 * x;
        }
    }
    private  double b2(double x){
        if (x >=1){
            return x*x;
        }
        else{
            return x;
        }
    }
    private double c2(double x){
        if (x >2){
            return 2+x;
        }
        else if (x==2){
            return 8;
        }
        else {
            return x-4;
        }
    }
}
