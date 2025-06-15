package Tasks.Lab12;

import Tasks.InputData;

public class Lab12Menu {
    TasksLab12 tasksLab12 = new TasksLab12();

    InputData inputData = new InputData();

    public void Lab12() {
        while (true) {

            System.out.println("\n1. Zadanie 1");
            System.out.println("0. Wyjscie");
            System.out.println("Wybierz zadanie: ");

            int chooseZad = inputData.InputInt();

            switch (chooseZad) {
                case 1:
                    tasksLab12.Task01();
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
