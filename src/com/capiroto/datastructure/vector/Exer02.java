package com.capiroto.datastructure.vector;

public class Exer02 {
    public static void main(String[] args) {
        CapirotoList<String> myList = new CapirotoList<String>(); 
        myList.add("capirotoA");
        myList.add("capirotoB");
        myList.add("capirotoC");
        myList.add("capirotoB");

        System.out.println("Last index of capirotoB? " + myList.lastIndexOf("capirotoB"));
        System.out.println("Last index of  capirotoD? " + myList.lastIndexOf("capirotoD"));
    }
    
}
