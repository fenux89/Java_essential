package homework6.Doptask;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        double add = calc.add(33.0, 5.1);
        double sub = calc.sub(22.0, 6.5);
        double mul = calc.mul(14.0, 75.3);
        double div = calc.div(24.0, 35.9);

        System.out.println("Сложение: " + add + "\n" + "Вычитание: " + sub + "\n" + "Умножение: " + mul + "\n" + "Деление: " + div);

    }
}
