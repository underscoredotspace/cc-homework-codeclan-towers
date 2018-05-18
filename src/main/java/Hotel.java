import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> rooms;

    Hotel() {
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public int getRoomCount() {
        return this.rooms.size();
    }

    public void checkIn(Room room, Guest guest) {
        room.addGuest(guest);
    }

    public void checkOut(Bedroom room, Guest guest) {
        room.removeGuest(guest);
    }
}