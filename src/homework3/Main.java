package homework3;

import homework3.Doptask.Printer;
import homework3.task2.*;
import homework3.task3.Car;
import homework3.task3.Plane;
import homework3.task3.Ship;
import homework3.task3.Vehicle;
import homework3.task4.DocumentWorker;
import homework3.task4.ExpertDocumentWorker;
import homework3.task4.ProDocumentWorker;

import java.util.Scanner;


public class Main extends Printer {

    public static void main(String[] args) {

        //task2 Не понятно как делать 2 задание, выполнил только половину. Можете объяснить после урока?

        ClassRoom classRoom = new ClassRoom(10);

        classRoom.addPupil(new BadPupil());
        classRoom.addPupil(new GoodPupil());
        classRoom.addPupil(new GoodPupil());
        classRoom.addPupil(new ExcelentPupil());

        classRoom.showPupilsActions();




        // task3
        Vehicle ship = new Ship(15, "Petr", 1500, 120, 2020);
        Vehicle plane = new Plane(22, 100, 2000, 250, 2021);
        Vehicle car = new Car(5000, 122, 2019);

        System.out.println(ship);
        System.out.println(plane);
        System.out.println(car);

        //task4

        int proKey = 123;
        int expKey = 321;
        int inputKey;

        Scanner in = new Scanner(System.in);
        System.out.print("Input key: ");
        inputKey = in.nextInt();

        if (inputKey == proKey) {
            DocumentWorker documentPro = new ProDocumentWorker();

            System.out.println("Pro access");
            documentPro.saveDocument();

        } else if (inputKey == expKey) {
            DocumentWorker documentExpert = new ExpertDocumentWorker();

            System.out.println("Exp access");
            documentExpert.saveDocument();

        } else {
            DocumentWorker document = new DocumentWorker();
            System.out.println("Free version");
        }

        //Doptask


        Printer main = new Main();
        Printer printer = new Printer();

        main.print("Красный цвет текста");
        printer.print("Проверка", "Цвета");
    }

}
