package Randoms;

public class Lamp {
    public boolean onOrOff;


    public Lamp (boolean onOrOff) {
        toggleLight();
        this.onOrOff = onOrOff;
    }


    public boolean lightsOn() {
        System.out.println("On --- click");
        return false;
    }


    public boolean lightsOff() {
        System.out.println("Off --- clock");
        return false;
    }

    public boolean toggleLight() {
        if (true) {
            lightsOn();
        } else {
            lightsOff();
        }
        return true;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "onOrOff=" + onOrOff +
                '}';
    }

    public static void main(String[] args) {

        Lamp lamp = new Lamp(false);



    }
}
