package com.capiroto.datastructure.vector;

public class Exer01 {
    public static void main(String[] args) {
        List<String> myList = new List<String>(); 
        myList.add("capirotoA");
        myList.add("capirotoB");
        myList.add("capirotoC");

        System.out.println("My list contains capirotoB? " + myList.contains("capirotoB"));
        System.out.println("My list contains capirotoD? " + myList.contains("capirotoD"));
    }
}