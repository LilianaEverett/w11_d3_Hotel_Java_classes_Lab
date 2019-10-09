import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking1;
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        booking1 = new Booking(3);
        bedroom = new Bedroom("1", 2, "Double");
        conferenceRoom = new ConferenceRoom("Pink Room", 5);
//        guest1 = new Guest("Liliana");
    }

    @Test
    public void hasNumOfNights(){
        assertEquals(3, booking1.getNumOfNights());
    }

    @Test
    public void hasBedroomsBooked(){
        booking1.addBedroomBooked(bedroom);
        assertEquals(1, booking1.bedroomsBookedCount());
    }

    @Test
    public void canAddBedroom(){
        booking1.addBedroomBooked(bedroom);
        assertEquals(1, booking1.bedroomsBookedCount());
    }

}
