package com.capiroto.datastructure.stack.test;

import java.util.Stack;

public class Aula18 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        System.out.println("Stack = " + stack);
        System.out.println("size = " + stack.size());
        System.out.println("isEmpty? = " + stack.isEmpty());

        for (int i = 0; i < 13; i++) {
            stack.push(i);
        }

        System.out.println("Stack = " + stack);
        System.out.println("size = " + stack.size());
        System.out.println("isEmpty? = " + stack.isEmpty());
        System.out.println("pop = " + stack.pop());
        System.out.println("Stack = " + stack);

        stack = new Stack<Integer>();
        System.out.println("Stack = " + stack);
        System.out.println("pop empty stack = " + stack.pop());
        System.out.println("peek empty stack = " + stack.peek());
    }

}
