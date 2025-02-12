package PracticeCollections.List;

import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //add elements
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(77);
        //add element on an index
        list.add(5, 10);
        list.add(6,20);
        //retrive element
        int e1 = list.get(5);
        int e2 = list.get(0);
        list.set(0,56);

        //remove elements
        int e = list.remove(0);

    }
}
