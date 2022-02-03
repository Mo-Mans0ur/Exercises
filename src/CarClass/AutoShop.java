package CarClass;

public class AutoShop {
    public static void main(String[] args) {
        Cars volkswagen = new Cars(240,70000,"silver");
        System.out.println(volkswagen);

        System.out.println();

        Truck pickup = new Truck(200,270000,"black",2050);
        System.out.println(pickup);

        pickup.getSalePrice();

        System.out.println();

        Sedan mercedes = new Sedan(320, 350000, "red", 25);
        System.out.println(mercedes);

        mercedes.getSalesPrice();

        System.out.println();

        Ford ford = new Ford(280,230000,"Brown",2020,30000);
        System.out.println(ford);

        ford.getSalePrice();
    }
}
