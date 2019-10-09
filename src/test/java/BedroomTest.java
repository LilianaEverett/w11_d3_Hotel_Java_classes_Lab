import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest1;

    @Before
    public void before(){
        bedroom = new Bedroom("1", 2, "Double");
        guest1 = new Guest("Liliana");
    }

    @Test
    public void hasBedroomNumber(){
        assertEquals("1", bedroom.getBedroomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasType(){
        assertEquals("Double", bedroom.getType());
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.guestsCount());
    }

    @Test
    public void canNotAddGuestBecauseRoomFull(){
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest1);
        assertEquals(2, bedroom.guestsCount());
    }

}
