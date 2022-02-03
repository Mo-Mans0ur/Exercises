package ComputerClass;

public class Phone extends Computer{

    public Phone(String name, int price, int pixelsOfCamera) {
        super(name, price, pixelsOfCamera);
    }

    public void notification() {
        System.out.println("da ding");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", pixelsOfCamera=" + pixelsOfCamera +
                '}';
    }
}
