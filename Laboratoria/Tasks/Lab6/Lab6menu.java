package Tasks.Lab6;

import Tasks.InputData;

public class Lab6menu {
    //obiekty klasy tasks
    TasksLab6 tasksLab6 = new TasksLab6();

    //obiekt klasy Inputdata
    InputData inputData = new InputData();

    public void Lab6() {
        while (true) {
            System.out.println("\n1. Zadanie 1");
            System.out.println("2. Zadanie 2");
            System.out.println("3. Zadanie 3");
            System.out.println("0. Wyjscie");
            System.out.println("Wybierz zadanie: ");

            int chooseZad = inputData.InputInt();

            //wybor zadan
            switch (chooseZad) {
                case 1:
                    tasksLab6.Task01();
                    break;
                case 2:
                    tasksLab6.Task02();
                    break;
                case 3:
                    tasksLab6.Task03();
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
