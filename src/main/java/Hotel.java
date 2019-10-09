import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;

    public Hotel(String name){
        this.name = name;
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.bookings = new ArrayList<Booking>();
    }


    public int bedroomsCount() {
        return this.bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public int confRoomCount() {
        return this.conferenceRooms.size();
    }

    public void addConfRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void checkIn(Guest guest, Bedroom bedroom) {
        if(this.bedrooms.contains(bedroom)){
            bedroom.addGuest(guest);
        }
    }

    public void checkOut(Bedroom bedroom) {
            bedroom.removeAllGuests();
    }

    public int bookingsCount() {
        return this.bookings.size();
    }

    public Booking bookRoom(Bedroom bedroom, int numOfNights) {
        Booking newBooking = new Booking(numOfNights);
        newBooking.addBedroomBooked(bedroom);
        this.bookings.add(newBooking);
        return newBooking;
    }
}
