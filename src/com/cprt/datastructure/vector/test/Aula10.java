package com.cprt.datastructure.vector.test;

import com.cprt.datastructure.vector.Vector;

public class Aula10 {
    public static void main(String[] args) {
        Vector vector = new Vector(3);
        vector.add("cptrB");
        vector.add("cptrC");
        vector.add(666);
        vector.add(true);
        vector.add("cptrF"); 
        vector.add("cptrG");

        vector.add("cptr666A", 0);

        vector.remove(3);

        System.out.println(vector.toString());
    }

}
