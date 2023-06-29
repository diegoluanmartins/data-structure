package com.capiroto.datastructure.vector.test;

import com.capiroto.datastructure.vector.Vector;

public class Aula04 {
    public static void main(String[] args) {
        Vector vector = new Vector(6);
        vector.add("capiroto1");
        vector.add("capiroto2");

        System.out.println(vector.size());

        System.out.println(vector.toString());
    }

}
