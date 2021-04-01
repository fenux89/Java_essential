package homework4.Doptask;

public class Profile {
    Integer id;
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    String address;
    String postalCode;
    Integer CostomerId;

    public Profile(Integer id, String firstName, String lastName, String email){
        this.id = id;
        this.firstName=firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
