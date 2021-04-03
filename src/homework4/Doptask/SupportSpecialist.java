package homework4.Doptask;

import java.util.ArrayList;

public class SupportSpecialist {
    int id;
    String username;
    String pasword;
    int profileId;
    ArrayList <Integer> ticketId = new ArrayList<>();

    public SupportSpecialist(String username, String pasword) {
        this.username = username;
        this.pasword = pasword;
        id++;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId.add(ticketId);
    }
}
