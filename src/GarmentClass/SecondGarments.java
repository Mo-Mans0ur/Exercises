package GarmentClass;

public class SecondGarments extends Garment{

    public SecondGarments(String garment, double price, String color, String length) {
        super(garment, price, color, length);
    }

    @Override
    public String toString() {
        return "SecondGarments{" +
                "garment='" + garment + '\'' +
                ", price=" + price +
                ", Color='" + Color + '\'' +
                ", length='" + length + '\'' +
                '}';
    }
}
