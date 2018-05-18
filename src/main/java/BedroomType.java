public enum BedroomType {
    SINGLE(1, 50),
    DOUBLE(2, 75),
    FAMILY(4, 90);

    private final int capacity;
    private final int rate;

    BedroomType(int capacity, int rate) {
        this.capacity = capacity;
        this.rate = rate;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRate() {
        return rate;
    }
}
