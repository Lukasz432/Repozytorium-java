package Tasks.Lab9;

import Tasks.InputData;

public class Lab9Menu {
    TasksLab9 tasksLab9 = new TasksLab9();

    InputData inputData = new InputData();

    public void Lab9() {
        while (true) {

            System.out.println("\n1. Zadanie 1");
            System.out.println("2. Zadanie 2");
            System.out.println("3. Zadanie 3");
            System.out.println("4. Zadanie 4");
            System.out.println("5. Zadanie 5");
            System.out.println("0. Wyjscie");
            System.out.println("Wybierz zadanie: ");

            int chooseZad = inputData.InputInt();

            switch (chooseZad) {
                case 1:
                    tasksLab9.Task01();
                    break;
                case 2:
                    tasksLab9.Task02();
                    break;
                case 3:
                    tasksLab9.Task03();
                    break;
                case 4:
                    tasksLab9.Task04();
                    break;
                case 5:
                    tasksLab9.Task05();
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
