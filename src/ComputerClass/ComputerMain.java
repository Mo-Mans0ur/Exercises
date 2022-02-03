package ComputerClass;

public class ComputerMain {
    public static void main(String[] args) {

        Computer lenovo = new Computer("Lenovo", 4500, 720);
        System.out.println(lenovo);

        lenovo.turnedOn();
        lenovo.turnedOff();


        System.out.println();

        Phone apple = new Phone("iphone x", 8900,1080);
        System.out.println(apple);

        apple.notification();

        System.out.println();

        Laptop acer = new Laptop("Acer", 12000, 4000);
        System.out.println(acer);

        acer.connected();
    }
}
