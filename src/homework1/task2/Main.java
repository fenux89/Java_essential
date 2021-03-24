package homework1.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Введите ширину и высоту прямоугольника");

        rectangle.side1 = in.nextInt();
        rectangle.side2 = in.nextInt();

        System.out.println("Плащадь прямоугольника = " + rectangle.areaCalculator());
        System.out.println("Периметр прямоугольника = " + rectangle.perimeterCalculator());

    }
}
