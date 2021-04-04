package homework4.Doptask;

import java.util.ArrayList;
import java.util.Scanner;

public class SupportService {


    public static void main(String[] args) {
        boolean run = true;
        Scanner in = new Scanner(System.in);
        ArrayList<Customer> custom = new ArrayList<>();
        ArrayList<Profile> prof = new ArrayList<>();
        ArrayList<Service> serv = new ArrayList<>();
        ArrayList<SupportSpecialist> supspec = new ArrayList<>();
        ArrayList<Tiket> tik = new ArrayList<>();

        SupportService my = new SupportService();


        Customer customer1 = new Customer("fedor", "111");
        Customer customer2 = new Customer("denis", "222");
        Customer customer3 = new Customer("max", "333");
        Customer customer4 = new Customer("oleg", "444");
        Customer customer5 = new Customer("ryslan", "555");
        Customer customer6 = new Customer("lexa", "666");
        Customer customer7 = new Customer("marat", "777");
        Customer customer8 = new Customer("roma", "888");
        Customer customer9 = new Customer("vadim", "999");
        Customer customer10 = new Customer("sergey", "1000");


        Profile profile1 = new Profile("Fedor", "Dyb", "f@gmail.com", "89256364525", "Russia", "636575", 1, 0);
        Profile profile2 = new Profile("Denis", "Bob", "d@gmail.com", "82546582244", "USA", "895247", 2, 0);
        Profile profile3 = new Profile("Max", "Bob", "m@gmail.com", "82546582242", "Russia", "895246", 3, 0);
        Profile profile4 = new Profile("Oleg", "Bob", "o@gmail.com", "82546582243", "USA", "8952457", 4, 0);
        Profile profile5 = new Profile("Ryslan", "Bob", "r@gmail.com", "82546582245", "Russia", "8952475", 5, 0);
        Profile profile6 = new Profile("Lexa", "Bob", "l@gmail.com", "82546582246", "USA", "8952476", 6, 0);
        Profile profile7 = new Profile("Marat", "Bob", "ma@gmail.com", "82546582247", "Kanada", "8955247", 7, 0);
        Profile profile8 = new Profile("Roma", "Bob", "ro@gmail.com", "82546582248", "UK", "8952477", 8, 0);
        Profile profile9 = new Profile("Vadim", "Bob", "v@gmail.com", "82546582249", "USA", "8952457", 9, 0);
        Profile profile10 = new Profile("Sergey", "Bob", "s@gmail.com", "82546582246", "Russia", "8952247", 10, 0);
        Profile profile11 = new Profile("Denis*", "Bob", "s@gmail.com", "82546582246", "Russia", "8952247", 0, 1);
        Profile profile12 = new Profile("Oleg*", "Bob", "s@gmail.com", "82546582246", "Russia", "8952247", 0, 2);
        Profile profile13 = new Profile("Lexa*", "Bob", "s@gmail.com", "82546582246", "Russia", "8952247", 0, 3);


        Service service1 = new Service("Zvonok", true, 100);
        Service service2 = new Service("Video", true, 200);
        Service service3 = new Service("Internet", true, 400);


        SupportSpecialist supportSpecialist1 = new SupportSpecialist("Denis", "4321");
        SupportSpecialist supportSpecialist2 = new SupportSpecialist("Oleg", "4123");
        SupportSpecialist supportSpecialist3 = new SupportSpecialist("Lexa", "41523");


        Tiket tiket1 = new Tiket("Video", true, "не показывает");
        Tiket tiket2 = new Tiket("Zvonok", true, "не звонит");
        Tiket tiket3 = new Tiket("Internet", true, "нет интернета");

        customer1.setProfileID(profile1.id);
        customer2.setProfileID(profile2.id);
        customer3.setProfileID(profile3.id);
        customer4.setProfileID(profile4.id);
        customer5.setProfileID(profile5.id);
        customer6.setProfileID(profile6.id);
        customer7.setProfileID(profile7.id);
        customer8.setProfileID(profile8.id);
        customer9.setProfileID(profile9.id);
        customer10.setProfileID(profile10.id);

        supportSpecialist1.setProfileId(profile11.id);
        supportSpecialist2.setProfileId(profile12.id);
        supportSpecialist3.setProfileId(profile13.id);

        customer1.setTiketID(tiket1.id);
        customer1.setTiketID(tiket2.id);
        customer1.setTiketID(tiket3.id);
        customer2.setTiketID(tiket3.id);
        customer4.setTiketID(tiket2.id);
        customer5.setTiketID(tiket1.id);
        customer6.setTiketID(tiket2.id);
        customer7.setTiketID(tiket3.id);
        customer8.setTiketID(tiket1.id);
        customer9.setTiketID(tiket2.id);
        customer10.setTiketID(tiket3.id);

        tiket1.setCustomerId(customer1.id);
        tiket2.setCustomerId(customer1.id);
        tiket3.setCustomerId(customer1.id);
        tiket1.setCustomerId(customer5.id);
        tiket1.setCustomerId(customer8.id);
        tiket2.setCustomerId(customer4.id);
        tiket2.setCustomerId(customer6.id);
        tiket2.setCustomerId(customer9.id);
        tiket3.setCustomerId(customer2.id);
        tiket3.setCustomerId(customer7.id);
        tiket3.setCustomerId(customer10.id);

        customer1.setServiceID(service1.id);
        customer1.setServiceID(service2.id);
        customer1.setServiceID(service3.id);
        customer2.setServiceID(service3.id);
        customer4.setServiceID(service2.id);
        customer5.setServiceID(service1.id);
        customer6.setServiceID(service2.id);
        customer7.setServiceID(service3.id);
        customer8.setServiceID(service1.id);
        customer9.setServiceID(service2.id);
        customer10.setServiceID(service3.id);

        service1.setCustmerId(customer1.id);
        service1.setCustmerId(customer5.id);
        service1.setCustmerId(customer8.id);
        service2.setCustmerId(customer1.id);
        service2.setCustmerId(customer4.id);
        service2.setCustmerId(customer6.id);
        service2.setCustmerId(customer9.id);
        service3.setCustmerId(customer1.id);
        service3.setCustmerId(customer2.id);
        service3.setCustmerId(customer7.id);
        service3.setCustmerId(customer10.id);

        supportSpecialist1.setTicketId(tiket1.id);
        supportSpecialist1.setTicketId(tiket2.id);
        supportSpecialist1.setTicketId(tiket3.id);
        supportSpecialist2.setTicketId(tiket2.id);
        supportSpecialist3.setTicketId(tiket3.id);


        custom.add(customer1);
        custom.add(customer2);
        custom.add(customer3);
        custom.add(customer4);
        custom.add(customer5);
        custom.add(customer6);
        custom.add(customer7);
        custom.add(customer8);
        custom.add(customer9);
        custom.add(customer10);

        prof.add(profile1);
        prof.add(profile2);
        prof.add(profile3);
        prof.add(profile4);
        prof.add(profile5);
        prof.add(profile6);
        prof.add(profile7);
        prof.add(profile8);
        prof.add(profile9);
        prof.add(profile10);
        prof.add(profile11);
        prof.add(profile12);
        prof.add(profile13);

        serv.add(service1);
        serv.add(service2);
        serv.add(service3);

        supspec.add(supportSpecialist1);
        supspec.add(supportSpecialist2);
        supspec.add(supportSpecialist3);

        tik.add(tiket1);
        tik.add(tiket2);
        tik.add(tiket3);

        System.out.println("Введите команду, для выхода q");

        while (run)

            switch (in.next()) {
                case "#fetch_all_customers": {
                    my.fetch_all_customers(custom, prof);
                    System.out.println();
                    System.out.println("Введите команду");
                    break;
                }
                case "#fetch_all_tikets": {
                    my.fetch_all_tikets(tik, custom);
                    System.out.println();
                    System.out.println("Введите команду");
                    break;
                }
                case "#fetch_all_specialists": {
                    my.fetch_all_specialists(supspec, prof, tik);
                    System.out.println();
                    System.out.println("Введите команду");
                    break;
                }
                case "#feth_all_profiles": {
                    my.feth_all_profiles(prof, custom);
                    System.out.println();
                    System.out.println("Введите команду");
                    break;
                }
                case "#feth_all_services": {
                    my.feth_all_services(serv, custom);
                    System.out.println();
                    System.out.println("Введите команду");
                    break;
                }
                case "#save_tiket_to_file": {
                    int tiketId;
                    int custmotreID;
                    int supportSpecialistID;
                    System.out.println("Введите ID Tiket, ID Customer, ID SupportSpecialist");
                    tiketId = in.nextInt();
                    custmotreID = in.nextInt();
                    supportSpecialistID = in.nextInt();
                    Tiket tiks;
                    Customer cuss;
                    SupportSpecialist supspecs;
                    cuss = custom.get(custmotreID - 1);
                    supspecs = supspec.get(supportSpecialistID - 1);
                    tiks = tik.get(tiketId - 1);
                    cuss.setTiketID(tiks.id);
                    supspecs.setTicketId(tiks.id);
                    tiks.setCustomerId(cuss.id);
                    tiks.setSupportSpecialistId(supspecs.id);
                    custom.set(custmotreID - 1, cuss);
                    supspec.set(supportSpecialistID - 1, supspecs);
                    tik.set(tiketId - 1, tiks);
                    System.out.println();
                    System.out.println("Введите команду");
                    break;
                }
                default: {
                    System.out.println("Выход");
                    run = false;
                    break;
                }
            }


    }

