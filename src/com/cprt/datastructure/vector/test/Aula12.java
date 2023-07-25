package com.cprt.datastructure.vector.test;

import java.util.ArrayList;
import java.util.List;

public class Aula12 {
    public static void main(String[] args) {

        List<String> vector = new ArrayList<String>();
        vector.add("cptrB");
        vector.add("cptrC");
        vector.add("cptrF"); 
        vector.add("cptrG");

        vector.add(0, "cptrA");

        vector.indexOf("cptrA");

    }

}
