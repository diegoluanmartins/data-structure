package com.cprt.datastructure.vector.test;

import com.cprt.datastructure.vector.Vector;

public class Aula03 {
    public static void main(String[] args) {
        Vector vector = new Vector(6);
        try {
            vector.add("cprt1");
            vector.add("cprt2");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
