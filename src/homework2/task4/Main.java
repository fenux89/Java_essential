package homework2.task4;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2011);
        Car car3 = new Car(2012, 60);
        Car car4 = new Car(2013, 70, 80);
        Car car5 = new Car(2014, 80, 90, " белый");

        System.out.println("car1" + car1);
        System.out.println("car2" + car2);
        System.out.println("car3" + car3);
        System.out.println("car4" + car4);
        System.out.println("car5" + car5);
    }
}
