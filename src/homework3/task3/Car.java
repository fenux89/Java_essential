package homework3.task3;

public class Car extends Vehicle{
   public Car(double cost, double speed, int year){
        super(cost, speed, year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "cost=" + cost +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }
}
