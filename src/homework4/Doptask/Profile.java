package homework4.Doptask;

public class Profile {
    int id=0;
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    String address;
    String postalCode;
    int costomerID;
    int suportSpecialistID;

    public Profile(String firstName, String lastName, String email, String phoneNumber, String address, String postalCode, int costomerID, int suportSpecialistID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.postalCode = postalCode;

        if (costomerID==0){
            this.suportSpecialistID = suportSpecialistID;
        } else if (suportSpecialistID==0) {
            this.costomerID = costomerID;
        }

        id++;
    }


}
