package com.cprt.datastructure.queue.test;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {

    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue);

        System.out.println(queue.toString() + " = " + queue.size() + " elements");

        System.out.println("first element = " + queue.peek());
        
        while(!queue.isEmpty()){
            System.out.println("removing from queue = " + queue.remove() + " - remaining = " + queue.toString());
        }
    }
    
}
