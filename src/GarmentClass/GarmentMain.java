package GarmentClass;

public class GarmentMain {
    public static void main(String[] args) {

        Garment trousers = new Garment("trousers",9.99, "blue", "large");
        System.out.println(trousers);

        Garment blouse = new Garment("blouse", 4.99,"green", "medium");
        System.out.println(blouse);
    }
}
