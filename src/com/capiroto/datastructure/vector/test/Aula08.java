package com.capiroto.datastructure.vector.test;

import com.capiroto.datastructure.vector.Vector;

public class Aula08 {
    public static void main(String[] args) {
        Vector vector = new Vector(3);
        vector.add("capirotoB");
        vector.add("capirotoC");
        vector.add("capirotoD");
        vector.add("capirotoE");
        vector.add("capirotoF"); 
        vector.add("capirotoG");

        vector.add("capiroto666A", 0);

        System.out.println(vector.toString());
    }

}
