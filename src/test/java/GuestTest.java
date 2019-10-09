import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Test
    public void hasName (){
        guest = new Guest("Neil");
        assertEquals("Neil",guest.getName());
    }
}
