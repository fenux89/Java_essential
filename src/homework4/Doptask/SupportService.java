package homework4.Doptask;

public class SupportService {
    public static void main(String[] args) {
        Customer customer1 = new Customer("fedor", "123");
        Customer customer2 = new Customer("denis", "321");



        Profile profile1 = new Profile("Fedor", "Dyb", "f@gmail.com", "89256364525","Russia","636575", 1, 0);
        Profile profile2 = new Profile("Denis", "Bob", "d@gmail.com","82546582244", "USA","895247", 2 , 0);

        Service service1 = new Service("Zvonok", true , 100, 1);
        Service service2 = new Service("Video", true , 200,2);

        SupportSpecialist supportSpecialist1 = new SupportSpecialist("Denis", "4321");
        SupportSpecialist supportSpecialist2 = new SupportSpecialist("Oleg", "4123");

        Tiket tiket1 = new Tiket("Video", true,"не показывает");


        customer1.setServiceID(service1.id);
        customer1.setProfileID(profile1.id);
        customer1.setTiketID(tiket1.id);


        customer2.setServiceID(supportSpecialist1.id);
        customer2.setProfileID(profile2.id);



    }
}
