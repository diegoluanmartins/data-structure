package com.cprt.datastructure.vector.exercises;

import com.cprt.datastructure.vector.CprtList;

public class Exer03 {
    public static void main(String[] args) {
        CprtList<String> myList = new CprtList<String>(); 
        myList.add("cprtA");
        myList.add("cprtB");
        myList.add("cprtC");
        myList.add("cprtD");

        System.out.println("Removing cprtB? " + myList.remove("cprtB"));
        System.out.println("Contains cprtB? " + myList.contains("cprtB"));
    }
    
}
