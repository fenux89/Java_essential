package homework9.task2;

public class Main {
    public static void main(String[] args) {
        Device dev1 = new Device("LG", 1200, "123456");
        Device dev2 = new Device("LG", 1200, "123456");
        Device dev3 = new Device("Apple", 11200, "1654321");
        Device dev4 = new Device("Microlab", 13200, "88229944");
        Device dev5 = new Device("Samsung", 500, "6579852");

        Monitor mon1 = new Monitor("LG", 1200, "123456", 1280, 1080);
        Monitor mon2 = new Monitor("LG", 1200, "123456", 1280, 1080);
        Monitor mon3 = new Monitor("Apple", 80, "2943654", 2280, 2080);

        System.out.println(dev1);
        System.out.println(dev2);
        System.out.println(dev3);
        System.out.println(dev4);
        System.out.println(dev5);
        System.out.println();

        System.out.println(dev1.hashCode);
        System.out.println(dev2.hashCode);
        System.out.println(dev3.hashCode);
        System.out.println(dev4.hashCode);
        System.out.println(dev5.hashCode);
        System.out.println();

        System.out.println(dev1.equals(dev2));
        System.out.println(dev2.equals(dev1));
        System.out.println(dev2.equals(dev3));
        System.out.println();

        System.out.println(mon1);
        System.out.println(mon2);
        System.out.println(mon3);
        System.out.println();

        System.out.println(mon1.hashCode);
        System.out.println(mon1.hashCode());
        System.out.println(mon1.hashCode);
        System.out.println(mon2.hashCode);
        System.out.println(mon3.hashCode);
        System.out.println();

        System.out.println(mon1.equals(mon2));
        System.out.println(mon2.equals(mon1));
        System.out.println(mon2.equals(mon3));
    }
}
