package com.cprt.datastructure.stack.test;

import com.cprt.datastructure.stack.CprtStack;

public class Aula14 {

    public static void main(String[] args){

        CprtStack<Integer> stack = new CprtStack<Integer>();

        for (int i = 0; i < 13; i++){
            stack.push(i);
        }

        System.out.println(stack);
        System.out.println(stack.size());
        

    }
    
}
