package com.cprt.datastructure.queue;

public class CprtPriorityQueue<T> extends CprtQueue<T> {

    public void push(T element) {
        Comparable<T> key = (Comparable<T>) element;
        int i;
        for (i = super.size() - 1; i >= 0; i--) {
            if (key.compareTo(super.elements[i]) >= 0) {
                break;
            }
        }
        i++;
        if (i == super.size()) {
            super.add(element);
        } else {
            super.add(element, i);
        }
    }

}
