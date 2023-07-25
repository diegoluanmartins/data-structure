package com.cprt.datastructure.vector.exercises;

import com.cprt.datastructure.vector.CprtList;

public class Exer04 {
    public static void main(String[] args) {
        CprtList<String> myList = new CprtList<String>(); 
        myList.add("cprtA");
        myList.add("cprtB");
        myList.add("cprtC");
        myList.add("cprtB");

        System.out.println("Index 1? " + myList.get(1));
        System.out.println("Index 5? " + myList.get(5));
    }
    
}
