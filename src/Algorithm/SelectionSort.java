package Algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SelectionSort {


    static ArrayList<Integer> arrayListOfNumbers = new ArrayList<Integer>();

    static ArrayList<Integer> sort (ArrayList<Integer> list) {


        for (int i = 0; i < list.size() -1; i++) {
            int minimumIndex = i;
            for (int j = i +1; j < list.size(); j++) {


                if (list.get(minimumIndex) > list.get(j)) {
                    minimumIndex = j;
                }

                Collections.swap(list,minimumIndex,i);
            }
        }
        return list;
    }


    public static void main(String[] args) {
        arrayListOfNumbers.add(5);
        arrayListOfNumbers.add(2);
        arrayListOfNumbers.add(1);
        arrayListOfNumbers.add(3);
        arrayListOfNumbers.add(4);

        System.out.println(sort(arrayListOfNumbers));
    }
}