    public void fetch_all_customers(ArrayList<Customer> a, ArrayList<Profile> b) {
        Customer cus;
        Profile prof;

        for (int i = 0; i < a.size(); i++) {
            cus = a.get(i);
            prof = b.get(cus.getProfileID() - 1);

            System.out.println(cus);
            System.out.println(prof);
            System.out.println();
        }
    }

    public void fetch_all_tikets(ArrayList<Tiket> a, ArrayList<Customer> b) {
        Tiket tik;
        Customer cus;
        for (int i = 0; i < a.size(); i++) {
            tik = a.get(i);

            System.out.println(tik);

            for (int j = 0; j < tik.getCustomerIdSize(); j++) {
                cus = b.get(tik.getCustomerId(j));

                System.out.println(cus);
            }
            System.out.println();
        }
    }

    public void fetch_all_specialists(ArrayList<SupportSpecialist> a, ArrayList<Profile> b, ArrayList<Tiket> c) {
        SupportSpecialist supspec;
        Profile prof;
        Tiket tik;

        for (int i = 0; i < a.size(); i++) {
            supspec = a.get(i);
            prof = b.get(supspec.getProfileId() - 1);

            System.out.println(supspec);
            System.out.println(prof);

            for (int j = 0; j < supspec.getTicketIdSize(); j++) {
                tik = c.get(supspec.getTicketId(j));

                System.out.println(tik);
            }
            System.out.println();
        }
    }

    public void feth_all_profiles(ArrayList<Profile> a, ArrayList<Customer> b) {
        Customer cus;
        Profile prof;

        for (int i = 0; i < a.size(); i++) {
            prof = a.get(i);

            if (prof.getCostomerID() == 0) {
                return;
            } else {
                cus = b.get(prof.getCostomerID() - 1);

                System.out.println(prof);
                System.out.println(cus);
                System.out.println();
            }
        }
    }

    public void feth_all_services(ArrayList<Service> a, ArrayList<Customer> b) {
        Service serv;
        Customer cus;

        for (int i = 0; i < a.size(); i++) {
            serv = a.get(i);
            System.out.println(serv);

            for (int j = 0; j < serv.getCustmerIdSize(); j++) {
                cus = b.get(serv.getCustmerId(j));

                System.out.println(cus);
            }
            System.out.println();
        }
    }
}
