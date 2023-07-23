package com.capiroto.datastructure.stack.test;

import com.capiroto.datastructure.stack.CapirotoStack;

public class Aula17 {

    public static void main(String[] args){
        CapirotoStack<Integer> stack = new CapirotoStack<Integer>();

        System.out.println("Stack = " + stack);
        System.out.println("size = " + stack.size());
        System.out.println("isEmpty? = " + stack.isEmpty());

        for (int i = 0; i < 13; i++){
            stack.push(i);
        }

        System.out.println("Stack = " + stack);
        System.out.println("size = " + stack.size());
        System.out.println("isEmpty? = " + stack.isEmpty());
        System.out.println("pop = " + stack.pop());
        System.out.println("Stack = " + stack);

        stack = new CapirotoStack<Integer>();
        System.out.println("Stack = " + stack);
        System.out.println("pop empty stack = " + stack.pop());
    }
    
}
