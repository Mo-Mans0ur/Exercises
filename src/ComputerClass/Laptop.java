package ComputerClass;

public class Laptop extends Computer{


    public Laptop(String name, int price, int pixelsOfCamera) {
        super(name, price, pixelsOfCamera);
    }

    public void connected() {
        System.out.println("bla-ling");
    }
}
