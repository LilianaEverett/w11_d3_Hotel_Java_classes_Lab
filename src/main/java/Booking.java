import java.lang.reflect.Array;
import java.util.ArrayList;

public class Booking {

    private int numOfNights;
    private ArrayList<Bedroom> bedroomsBooked;
    private ArrayList<ConferenceRoom> confRoomsBooked;

    public Booking(int numOfNights){
        this.numOfNights = numOfNights;
        this.bedroomsBooked = new ArrayList<Bedroom>();
        this.confRoomsBooked = new ArrayList<ConferenceRoom>();
    }


    public int getNumOfNights() {
        return this.numOfNights;
    }

    public ArrayList<Bedroom> getBedroomsBooked() {
        return this.bedroomsBooked;
    }

    public int bedroomsBookedCount() {
        return this.bedroomsBooked.size();
    }

    public void addBedroomBooked(Bedroom bedroom) {
        this.bedroomsBooked.add(bedroom);
    }

    public double totalPrice() {
        double total = 0;
        for (double i = 0; i < this.bedroomsBooked.size(); i++) {
            i.get
        }
    }
}
