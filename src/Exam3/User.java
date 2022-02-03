package Exam3;

import java.util.Scanner;

public class User {
    Scanner scanner = new Scanner(System.in);


    private String fullname;
    private int userId;

    public User(String fullname, int userId) {
        this.fullname = fullname;
        this.userId = userId;
    }



    public String getFullname() {
        return fullname;
    }

    public int getUserId() {
        return userId;
    }
}
