package CarClass;

public class MainCar {
    public static void main(String[] args) {
        Driver millie = new Driver("millie", 18);

        System.out.println(millie);


        Car mercedes = new Car("mercedes",233000);

        System.out.println(mercedes);

        mercedes.start();
        mercedes.move();
        mercedes.stop();
    }
}
