package com.cprt.datastructure.vector.test;

import com.cprt.datastructure.vector.Vector;

public class Aula06 {
    public static void main(String[] args) {
        Vector vector = new Vector(6);
        vector.add("cprt1");
        vector.add("cprt2");
        vector.add("cprt3");

        System.out.println(vector.get("cprt1"));
        System.out.println(vector.get("cprt666"));
    }

}
