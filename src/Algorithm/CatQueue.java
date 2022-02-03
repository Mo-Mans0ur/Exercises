package Algorithm;

import Algorithm.ArrayCatQueue;
import Algorithm.Cat;

import java.util.ArrayList;

public class CatQueue implements ArrayCatQueue {
    private int amountOfCats;
    ArrayList<Cat> cats = new ArrayList<Cat>();




    @Override
    public void enqueue(Cat c) {
        cats.add(c);
        System.out.println(c);

        amountOfCats++;
    }

    @Override
    public Cat dequeue() {
        cats.remove(0);

        return null;
    }

    @Override
    public boolean isEmpty() {

        return false;
    }

    @Override
    public int size() {

        return cats.size();
    }

    @Override
    public void display() {
        for (Cat cat: cats ) {
            System.out.println(cat);
        }
    }
}
