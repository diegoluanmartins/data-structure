package com.cprt.datastructure.vector.exercises;

import com.cprt.datastructure.vector.CprtList;

public class Exer01 {
    public static void main(String[] args) {
        CprtList<String> myList = new CprtList<String>(); 
        myList.add("cprtA");
        myList.add("cprtB");
        myList.add("cprtC");

        System.out.println("My list contains cprtB? " + myList.contains("cprtB"));
        System.out.println("My list contains cprtD? " + myList.contains("cprtD"));
    }
}
