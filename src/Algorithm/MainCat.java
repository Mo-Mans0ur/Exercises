package Algorithm;

import Algorithm.Cat;

import java.util.ArrayList;

public class MainCat {
    public static void main(String[] args) {
        Cat c = new Cat("Storm", 6);
        Cat c2 = new Cat("Millie", 6);
        Cat c3 = new Cat("Paws", 6);

        ArrayList<Cat> list = new ArrayList<Cat>();
        list.add(c);
        list.add(c2);
        list.add(c3);

        CatQueue queue = new CatQueue();
        queue.enqueue(c);
        queue.enqueue(c2);
        queue.enqueue(c3);


        queue.dequeue();
        queue.display();
        queue.size();
    }
}
