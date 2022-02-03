package Randoms;

public class MainVehicles {

    public static void main(String[] args) {
        Vehicles car = new Vehicles("Mercedes", 80, 230, 1200.97);
        Bus longbus = new Bus("HT",130,120,5674,50);

        System.out.println(car);
        System.out.println(longbus);

        Bus.accelarate();
    }
}
