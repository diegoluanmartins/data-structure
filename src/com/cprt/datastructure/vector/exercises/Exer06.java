package com.cprt.datastructure.vector.exercises;

import com.cprt.datastructure.vector.CprtList;
import com.cprt.datastructure.vector.util.Contact;

public class Exer06 {
    public static void main(String[] args) {
        CprtList<Contact> myList = new CprtList<Contact>(20); 

        
        for (int i = 0; i < 30; i++){
            myList.add(new Contact("cprt " + i, "666 669 " + i*3));
        }

        System.out.println(myList.toString("\n")); 

        //add
        myList.add(new Contact("cprt 666", "666 999 666"), 0);
        System.out.println("add(element, pos) = " + myList.toString("\n")); 
        
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
        System.out.println("remove(cprt 1, 666 669 3) = " + myList.toString("\n"));
        myList.remove(6);
        System.out.println("remove(6) = " + myList.toString("\n"));

        //Clear
        myList.clear();
        System.out.println("clear = " + myList.toString());

    }


}
