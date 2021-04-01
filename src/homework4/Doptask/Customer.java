package homework4.Doptask;

import java.util.ArrayList;

public class Customer {
    Integer id;
    String username;
    String password;
    Integer profileId;
    ArrayList<Integer> ServiceId = new ArrayList<>();
    ArrayList<Integer> TiketId = new ArrayList<>();
    Service service;

    private Profile profile;

    public Customer(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public ArrayList<Integer> getServiceId() {
        return ServiceId;
    }

    public void setServiceId(Integer serviceId) {
        ServiceId.add(serviceId);
    }

    public Service getService() {

        return service;
    }
}
