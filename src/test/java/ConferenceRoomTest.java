import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ConferenceRoomTest {
    private ConferenceRoom conferenceRoom;
    private Guest guest1;

    @Before
    public void before() {
        this.conferenceRoom = new ConferenceRoom("Rob Roy", 10, 25);
        this.guest1 = new Guest("Dick Richards");
    }

    @Test
    public void hasCapacity() {
        assertEquals(10, conferenceRoom.getCapacity());
    }

    @Test
    public void hasName() {
        assertEquals("Rob Roy", conferenceRoom.getName());
    }

    @Test
    public void hasRate() {
        assertEquals(25, conferenceRoom.getRate());
    }

    @Test
    public void hasGuestCount() {
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test
    public void canAddGuest() {
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void canNotAddGuestWhereRoomFull() {
        conferenceRoom.addGuest(this.guest1);
        for (int ndx = 1; ndx <=10; ndx++) {
            conferenceRoom.addGuest(new Guest("Guest " + ndx));
        }
        assertEquals(10, conferenceRoom.guestCount());
    }

    @Test
    public void canRemoveGuest() {
        conferenceRoom.addGuest(this.guest1);
        conferenceRoom.removeGuest(this.guest1);
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test
    public void canGetGuestList() {
        conferenceRoom.addGuest(this.guest1);
        ArrayList<Guest> guests = conferenceRoom.getGuests();
        assertEquals(1, guests.size());
    }
}