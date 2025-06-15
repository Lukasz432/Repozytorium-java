package Tasks.Lab11;

import Tasks.InputData;

public class Lab11Menu {
    TasksLab11 tasksLab11 = new TasksLab11();

    InputData inputData = new InputData();

    public void Lab11() {
        while (true) {

            System.out.println("\n1. Zadanie 1");
            System.out.println("2. Zadanie 2");
            System.out.println("0. Wyjscie");
            System.out.println("Wybierz zadanie: ");

            int chooseZad = inputData.InputInt();

            switch (chooseZad) {
                case 1:
                    tasksLab11.Task01();
                    break;
                case 2:
                    tasksLab11.Task02();
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
