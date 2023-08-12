package com.cprt.datastructure.vector.exercises;

import com.cprt.datastructure.vector.CprtList;

public class Exer05 {
    public static void main(String[] args) {
        CprtList<String> myList = new CprtList<String>(); 
        myList.add("cprtA");
        myList.add("cprtB");
        myList.add("cprtC");
        myList.add("cprtB");

        System.out.println(myList);
        System.out.println("List cleared? " + myList.clear());
        System.out.println(myList);
    }
    
}
