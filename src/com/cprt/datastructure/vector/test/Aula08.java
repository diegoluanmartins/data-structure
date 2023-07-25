package com.cprt.datastructure.vector.test;

import com.cprt.datastructure.vector.Vector;

public class Aula08 {
    public static void main(String[] args) {
        Vector vector = new Vector(3);
        vector.add("cprtB");
        vector.add("cprtC");
        vector.add("cprtD");
        vector.add("cprtE");
        vector.add("cprtF"); 
        vector.add("cprtG");

        vector.add("cprt666A", 0);

        System.out.println(vector.toString());
    }

}
