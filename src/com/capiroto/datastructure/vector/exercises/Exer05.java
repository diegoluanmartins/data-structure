package com.capiroto.datastructure.vector.exercises;

import com.capiroto.datastructure.vector.CapirotoList;

public class Exer05 {
    public static void main(String[] args) {
        CapirotoList<String> myList = new CapirotoList<String>(); 
        myList.add("capirotoA");
        myList.add("capirotoB");
        myList.add("capirotoC");
        myList.add("capirotoB");

        System.out.println(myList);
        System.out.println("List cleared? " + myList.clear());
        System.out.println(myList);
    }
    
}
