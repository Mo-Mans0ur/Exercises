package CarClass;

public class Ford extends Cars{

    public int year;
    public int manufacturerDiscount;

    public Ford(int speed, int regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public void getSalePrice() {
        System.out.println(regularPrice - manufacturerDiscount );
    }

    @Override
    public String toString() {
        return "Ford{" +
                "speed=" + speed +
                ", regularPrice=" + regularPrice +
                ", Color='" + Color + '\'' +
                ", year=" + year +
                ", manufacturerDiscount=" + manufacturerDiscount +
                '}';
    }
}
