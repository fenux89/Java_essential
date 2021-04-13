package homework8.Doptask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        String operation;

        Calculator calc = new Calculator();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите число a: ");
        double a=0;
        double b=0;
        try {
            a = Double.parseDouble(in.readLine());
        } catch (Exception e){
            System.out.println("Не правильный формат");
            System.out.println(e.getMessage());
        }
        System.out.print("Введите число b: ");
        try {
            b = Double.parseDouble(in.readLine());
        } catch (Exception e){
            System.out.println("Не правильный формат");
            System.out.println(e.getMessage());
        }
        System.out.print("Введите операцию (+, -, *, /):");
        operation = in.readLine();


        switch (operation) {
            case "+":
                System.out.println("Сложение: " + calc.add(a, b));
                break;
            case "-":
                System.out.println("Вычитание: " + calc.sub(a, b));
                break;
            case "/":

                try {
                    System.out.println("Деление: " + calc.div(a, b));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "*":
                System.out.println("Умножение: " + calc.mul(a, b));
                break;
            default:
                System.out.println("Выбрана неверная операция");
        }
    }

}
