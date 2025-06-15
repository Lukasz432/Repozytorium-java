package Tasks.Lab4;

import Tasks.InputData;

public class Lab4menu {
    //obiekty klasy tasks
    TasksLab4 tasksLab4 = new TasksLab4();

    //obiekt klasy Inputdata
    InputData inputData = new InputData();

    public void Lab4() {
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
                    tasksLab4.Task01();
                    break;
                case 2:
                    tasksLab4.Task02();
                case 3:
                    tasksLab4.Task03();
                    break;
                case 4:
                    tasksLab4.Task04();
                    break;
                case 5:
                    tasksLab4.Task05();
                    break;
                case 6:
                    tasksLab4.Task06();
                    break;
                case 7:
                    tasksLab4.Task07();
                    break;
                case 0:
                    System.out.printf("Wyjscie...");
                    return;
                default:
                    System.out.printf("Bledne dane");
            }
        }
    }
}
