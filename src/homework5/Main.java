package homework5;

import homework5.task2.Zoo;

public class Main {
    public static void main(String[] args) {
        //task2
        Zoo zoo = new Zoo();
        zoo.Animal();
        System.out.println(zoo.animal);


        //task3
        System.out.println(zoo.animal.size());
        zoo.animal.remove(7);
        zoo.animal.remove(5);
        zoo.animal.remove(3);

        System.out.println(zoo.animal.size());
        System.out.println(zoo.animal);

    }

}
