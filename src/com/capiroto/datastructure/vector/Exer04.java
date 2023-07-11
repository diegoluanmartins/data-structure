package com.capiroto.datastructure.vector;

public class Exer04 {
    public static void main(String[] args) {
        CapirotoList<String> myList = new CapirotoList<String>(); 
        myList.add("capirotoA");
        myList.add("capirotoB");
        myList.add("capirotoC");
        myList.add("capirotoB");

        System.out.println("Index 1? " + myList.get(1));
        System.out.println("Index 5? " + myList.get(5));
    }
    
}
