package com.capiroto.datastructure.vector.exercises;

import com.capiroto.datastructure.vector.CapirotoList;

public class Exer03 {
    public static void main(String[] args) {
        CapirotoList<String> myList = new CapirotoList<String>(); 
        myList.add("capirotoA");
        myList.add("capirotoB");
        myList.add("capirotoC");
        myList.add("capirotoD");

        System.out.println("Removing capirotoB? " + myList.remove("capirotoB"));
        System.out.println("Contains capirotoB? " + myList.contains("capirotoB"));
    }
    
}