package Tasks;

import Tasks.Lab1.Lab1menu;
import Tasks.Lab2.Lab2menu;
import Tasks.Lab3.Lab3menu;
import Tasks.Lab4.Lab4menu;
import Tasks.Lab5.Lab5menu;
import Tasks.Lab6.Lab6menu;
import Tasks.Lab7.Lab7menu;
import Tasks.Lab8.Lab8Menu;
import Tasks.Lab9.Lab9Menu;
import Tasks.Lab10.Lab10Menu;
import Tasks.Lab11.Lab11Menu;
import Tasks.Lab12.Lab12Menu;

//utworzenie klasy typu run
public class Run {

    //obiekty klasy lab
    Lab1menu lab1 = new Lab1menu();
    Lab2menu lab2 = new Lab2menu();
    Lab3menu lab3 = new Lab3menu();
    Lab4menu lab4 = new Lab4menu();
    Lab5menu lab5 = new Lab5menu();
    Lab6menu lab6 = new Lab6menu();
    Lab7menu lab7 = new Lab7menu();
    Lab8Menu lab8 = new Lab8Menu();
    Lab9Menu lab9 = new Lab9Menu();
    Lab10Menu lab10 = new Lab10Menu();
    Lab11Menu lab11 = new Lab11Menu();
    Lab12Menu lab12 = new Lab12Menu();

    //obiekt klasy Inputdata
    InputData inputData = new InputData();

    //metoda runmain menu
    public void RunMain() {
        Menu();
    }

    //utworzenie menu
    private void Menu() {
        while (true) {
            System.out.println("\n1. Lab 1");
            System.out.println("2. Lab 2");
            System.out.println("3. Lab 3");
            System.out.println("4. Lab 4");
            System.out.println("5. Lab 5");
            System.out.println("6. Lab 6");
            System.out.println("7. Lab 7");
            System.out.println("8. Lab 8");
            System.out.println("9. Lab 9");
            System.out.println("10. Lab 10");
            System.out.println("11. Lab 11");
            System.out.println("12. Lab 12");
            System.out.println("0. Wyjście");
            System.out.print("Wybierz lab: ");

            int chooseLab = inputData.InputInt();

            //wybor labolatoria
            switch (chooseLab) {
                case 1:
                    lab1.Lab1();
                    break;
                case 2:
                    lab2.Lab2();
                    break;
                case 3:
                    lab3.Lab3();
                    break;
                case 4:
                    lab4.Lab4();
                    break;
                case 5:
                    lab5.Lab5();
                    break;
                case 6:
                    lab6.Lab6();
                    break;
                case 7:
                    lab7.Lab7();
                    break;
                case 8:
                    lab8.Lab8();
                    break;
                case 9:
                    lab9.Lab9();
                    break;
                case 10:
                        lab10.Lab10();
                        break;
                case 11:
                    lab11.Lab11();
                    break;
                case 12:
                    lab12.Lab12();
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