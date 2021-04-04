package homework4.Doptask;

import java.util.ArrayList;

public class Service {
    static int count = 1;
    int id;
    String serviceName;
    Boolean isActive;
    int serviceMonthPrice;
    ArrayList<Integer> custmerId = new ArrayList<>();

    public Service() {
    }

    public Service(String serviceName, Boolean isActive, int serviceMonthPrice) {
        this.serviceName = serviceName;
        this.isActive = isActive;
        this.serviceMonthPrice = serviceMonthPrice;
        id = count++;
    }

    public int getCustmerId(int a) {
        return custmerId.get(a) - 1;
    }

    public int getCustmerIdSize() {
        return custmerId.size();
    }

    public void setCustmerId(int custmerId) {
        this.custmerId.add(custmerId);
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
