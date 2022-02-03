package Algorithm;

import java.util.ArrayList;

public class Person implements Comparable<Person>{
    private String name;
    private int height;
    private int age;
    private ArrayList<String> person;


    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }



    @Override
    public int compareTo(Person heightToCompareTo) {
        if (this.height > heightToCompareTo.getHeight()) {
            return -1;
        } else if (this.height < heightToCompareTo.getHeight()) {
            return 1;
        } else {
            return 0;
        }

    }

    public int compareTo2(Person ageToCompareTo) {
        if (this.age > ageToCompareTo.getAge()) {
            return -1;
        } else if (this.age < ageToCompareTo.getAge()) {
            return 1;
        } else {
            return 0;
        }
    }

}
