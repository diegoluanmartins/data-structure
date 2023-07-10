package com.capiroto.datastructure.vector.test;

import java.util.ArrayList;
import java.util.List;

public class Aula12 {
    public static void main(String[] args) {

        List<String> vector = new ArrayList<String>();
        vector.add("capirotoB");
        vector.add("capirotoC");
        vector.add("capirotoF"); 
        vector.add("capirotoG");

        vector.add(0, "capirotoA");

        vector.contains("capirotoA");

    }

}
