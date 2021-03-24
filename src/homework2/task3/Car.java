package homework2.task3;

public class Car {
    int year;
    double speed;
    int weight;
    String color;

    public Car() {
        this.year = 2018;
        this.speed = 120;
        this.weight = 100;
        this.color = "Серый";
    }

    public Car(int year) {
        this.year = year;
        this.speed = 20;
        this.weight = 10;
        this.color = "Зеленый";
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
        this.weight = 90;
        this.color = "Синий";
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "Черный";
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
