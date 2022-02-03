package Algorithm;

public class User {
    private String Username;
    private String password;

    public User(String usernameFromParameter,String PasswordFromParameter) {

        this.password = PasswordFromParameter;
        this.Username = usernameFromParameter;
    }


    public String getUsername() {
        return this.Username;
    }

    @Override
    public String toString() {
        return "User{" +
                "Username='" + Username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
