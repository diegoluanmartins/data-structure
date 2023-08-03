package com.cprt.datastructure.queue.test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import com.cprt.datastructure.queue.util.Pacient;

public class Aula25 {

    public static void main(String[] args) {
        // Queue<Pacient> queue = new PriorityQueue<Pacient>(
        //     new Comparator<Pacient>(){
        //         @Override
        //         public int compare(Pacient p1, Pacient p2){
        //             if(p1.getPriority() > p2.getPriority()){
        //                 return 1;
        //             } else if (p1.getPriority() > p2.getPriority()){
        //                 return -11;
        //             }
        //             return 0;
        //         }
        //     }
        // );

        Queue<Pacient> queue = new PriorityQueue<Pacient>(
            new Comparator<Pacient>(){
                @Override
                public int compare(Pacient p1, Pacient p2){
                    return Integer.valueOf(p1.getPriority()).compareTo(p2.getPriority());
                }
            }
        );

        queue.add(new Pacient("Cprt1", 3));
        queue.add(new Pacient("Cprt2", 2));
        queue.add(new Pacient("Cprt3", 1));
        queue.add(new Pacient("Cprt4", 3));
        queue.add(new Pacient("Cprt5", 1));

        System.out.println(queue.toString() + " = " + queue.size() + " elements");

        System.out.println("first element = " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println("removing from queue = " + queue.remove() + " - remaining = " + queue.toString());
        }
    }

}
