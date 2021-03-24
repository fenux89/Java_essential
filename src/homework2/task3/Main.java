package homework2.task3;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car(2017);
        Car car3 = new Car(2018, 130);
        Car car4 = new Car(2019, 140, 150);
        Car car5 = new Car(2021, 150, 170, "белый");

        System.out.println("Car1 " + car1);
        System.out.println("Car2 " + car2);
        System.out.println("Car3 " + car3);
        System.out.println("Car4 " + car4);
        System.out.println("Car5 " + car5);
    }
}
