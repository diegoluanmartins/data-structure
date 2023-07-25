package com.cprt.datastructure.vector.exercises;

import java.util.ArrayList;
import java.util.List;

import com.cprt.datastructure.vector.util.Contact;

public class Exer07 {
    public static void main(String[] args) {
        List<Contact> myList = new ArrayList<Contact>(20); 

        
        for (int i = 0; i < 30; i++){
            myList.add(new Contact("cprt " + i, "666 669 " + i*3));
        }

        System.out.println(myList.toString()); 

        //add
        myList.add(0, new Contact("cprt 666", "666 999 666"));
        System.out.println("add(element, pos) = " + myList.toString()); 
        
        //contains
        System.out.println("contains(cprt 1, 666 669 3) = " + myList.contains(new Contact("cprt 1", "666 669 3")));
        
        //get
        System.out.println("get(0) = " + myList.get(0));
        
        //indexOf
        System.out.println("indexOf(cprt 1, 666 669 3) = " + myList.indexOf(new Contact("cprt 1", "666 669 3")));

        //lastIndexOf
        System.out.println("lastIndexOf(cprt 1, 666 669 3) = " + myList.lastIndexOf(new Contact("cprt 1", "666 669 3")));

        //remove
        myList.remove(new Contact("cprt 1", "666 669 3"));
        System.out.println("remove(cprt 1, 666 669 3) = " + myList.toString());
        myList.remove(6);
        System.out.println("remove(6) = " + myList.toString());

        //Clear
        myList.clear();
        System.out.println("clear = " + myList.toString());

    }


}
