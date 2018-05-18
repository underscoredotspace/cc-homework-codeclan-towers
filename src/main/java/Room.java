import java.util.ArrayList;

public abstract class Room {
    private ArrayList<Guest> guests;

    Room() {
        this.guests = new ArrayList<>();
    }

    public abstract int getCapacity();
    public abstract int getRate();

    public void addGuest(Guest guest) {
        if (this.guestCount() < this.getCapacity()) {
            this.guests.add(guest);
        }
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }

    public int guestCount() {
        return this.guests.size();
    }
}
