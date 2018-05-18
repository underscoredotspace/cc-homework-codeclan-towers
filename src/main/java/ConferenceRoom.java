public class ConferenceRoom extends Room {
    private String name;
    private int capacity;
    private int rate;

    ConferenceRoom(String name, int capacity, int rate) {
        this.name = name;
        this.capacity = capacity;
        this.rate = rate;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getName() {
        return name;
    }

    public int getRate() {
        return this.rate;
    }
}
