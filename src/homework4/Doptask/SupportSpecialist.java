package homework4.Doptask;

import java.util.ArrayList;

public class SupportSpecialist {
    static int count = 1;
    int id;
    String username;
    String pasword;
    int profileId;
    ArrayList<Integer> ticketId = new ArrayList<>();

    public SupportSpecialist() {
    }

    public SupportSpecialist(String username, String pasword) {
        this.username = username;
        this.pasword = pasword;
        id = count++;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId.add(ticketId);
    }

    public int getProfileId() {
        return profileId;
    }

    public int getTicketId(int a) {
        return ticketId.get(a) - 1;
    }

    public int getTicketIdSize() {
        return ticketId.size();
    }

    @Override
    public String toString() {
        return "SupportSpecialist{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", pasword='" + pasword + '\'' +
                ", profileId=" + profileId +
                '}';
    }
}
