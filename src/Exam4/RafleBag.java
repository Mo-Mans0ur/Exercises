package Exam4;

public class RafleBag {
    private static int dice ;




    public RafleBag(int dice) {
        this.dice = dice;
    }


    public static void shake(RafleBag rafleBag) {
        int sumOfDice = 21 * RafleBag.dice;


    }

    @Override
    public String toString() {
        return "RafleBag{" +
                "dice=" + dice +
                '}';
    }

    public static void main(String[] args) {

        RafleBag rafleBag = new RafleBag(3);

        shake(rafleBag);

        System.out.println(rafleBag);
    }



}

