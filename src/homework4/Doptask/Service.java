package homework4.Doptask;

import java.util.ArrayList;

public class Service {
    Integer id;
    String serviceName;
    Boolean isActive;
    Integer serviceMonthPrice;
    ArrayList <Integer> custmerId = new ArrayList<>();

    public Service(Integer id, String serviceName, Boolean isActive, Integer serviceMonthPrice) {
        this.id = id;
        this.serviceName = serviceName;
        this.isActive = isActive;
        this.serviceMonthPrice = serviceMonthPrice;
    }

    public ArrayList<Integer> getCustmerId() {
        return custmerId;
    }

    public void setCustmerId(ArrayList<Integer> custmerId) {
        this.custmerId = custmerId;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", serviceName='" + serviceName + '\'' +
                ", isActive=" + isActive +
                ", serviceMonthPrice=" + serviceMonthPrice +
                '}';
    }
}
