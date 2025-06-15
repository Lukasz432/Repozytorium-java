package Tasks.Lab7;
import Tasks.InputData;

public class Lab7menu {
    //obiekty klasy tasks
    TasksLab7 tasksLab7 = new TasksLab7();

    //obiekty klasy inputData
    InputData inputData = new InputData();

    public void Lab7() {
        while (true) {
            System.out.println("\n1. Zadanie 1");
            System.out.println("2. Zadanie 2");
            System.out.println("0. Wyjscie");

            int chooseZad = inputData.InputInt();
            switch (chooseZad) {
                case 1:
                    tasksLab7.Task01();
                    break;
                case 2:
                    tasksLab7.Task02();
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
