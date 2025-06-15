package Tasks.Lab8;

import Tasks.InputData;

public class Lab8Menu {
    TasksLab8 tasksLab8 = new TasksLab8();

    InputData inputData = new InputData();


    public void Lab8() {
        while(true){
            System.out.println("\n1. Zadanie 1");
            System.out.println("2. Zadanie 2");
            System.out.println("3. Zadanie 3");
            System.out.println("0. Wyjscie");
            System.out.println("Wybierz zadanie: ");

            int choose = inputData.InputInt();
            switch (choose){
                case 1:
                    tasksLab8.Task01();
                    break;
                case 2:
                    tasksLab8.Task02();
                    break;
                case 3:
                    tasksLab8.Task03();
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
