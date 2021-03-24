package homework1.Doptask;

public class Main {

    public static void main(String[] args) {
        Address address = new Address();
        address.setIndex("636000");
        address.setCountry("Russia");
        address.setCity("Tomsk");
        address.setStreet("Lenina");
        address.setHouse("15");
        address.setApartment("6");

        System.out.println(address);
    }
}
