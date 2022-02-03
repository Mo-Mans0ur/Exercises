package Algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Laura", 170, 24);
        Person person2 = new Person("Elisa",174,22);
        Person person3 = new Person("Mo", 180, 23);
        Person person4 = new Person("Sara", 176, 22);

        ArrayList<Person> person = new ArrayList<Person>();
        person.add(person1);
        person.add(person2);
        person.add(person3);
        person.add(person4);

        System.out.println(person);
        Collections.sort(person);
        System.out.println(person);






    }
}
