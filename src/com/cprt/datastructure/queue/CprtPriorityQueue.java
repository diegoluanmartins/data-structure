package com.cprt.datastructure.queue;

public class CprtPriorityQueue<T> extends CprtQueue<T> {

    public void push(T element) {
        Comparable<T> key = (Comparable<T>) element;
        int i;
        if (this.size() == 0) {
            i = 0;
        } else {
            for (i = this.size(); i > 0; i--) {
                if (key.compareTo(this.elements[i-1]) >= 0) {
                    break;
                }
            }
        }
        super.add(element, i);
    }

}
