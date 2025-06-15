package Tasks.Lab3;

import Tasks.InputData;

public class Lab3menu {

    //obiekty klasy tasks
    TasksLab3 tasksLab3 = new TasksLab3();

    //obiekt klasy Inputdata
    InputData inputData = new InputData();
    public void Lab3() {
        while (true) {
            System.out.println("\n1. Zadanie 1");
            System.out.println("2. Zadanie 2");
            System.out.println("3. Zadanie 3");
            System.out.println("4. Zadanie 4");
            System.out.println("5. Zadanie 5");
            System.out.println("0. Wyjscie");
            System.out.println("Wybierz zadanie: ");

            int chooseZad = inputData.InputInt();

            //wybor zadan
            switch (chooseZad) {
                case 1:
                    tasksLab3.Task01();
                    break;
                case 2:
                    tasksLab3.Task02();
                    break;
                case 3:
                    tasksLab3.Task03();
                    break;
                case 4:
                    tasksLab3.Task04();
                    break;
                case 5:
                    tasksLab3.Task05();
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
