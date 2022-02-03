package CarClass;

public class Truck extends Cars{

    public int weight;

    public Truck(int speed, int regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }


    public void getSalePrice() {

        if (weight >= 2000) {
            System.out.println(regularPrice - (regularPrice * 0.1));
        }else {
            System.out.println(regularPrice - (regularPrice * 0.2));
        }
    }


    @Override
    public String toString() {
        return "Truck{" +
                "speed=" + speed +
                ", regularPrice=" + regularPrice +
                ", Color='" + Color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
