public class Bedroom extends Room {
    private String number;
    private BedroomType type;

    Bedroom(String number, BedroomType type) {
        this.number = number;
        this.type = type;
    }

    public BedroomType getType() {
        return type;
    }

    public int getRate() {
        return type.getRate();
    }

    public String getNumber() {
        return number;
    }

    public int getCapacity() {
        return type.getCapacity();
    }
}
