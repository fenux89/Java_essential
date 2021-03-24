package homework2.task4;

public class Car {
    int year;
    double speed;
    int weight;
    String color;

    public Car() {
        year = 2020;
        speed = 50;
        weight = 99;
        color = "розовый";
    }

    public Car(int year) {
        this.year = year;
        speed = 40;
        weight = 88;
        color = "зеленый";
    }

    public Car(int year, double speed) {
        this(year);
        this.speed = speed;
        weight = 77;
        color = "красный";
    }

    public Car(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
        color = "черный";
    }

    public Car(int year, double speed, int weight, String color) {
        this(year, speed, weight);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", speed=" + speed +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
