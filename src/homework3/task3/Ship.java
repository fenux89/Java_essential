package homework3.task3;

public class Ship extends Vehicle {
    String portName;
    int count;

    public Ship(int count, String portName, double cost, double speed, int year) {
        super(cost, speed, year);
        this.portName = portName;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "portName='" + portName + '\'' +
                ", count=" + count +
                ", cost=" + cost +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }
}
