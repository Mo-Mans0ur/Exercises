package InClassExercises;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //task 2'
        /*
        String[] names = {"laura", "elisa", "Mo", "benjamin"};

        doesItHaveMoreThan4(names) =
        boolean isItLongerThan4 =

         */


        //task 2.2


        boolean a = isTheNumberTrueOrFalse(-57);
        System.out.println(a);



        //task 3
        System.out.println("input a letter");

        String inputFromUser = scanner.nextLine();


        switch (inputFromUser) {
            case "a", "A":
            case "e", "E":
            case "i", "I":
            case "o", "O":
            case "u", "U":
            case "y", "Y":
                System.out.println(inputFromUser + " is a vowel");
                break;
            default:
                System.out.println(inputFromUser + " is a consonant");



                if (inputFromUser.length() > 1) {
                    System.out.println("error");
                }
        }

        System.out.println("input first number");
        int number1 = scanner.nextInt();
        System.out.println("input second number");
        int number2 = scanner.nextInt();
        System.out.println("input third number");
        int number3 =scanner.nextInt();












    }
    /*
    task 2
    public static boolean doesItHaveMoreThan4(String[] arrayOfNames) {

        return false;
    }
   */

    //task 2.2
    public static boolean isTheNumberTrueOrFalse(int number) {
        if (number < 0) {
            return false;
        }else {
            return true;
        }

    }
    //task 3

}
