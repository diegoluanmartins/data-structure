package com.cprt.datastructure.vector.test;

import com.cprt.datastructure.vector.Vector;

public class Aula04 {
    public static void main(String[] args) {
        Vector vector = new Vector(6);
        vector.add("cprt1");
        vector.add("cprt2");

        System.out.println(vector.size());

        System.out.println(vector.toString());
    }

}
