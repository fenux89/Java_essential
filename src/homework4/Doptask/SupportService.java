package homework4.Doptask;

public class SupportService {
    public static void main(String[] args) {
        Customer customer1 = new Customer(01,"fedor", "123");
        Customer customer2 = new Customer(02,"denis", "321");


        Profile profile1 = new Profile(1,"Fedor", "Dyb", "f@gmail.com");
        Profile profile2 = new Profile(2,"Denis", "Bob", "d@gmail.com");

        Service service1 = new Service(1, "Zvonok", true , 100);
        Service service2 = new Service(2, "Video", true , 200);


        customer1.setProfile(profile1);
        customer1.setServiceId(service1.id);
        customer1.setServiceId(service2.id);

        System.out.println(customer1.id + " " + customer1.username);
        System.out.println(customer1.getProfile().firstName);
        System.out.println(customer1.getServiceId());
        System.out.println(customer1.username + " " + customer1.getService());
    }
}
