package Randoms;

public class Bus extends Vehicles{
    private int maxCapacity;

    public Bus(String name, int velocity, int maximumVelocity, double mileage,int maxCapacity) {
        super(name, velocity, maximumVelocity, mileage);
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return "Randoms.Bus{" + "name= " + getName() + ", velocity =" + getVelocity() +
                ", maxVelocity=" + getMaximumVelocity() + ", milage=" + getMileage() +
                ", maxCapacity=" + maxCapacity +
                '}';
    }

    public static int accelarate() {
        System.out.println("vrooooom");
        int i = getVelocity() + 5;
        System.out.println("Mercedes Speeding up to " + i);

        if (getVelocity() > 120) {
            System.out.println("hold your horses!! it cant go any any faster!!");
        }
    return i;
    }
}
