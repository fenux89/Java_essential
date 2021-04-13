package homework9.Doptask;

public class Main {
    public static void main(String[] args) {
        Animal sova = new Animal("Sova", 5, true);
        Animal cat = new Animal("Cat", 9, true);
        Animal dog = new Animal("Dog", 3, false);

        System.out.println(sova);
        System.out.println(cat);
        System.out.println(dog);
        System.out.println();

        System.out.println(sova.hashCode);
        System.out.println(sova.equals(cat));
        System.out.println(sova.equals(sova));
        System.out.println();

        System.out.println(cat.hashCode);
        System.out.println(cat.equals(dog));
        System.out.println();

        System.out.println(dog.hashCode);
        System.out.println(dog.equals(sova));
        System.out.println();
    }
}
