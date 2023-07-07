package com.capiroto.datastructure.vector.test;

import com.capiroto.datastructure.vector.Vector;
import java.util.ArrayList;
import java.util.List;

public class Aula06 {
    public static void main(String[] args) {

        ArrayList<String> vector = new List<String>();
        vector.add("capirotoB");
        vector.add("capirotoC");
        vector.add("capirotoF"); 
        vector.add("capirotoG");

        vector.add(0, "capirotoA");

        vector.contains("capirotoA");

    }

}
