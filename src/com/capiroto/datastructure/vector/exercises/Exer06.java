package com.capiroto.datastructure.vector.exercises;

import com.capiroto.datastructure.vector.CapirotoList;
import com.capiroto.datastructure.vector.util.Contact;

public class Exer06 {
    public static void main(String[] args) {
        CapirotoList<Contact> myList = new CapirotoList<Contact>(20); 

        
        for (int i = 0; i < 30; i++){
            myList.add(new Contact("Capiroto " + i, "666 669 " + i*3));
        }


        System.out.println(myList);
        System.out.println("List cleared? " + myList.clear());
        System.out.println(myList);
    }

}
