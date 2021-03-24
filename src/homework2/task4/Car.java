package homework2.task4;

public class Car {
    int year;
    double speed;
    int weight;
    String color;

    public Car() {
        this(2020, 50, 99, "Pink");
    }

    public Car(int year) {
        this(year, 50, 99, "Pink");
    }

    public Car(int year, double speed) {
        this(year, speed, 99, "Pink");
    }

    public Car(int year, double speed, int weight) {
        this(year, speed, weight, "Pink");
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
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
