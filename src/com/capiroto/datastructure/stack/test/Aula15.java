package com.capiroto.datastructure.stack.test;

import com.capiroto.datastructure.stack.CapirotoStack;

public class Aula15 {

    public static void main(String[] args){
        CapirotoStack<Integer> stack = new CapirotoStack<Integer>();

        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

        for (int i = 0; i < 13; i++){
            stack.push(i);
        }
        
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

    }
    
}
