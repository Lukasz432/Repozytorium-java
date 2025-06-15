package Tasks.Lab2;
import Tasks.InputData;

public class Lab2menu {
    //obiekty klasy tasks
    TasksLab2 tasksLab2 = new TasksLab2();

    //obiekt klasy Inputdata
    InputData inputData = new InputData();


    public void Lab2() {
        while (true) {
            System.out.println("\n1. Zadanie 1");
            System.out.println("2. Zadanie 2");
            System.out.println("3. Zadanie 3");
            System.out.println("4. Zadanie 4");
            System.out.println("5. Zadanie 5");
            System.out.println("6. Zadanie 6");
            System.out.println("7. Zadanie 7");
            System.out.println("0. Wyjscie");
            System.out.println("Wybierz zadanie: ");

            int chooseZad = inputData.InputInt();

            //wybor zadan
            switch (chooseZad) {
                case 1:
                    tasksLab2.Task01();
                    break;
                case 2:
                    tasksLab2.Task02();
                    break;
                case 3:
                    tasksLab2.Task03();
                    break;
                case 4:
                    tasksLab2.Task04();
                    break;
                case 5:
                    tasksLab2.Task05();
                    break;
                case 6:
                    tasksLab2.Task06();
                    break;
                case 0:
                    System.out.println("Wyjscie...");
                    return;
                default:
                    System.out.println("Bledne dane");
            }
        }
    }
}
