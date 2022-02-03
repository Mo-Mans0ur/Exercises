package Oscars;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Oscars {


    public static void main(String[] args) {
        File oscars = new File("Resources/movies.csv");
        ArrayList<OscarsClass> allOscars = new ArrayList<OscarsClass>();

        try {
            Scanner scanner = new Scanner(oscars);
            //scanner.nextLine();      <--- other method

            int counter = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (counter != 0) {



                    String[] arrayOfString = line.split(";");

                    int year = Integer.parseInt(arrayOfString[0]);
                    int lenght = Integer.parseInt((arrayOfString[1]));
                    String title = arrayOfString[2];
                    String subject = arrayOfString[3];
                    int popularity = Integer.parseInt(arrayOfString[4]);
                    boolean awards = java.lang.Boolean.parseBoolean(arrayOfString[5]);

                    OscarsClass currentOscars = new OscarsClass(year, lenght, title, subject, popularity, awards);
                    allOscars.add(currentOscars);
                }
                counter++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("file could not be found");
            e.printStackTrace();
        }

        System.out.println(allOscars.get(3));


    }
}
