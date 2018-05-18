import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest1;

    @Before
    public void before() {
        this.bedroom = new Bedroom("128", BedroomType.SINGLE);
        this.guest1 = new Guest("Dick Richards");
    }

    @Test
    public void hasNumber() {
        assertEquals("128", bedroom.getNumber());
    }

    @Test
    public void hasBedroomType() {
        assertEquals(BedroomType.SINGLE, bedroom.getType());
    }

    @Test
    public void hasRate() {
        assertEquals(50, bedroom.getRate());
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void hasGuestCount() {
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void canAddGuest() {
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void canNotAddGuestWhereRoomFull() {
        Guest guest2 = new Guest("Sarah Daniels");
        bedroom.addGuest(this.guest1);
        bedroom.addGuest(guest2);
        assertEquals(1, bedroom.guestCount());
    }
}