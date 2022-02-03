package InClassExercises;

public class Arrays {
    public static void main(String[] args) {
        //task 1.1


        //task 1.2
        String[] games = {"Assassins Creed", "Call Of Duty", "Fallout", "Destiny", "Hogwarts Legacy", "Forspoken"};
        String game = games[0];
        System.out.println(game);

        //tasks 1.21
        int[] numbers = {23, 45, 67, 75, 32, 31};
        numbers[1]  = 48;
        System.out.println(numbers[1]);

        //task 1.22
        boolean[] rainingsummer = {true,false,true,false};
        rainingsummer[3] = true;
        System.out.println(rainingsummer[3]);

        //task 1.4
        String[] names = {"sarah","ali","jens","michael","jens"};
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].replace("jens","jens🔥");
            System.out.println(names[i]);
        }
        //task 2

        String[] name = {"peter","mads", "phillip", "joey"};
        stringAndInts(name, 3);

        System.out.println(stringAndInts(name,3));

        //task 4

    }
    public static String stringAndInts(String[] array, int intInput) {
        String indexinput = array[intInput];
        return indexinput;
    }
            /*
    public static int numbers(int[] array) {
        return

    }

             */
}
