package com.cprt.datastructure.vector.exercises;

import com.cprt.datastructure.vector.CprtList;

public class Exer02 {
    public static void main(String[] args) {
        CprtList<String> myList = new CprtList<String>(); 
        myList.add("cptrA");
        myList.add("cptrB");
        myList.add("cptrC");
        myList.add("cptrB");

        System.out.println("Last index of cptrB? " + myList.lastIndexOf("cprtB"));
        System.out.println("Last index of  cptrD? " + myList.lastIndexOf("cprtD"));
    }
    
}
