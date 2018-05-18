import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Hotel hotel;
    private Bedroom room101;
    private ConferenceRoom robroy;

    @Before
    public void before() {
        hotel = new Hotel();
        room101 = new Bedroom("101", BedroomType.DOUBLE);
        robroy = new ConferenceRoom("Rob Roy", 5, 100);
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
}