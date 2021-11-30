package com.company;
import java.util.*;

class Group<T> {
    private LinkedList<T> someInfo;

    public Group(LinkedList<T> someInfo) {
        this.someInfo = someInfo;

    }
    public LinkedList<T> getId() {
        return someInfo;
    }

    public void sortGroup(LinkedList<T> someInfo){
        System.out.println("Sorted Stack: ");
        for (int i = 0; i<=someInfo.size(); i++) {
            if(i%2!=0){
                someInfo.remove(i);
            }
        }
        System.out.println(someInfo);
    }
}
