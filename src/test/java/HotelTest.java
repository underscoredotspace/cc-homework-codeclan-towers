import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Hotel hotel;
    private Bedroom room101;
    private ConferenceRoom robroy;
    private Guest guest1;

    @Before
    public void before() {
        hotel = new Hotel();
        room101 = new Bedroom("101", BedroomType.DOUBLE);
        robroy = new ConferenceRoom("Rob Roy", 5, 100);
        guest1 = new Guest("Björk Guðmundsdóttir");
    }

    @Test
    public void canGetRoomCount() {
        assertEquals(0, hotel.getRoomCount());
    }

    @Test
    public void canAddBedRoom() {
        hotel.addRoom(room101);
        assertEquals(1, hotel.getRoomCount());
    }

    @Test
    public void canAddConferenceRoom() {
        hotel.addRoom(robroy);
        assertEquals(1, hotel.getRoomCount());
    }

    @Test
    public void canCheckGuestIntoRoom() {
        hotel.addRoom(room101);
        hotel.checkIn(room101, guest1);
        assertEquals(1, room101.guestCount());
    }

    @Test
    public void canCheckGuestOutOfRoom() {
        hotel.addRoom(room101);
        hotel.checkIn(room101, guest1);

        hotel.checkOut(room101, guest1);
        assertEquals(0, room101.guestCount());
    }
}