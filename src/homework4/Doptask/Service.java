package homework4.Doptask;

import java.util.ArrayList;

public class Service {
    int id=0;
    String serviceName;
    Boolean isActive;
    int serviceMonthPrice;
    ArrayList <Integer> custmerId = new ArrayList<>();

    public Service(String serviceName, Boolean isActive, int serviceMonthPrice, int custmerId) {
        this.serviceName = serviceName;
        this.isActive = isActive;
        this.serviceMonthPrice = serviceMonthPrice;
        this.custmerId.add(custmerId);
        id++;
    }


}
