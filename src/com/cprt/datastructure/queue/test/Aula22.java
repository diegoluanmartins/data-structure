package com.cprt.datastructure.queue.test;

import com.cprt.datastructure.queue.CprtQueue;

public class Aula22 {

    public static void main(String[] args){

        CprtQueue<Integer> queue = new CprtQueue<Integer>();

        queue.add(3);
        queue.add(5);
        queue.add(1);
        queue.add(8);
        
        System.out.println(queue.toString() + " = " + queue.size() + " elements");

        System.out.println("first element = " + queue.peek());
        
        while(!queue.isEmpty()){
            System.out.println("removing from queue = " + queue.remove() + " - remaining = " + queue.toString());
        }

    }
    
}
