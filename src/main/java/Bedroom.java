public class Bedroom extends Room {
    private String number;
    private BedroomType type;
    private int rate;

    Bedroom(String number, BedroomType type, int rate) {
        this.number = number;
        this.type = type;
        this.rate = rate;
    }

    public BedroomType getType() {
        return type;
    }

    public int getRate() {
        return rate;
    }

    public String getNumber() {
        return number;
    }

    public int getCapacity() {
        return type.getCapacity();
    }
}
