package GarmentClass;

public class Garment {
    public String garment;
    public double price;
    public String Color;
    public String length;


    public Garment(String garment, double price, String color, String length) {
        this.garment = garment;
        this.price = price;
        Color = color;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Garment{" +
                "garment='" + garment + '\'' +
                ", price=" + price +
                ", Color='" + Color + '\'' +
                ", length='" + length + '\'' +
                '}';
    }
}
