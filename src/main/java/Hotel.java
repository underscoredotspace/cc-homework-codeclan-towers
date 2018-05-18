import java.util.ArrayList;
import java.util.Collections;

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

    public ArrayList<Guest> guestList(Room room) {
        return room.getGuests();
    }

    public ArrayList<Room> vacantBedrooms() {
        ArrayList<Room> vacantBedrooms = new ArrayList<>();
        for (Room room : this.rooms) {
            if (room instanceof Bedroom && room.guestCount() == 0) {
                vacantBedrooms.add(room);
            }
        }

        return vacantBedrooms;
    }
}