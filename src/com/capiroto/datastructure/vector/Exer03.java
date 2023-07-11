package com.capiroto.datastructure.vector;

public class Exer03 {
    public static void main(String[] args) {
        List<String> myList = new List<String>(); 
        myList.add("capirotoA");
        myList.add("capirotoB");
        myList.add("capirotoC");
        myList.add("capirotoD");

        System.out.println("Removing capirotoB? " + myList.remove("capirotoB"));
        System.out.println("Contains capirotoB? " + myList.contains("capirotoB"));
    }
    
}
