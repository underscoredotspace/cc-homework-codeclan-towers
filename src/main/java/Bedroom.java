public class Bedroom extends Room {
    private String number;
    private BedroomType type;
    private Double rate;

    Bedroom(String number, BedroomType type, Double rate) {
        this.number = number;
        this.type = type;
        this.rate = rate;
    }

    public BedroomType getType() {
        return type;
    }

    public Double getRate() {
        return rate;
    }

    public String getNumber() {
        return number;
    }
}
