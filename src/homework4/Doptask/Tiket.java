package homework4.Doptask;

public class Tiket {
    int id;
    String serviceName;
    Boolean isActive;
    String problemDescription;
    int customerId;
    int supportSpecialistId;

    public Tiket(String serviceName, Boolean isActive, String problemDescription) {
        this.serviceName = serviceName;
        this.isActive = isActive;
        this.problemDescription = problemDescription;
        id++;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setSupportSpecialistId(int supportSpecialistId) {
        this.supportSpecialistId = supportSpecialistId;
    }
}
