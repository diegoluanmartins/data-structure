package com.capiroto.datastructure.vector.test;

import com.capiroto.datastructure.vector.Vector;

public class Aula03 {
    public static void main(String[] args){
        Vector vector = new Vector(6);
        try {
            vector.add("capiroto1");
            vector.add("capiroto2");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
