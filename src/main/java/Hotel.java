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
}