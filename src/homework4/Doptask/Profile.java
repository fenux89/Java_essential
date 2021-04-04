package homework4.Doptask;

public class Profile {
    static int count=1;
    int id;
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    String address;
    String postalCode;
    int costomerID;
    int suportSpecialistID;

    public Profile() {
    }

    public Profile(String firstName, String lastName, String email, String phoneNumber, String address, String postalCode, int costomerID, int suportSpecialistID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.postalCode = postalCode;

        if (costomerID == 0) {
            this.suportSpecialistID = suportSpecialistID;
        } else if (suportSpecialistID == 0) {
            this.costomerID = costomerID;
        }
        id=count++;
    }

    public int getId() {
        return id;
    }

    public int getCostomerID() {
        return costomerID;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
