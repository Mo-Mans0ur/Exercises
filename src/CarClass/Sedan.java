package CarClass;

public class Sedan extends Cars{
    public int length;

    public Sedan(int speed, int regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public void getSalesPrice() {
        if (length >= 20) {
            System.out.println(regularPrice -(regularPrice * 0.05));
        }else {
            System.out.println(regularPrice - (regularPrice * 0.1));
        }
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "speed=" + speed +
                ", regularPrice=" + regularPrice +
                ", Color='" + Color + '\'' +
                ", length=" + length +
                '}';
    }
}
