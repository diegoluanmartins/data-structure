package com.cprt.datastructure.queue.test;

import com.cprt.datastructure.queue.CprtPriorityQueue;
import com.cprt.datastructure.queue.Pacient;

public class Aula24 {

    public static void main(String[] args) {
        CprtPriorityQueue<Pacient> queue = new CprtPriorityQueue<Pacient>();
        queue.push(new Pacient("Cprt1", 3));
        queue.push(new Pacient("Cprt2", 2));
        queue.push(new Pacient("Cprt3", 1));
        queue.push(new Pacient("Cprt4", 3));
        queue.push(new Pacient("Cprt5", 1));

        System.out.println(queue.toString() + " = " + queue.size() + " elements");

        System.out.println("first element = " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println("removing from queue = " + queue.remove() + " - remaining = " + queue.toString());
        }
    }

}
