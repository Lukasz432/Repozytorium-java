package Tasks.Lab10;

import Tasks.InputData;

public class Lab10Menu {
    TasksLab10 tasksLab10 = new TasksLab10();

    InputData inputData = new InputData();

    public void Lab10() {
        while (true) {

            System.out.println("\n1. Zadanie 1");
            System.out.println("2. Zadanie 2");
            System.out.println("3. Zadanie 3");
            System.out.println("0. Wyjscie");
            System.out.println("Wybierz zadanie: ");

            int chooseZad = inputData.InputInt();

            switch (chooseZad) {
                case 1:
                    tasksLab10.Task01();
                    break;
                case 2:
                    tasksLab10.Task02();
                    break;
                case 3:
                    tasksLab10.Task03();
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
