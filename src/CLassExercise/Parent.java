package CLassExercise;

public class Parent extends Administrator {
    private int id;
    private static String name;
    private int phoneNumber;
    private String email;
    private String login;

    public Parent(String userName, String passWord, int id, String name, int phoneNumber, String email, String login) {
        super(userName, passWord);
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.login = login;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                '}';
    }

    public static String getName() {
        return name;
    }
}
