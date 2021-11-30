package com.company;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> ints = new LinkedList<Integer>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        Group<Integer> group = new Group<>(ints);

        System.out.println("Stack: ");
        System.out.println(ints);

        group.sortGroup(ints);

    }
}
