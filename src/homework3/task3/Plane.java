package homework3.task3;

public class Plane extends Vehicle{
    double height;
    int count;

    public Plane(double height, int count, double cost, double speed, int year){
        super(cost, speed, year);
        this.height = height;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "height=" + height +
                ", count=" + count +
                ", cost=" + cost +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }
}
