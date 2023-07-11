package com.capiroto.datastructure.vector;

public class Exer05 {
    public static void main(String[] args) {
        List<String> myList = new List<String>(); 
        myList.add("capirotoA");
        myList.add("capirotoB");
        myList.add("capirotoC");
        myList.add("capirotoB");

        System.out.println(myList);
        System.out.println("List cleared? " + myList.clear());
        System.out.println(myList);
    }
    
}
