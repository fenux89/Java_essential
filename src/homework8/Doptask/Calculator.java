package homework8.Doptask;

public class Calculator {
    double add(double a, double b) {
        return a + b;
    }

    double div(double a, double b) {
        double c = 0;

        if (b != 0) {
            c = a / b;
        } else {

            throw new ArithmeticException("Деление на ноль невозможно");
        }
        return c;
    }

    double mul(double a, double b) {
        return a * b;
    }

    double sub(double a, double b) {
        return a - b;
    }

}
