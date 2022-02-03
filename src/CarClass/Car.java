package CarClass;

public class Car {
    public String model;
    public int price;

public Car (String name, int price) {
    this.model = name;
    this.price = price;
}
    public void start() {
        System.out.println("krkrkrkr wrOOooom");
    }

    public void stop() {
        System.out.println("iiiieeeeiei");
    }

    public void move() {
        System.out.println("wroooooooooooomm");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
