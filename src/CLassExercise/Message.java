package CLassExercise;

public class Message {
    private static String subject;
    private static String textField;

    public static String getSubject() {
        System.out.println("Stewie is on a rampage");
        return subject;
    }

    public static String getTextField() {
        System.out.println("HALP");
        return textField;
    }

    public static void sendMessage() {
        Parent.getName();
        getSubject();
        getTextField();

    }
}
