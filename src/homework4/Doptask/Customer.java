package homework4.Doptask;

import java.util.ArrayList;

public class Customer {
   int id=0;
   String username, password;
   int profileID;
   ArrayList<Integer> serviceID = new ArrayList<>();
   ArrayList<Integer> tiketID = new ArrayList<>();

    public Customer(String username, String password){  //, int profileID,int serviceID, int tiketID) {
        this.username = username;
        this.password = password;
//        this.profileID = profileID;
//        this.serviceID.add(serviceID);
//        this.tiketID.add(tiketID);

        id++;
    }

    public void setServiceID(int serviceID) {
        this.serviceID.add(serviceID);
    }

    public void setTiketID(int tiketID) {
        this.tiketID.add(tiketID);
    }

    public void setProfileID(int profileID) {
        this.profileID = profileID;
    }
}

