import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuestTest {
    private Guest guest;

    @Before
    public void before() {
        guest = new Guest("Jane O'Neill");
    }

    @Test
    public void hasName() {
        assertEquals("Jane O'Neill", guest.getName());
    }
}