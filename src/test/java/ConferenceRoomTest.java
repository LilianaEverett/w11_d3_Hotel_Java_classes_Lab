import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest1;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("Pink Room", 5);
        guest1 = new Guest("Anna");
    }

    @Test
    public void hasName(){
        assertEquals("Pink Room", conferenceRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(5, conferenceRoom.getCapacity());
    }

    @Test
    public void canAddGuest(){
        conferenceRoom.addConfGuest(guest1);
        assertEquals(1, conferenceRoom.confGuestsCount());
    }

    @Test
    public void canRefuseGuest(){
        conferenceRoom.addConfGuest(guest1);
        conferenceRoom.addConfGuest(guest1);
        conferenceRoom.addConfGuest(guest1);
        conferenceRoom.addConfGuest(guest1);
        conferenceRoom.addConfGuest(guest1);
        conferenceRoom.addConfGuest(guest1);
        assertEquals(5, conferenceRoom.confGuestsCount());
    }
}
