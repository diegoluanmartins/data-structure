package com.capiroto.datastructure.vector;

public class Exer06 {
    public static void main(String[] args) {
        List<Contact> myList = new List<Contact>(20); 

        
        for (int i = 0; i < 30; i++){
            myList.add(new Contact("Capiroto " + i, "666 669 " + i*3));
        }


        System.out.println(myList);
        System.out.println("List cleared? " + myList.clear());
        System.out.println(myList);
    }

}
