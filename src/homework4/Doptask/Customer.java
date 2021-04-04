package homework4.Doptask;

import java.util.ArrayList;

public class Customer {
    static int count = 1;
    int id;
    String username, password;
    int profileID;
    ArrayList<Integer> serviceID = new ArrayList<>();
    ArrayList<Integer> tiketID = new ArrayList<>();

    public Customer() {
    }

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
        id = count++;
    }

    public int getProfileID() {
        return profileID;
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

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

