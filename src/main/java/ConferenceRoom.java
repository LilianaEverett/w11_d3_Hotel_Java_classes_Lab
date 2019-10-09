import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> conferenceGuests;

    public ConferenceRoom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.conferenceGuests = new ArrayList<Guest>();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int confGuestsCount() {
        return this.conferenceGuests.size();
    }


    public void addConfGuest(Guest guest) {
        if (confGuestsCount() < this.capacity){
            this.conferenceGuests.add(guest);
        }
    }
}
