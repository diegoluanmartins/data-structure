package com.capiroto.datastructure.stack.test;

import com.capiroto.datastructure.stack.CapirotoStack;

public class Aula16 {

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
        System.out.println("peek = " + stack.peek());

        stack = new CapirotoStack<Integer>();
        
        System.out.println("peek empty stack = ");
        System.out.println(stack.peek());

    }
    
}
