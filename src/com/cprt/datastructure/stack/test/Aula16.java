package com.cprt.datastructure.stack.test;

import com.cprt.datastructure.stack.CprtStack;

public class Aula16 {

    public static void main(String[] args){
        CprtStack<Integer> stack = new CprtStack<Integer>();

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

        stack = new CprtStack<Integer>();
        
        System.out.println("peek empty stack = ");
        System.out.println(stack.peek());

    }
    
}
