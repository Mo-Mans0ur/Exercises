package Randoms;

public class Vehicles {
    private String name;
    private static int velocity;
    private int maximumVelocity;
    private double mileage;


    public Vehicles(String name, int velocity, int maximumVelocity, double mileage) {
        this.name = name;
        this.velocity = velocity;
        this.maximumVelocity = maximumVelocity;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Randoms.Vehicles{" +
                "name='" + name + '\'' +
                ", velocity=" + velocity +
                ", maximumVelocity=" + maximumVelocity +
                ", mileage=" + mileage +
                '}';
    }

    public String getName() {
        return name;
    }

    public static int getVelocity() {
        return velocity;
    }

    public int getMaximumVelocity() {
        return maximumVelocity;
    }

    public double getMileage() {
        return mileage;
    }


}
