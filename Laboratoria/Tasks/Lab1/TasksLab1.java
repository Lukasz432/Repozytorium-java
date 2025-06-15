package Tasks.Lab1;
import Tasks.InputData;

import Tasks.InputData;
import java.util.Random;

public class TasksLab1 {
    //obiekt klasy Inputdata
    InputData inputData = new InputData();

    private String name = "Jan Nowak";
    private int age = 22;

    protected void Task01() {
        //wynik
        System.out.println("Imie: " + name+ " Wiek: " + age);
    }

    protected void Task02() {
        // podawanie liczb
        System.out.print("Podaj liczbę a: ");
        int a = inputData.InputInt();
        System.out.print("Podaj liczbę b: ");
        int b = inputData.InputInt();

        //wyniki
        int sum = a + b;
        System.out.println("Suma: " + sum);
        int diff = a - b;
        System.out.println("Roznica: " + diff);
        int product = a * b;
        System.out.println("Iloczyn: " + product);
    }

    protected void Task03() {
        System.out.print("Podaj liczbę: ");
        int number = inputData.InputInt();

        if (number % 2 == 0){// jezeli liczba jest podzielna przez 2
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    protected void Task04() {
        System.out.print("Podaj liczbę: ");
        int number4 = inputData.InputInt();

        if (number4 % 3 == 0){// jezeli liczba jest podzielna przez 3
            if (number4 % 5 == 0){// jezeli liczba jest podzielna przez 4
                System.out.println("True");
            }
        }
        else
            System.out.println("False");
    }

    protected void Task05() {
        System.out.print("Podaj liczbę: ");
        float number5 = inputData.InputFloat();

        float pow = (float) Math.pow(number5, 3);//trzecia potega liczby podanej przez uzytkownika
        System.out.println("Wynik do potegi 3: " + pow);
    }

    protected void Task06() {
        System.out.print("Podaj liczbę: ");
        float number6 = inputData.InputFloat();

        float root = (float) Math.sqrt(number6);//pierwiastek liczby podanej przez uzytkownika
        System.out.println("Pierwiastek kwadratowy: " + root);
    }

    protected boolean Task07() {
        System.out.print("Podaj liczbę a: ");
        int a7 = inputData.InputInt();
        System.out.print("Podaj liczbę b: ");
        int b7 = inputData.InputInt();
        if(a7 > b7) {// jezeli pierwsza liczba jest wieksza od drugiej, liczby zamienia sie miejscami by uniknac bledu
            int tmp = a7;
            a7 = b7;
            b7 = tmp;
        }

        //losowanie liczb a,b,c
        Random random = new Random();
        int a = random.nextInt(b7 - a7 + 1) + a7;
        int b = random.nextInt(b7 - a7 + 1) + a7;
        int c  = random.nextInt(b7 - a7 + 1) + a7;

        //sortowanie liczb a,b,c
        int[] arr = {a,b,c};
        java.util.Arrays.sort(arr);
        a = arr[0];
        b = arr[1];
        c = arr[2];

        //wynik true albo false
        boolean result = a*a+b*b==c*c;
        System.out.println("Wynik: " + result);
        return result;
    }
}

