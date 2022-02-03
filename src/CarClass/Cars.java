package CarClass;

public class Cars {
    public int speed;
    public int regularPrice;
    public String Color;


    public Cars(int speed, int regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        Color = color;
    }



    @Override
    public String toString() {
        return "Cars{" +
                "speed=" + speed +
                ", regularPrice=" + regularPrice +
                ", Color='" + Color + '\'' +
                '}';
    }
}
