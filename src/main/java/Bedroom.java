import java.util.ArrayList;

public class Bedroom {

    private String roomNumber;
    private int capacity;
    private String type;
    private ArrayList<Guest> guests;

    public Bedroom(String roomNumber, int capacity, String type){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<Guest>();
    }

    public String getBedroomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getType() {
        return this.type;
    }

    public void addGuest(Guest guest) {
        if (guestsCount() < this.capacity) {
            this.guests.add(guest);
        }
    }

    public int guestsCount() {
        return this.guests.size();
    }


    public ArrayList<Guest> getGuests() {
        return this.guests;
    }

    public void removeAllGuests() {
        this.guests.clear();
    }
}
