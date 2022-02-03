package CLassExercise;

public class Main {
    public static void main(String[] args) {
        Administrator brian = new Administrator("Brianthedog", "StewieIsADick");
        System.out.println(brian);

        Parent peter = new Parent("ThePoopster", "IwillForgetThePassWord", 6969, "Peter Griffin", 29103049, "BirdISTheWord@gotmail.com", "pete6939");
        System.out.println(peter);

        Message.sendMessage();
    }
}
