package com.capiroto.datastructure.vector.test;

import com.capiroto.datastructure.vector.Vector;

public class Aula10 {
    public static void main(String[] args) {
        Vector vector = new Vector(3);
        vector.add("capirotoB");
        vector.add("capirotoC");
        vector.add(666);
        vector.add(true);
        vector.add("capirotoF"); 
        vector.add("capirotoG");

        vector.add("capiroto666A", 0);

        vector.remove(3);

        System.out.println(vector.toString());
    }

}
