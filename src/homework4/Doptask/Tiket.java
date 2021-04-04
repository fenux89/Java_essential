package homework4.Doptask;

import java.util.ArrayList;

public class Tiket {
    static int count = 1;
    int id;
    String serviceName;
    Boolean isActive;
    String problemDescription;
    ArrayList<Integer> customerId = new ArrayList<>();
    int supportSpecialistId;

    public Tiket() {
    }

    public Tiket(String serviceName, Boolean isActive, String problemDescription) {
        this.serviceName = serviceName;
        this.isActive = isActive;
        this.problemDescription = problemDescription;
        id=count++;
    }

    public void setCustomerId(int customerId) {
        this.customerId.add(customerId);
    }

    public void setSupportSpecialistId(int supportSpecialistId) {
        this.supportSpecialistId = supportSpecialistId;
    }

    public int getCustomerId(int a) {
       return customerId.get(a)-1;
    }

    public int getCustomerIdSize() {
        return customerId.size();

    }

    @Override
    public String toString() {
        return "Tiket{" +
                "id=" + id +
                ", serviceName='" + serviceName + '\'' +
                ", isActive=" + isActive +
                ", problemDescription='" + problemDescription + '\'' +
                '}';
    }
}
