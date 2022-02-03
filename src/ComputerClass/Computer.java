package ComputerClass;

public class Computer {
    public String name;
    public int price;
    public int pixelsOfCamera;

    public Computer(String name, int price, int pixelsOfCamera) {
        this.name = name;
        this.price = price;
        this.pixelsOfCamera = pixelsOfCamera;
    }

    public void turnedOn() {
        System.out.println("Bip");
    }

    public void turnedOff() {
        System.out.println("Bop");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", pixelsOfCamera=" + pixelsOfCamera +
                '}';
    }
}
