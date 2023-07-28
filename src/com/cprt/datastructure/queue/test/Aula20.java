package com.cprt.datastructure.queue.test;

import com.cprt.datastructure.queue.CprtQueue;

public class Aula20 {

    public static void main(String[] args){

        CprtQueue<Integer> queue = new CprtQueue<Integer>();

        queue.push(3);
        queue.push(5);
        queue.push(1);
        queue.push(8);
        
        System.out.println(queue.toString() + " = " + queue.size() + " elements");

        System.out.println("first element = " + queue.peek());
        
        while(!queue.isEmpty()){
            System.out.println("removing from queue = " + queue.remove() + " - remaining = " + queue.toString());
        }

    }
    
}
