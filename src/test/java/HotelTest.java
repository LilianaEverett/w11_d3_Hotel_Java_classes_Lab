import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private ConferenceRoom conferenceRoom;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before(){
        bedroom1 = new Bedroom("1", 2, "Double", 200.00);
        bedroom2 = new Bedroom("2", 1, "Single", 180.00);
        bedroom3 = new Bedroom("3", 4, "Family", 500.50);
        conferenceRoom = new ConferenceRoom("Pink Room", 5);
        hotel = new Hotel("Balmoral");
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        hotel.addConfRoom(conferenceRoom);
        guest1 = new Guest("Neil");
        guest2 = new Guest("Liliana");

    }
    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom1);
        assertEquals(4, hotel.bedroomsCount());
    }

    @Test
    public void canAddConferenceRoom(){
        hotel.addConfRoom(conferenceRoom);
        assertEquals(2, hotel.confRoomCount());
    }

    @Test
    public void canCheckInGuest(){
        hotel.checkIn(guest1, bedroom2);
        assertEquals(1, bedroom2.guestsCount());
    }

    @Test
    public void canCheckOut(){
        hotel.checkIn(guest2, bedroom3);
        hotel.checkOut(bedroom3);
        assertEquals(0, bedroom3.guestsCount());
    }

    @Test
    public void hasBookings(){
        assertEquals(0, hotel.bookingsCount());
    }

    @Test
    public void canBookRoom(){
        hotel.bookRoom(bedroom3, 3);
        assertEquals(1, hotel.bookingsCount());
    }

}
