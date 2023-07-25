package com.cprt.datastructure.stack.exercises;

import java.util.Stack;

public class Exer08 {

    public static String convertDecToBinary(Integer num) {
        if (num <= 1) {
            return num.toString();
        }
        return convertDecToBinary(Math.floorDiv(num, 2)) + num % 2;
    }

    public static Stack<Integer> getMinimumHanoiMovements(Integer n, Stack<Integer> source, Stack<Integer> dest,
            Stack<Integer> passing) {

        if (n > 0) {
            getMinimumHanoiMovements(n - 1, source, passing, dest);
            dest.push(source.pop());
            System.out.println("source = " + source);
            System.out.println("dest = " + dest);
            System.out.println("passing = " + passing);
            System.out.println("\n");
            getMinimumHanoiMovements(n - 1, passing, dest, source);
        }

        return dest;
    }

    public static void main(String[] args) {
        int[] decs = new int[] { 3};
        for (int dec : decs) {
            Stack<Integer> source = new Stack<>();
            for(int i = dec; i >= 1; i-- ) {
                source.push(i);
            }
            System.out.println("source = " + source.toString() + "\n");
            System.out.println("end = " + getMinimumHanoiMovements(dec, source, new Stack<Integer>(), new Stack<Integer>()).toString() + "\n");
        }
    }
}
