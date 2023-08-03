package com.cprt.datastructure.queue.util;

public class Pacient implements Comparable<Pacient> {

    private String name;
    private int priority;

    
    public Pacient() {}

    public Pacient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Pacient o) {
        return Integer.valueOf(this.priority).compareTo(o.getPriority());
        // if(this.priority > o.getPriority()){
        //     return 1;
        // } else if (this.priority < o.getPriority()){
        //     return -1;
        // }
        // return 0;
    }

    @Override
    public String toString() {
        return "Pacient [name=" + name + ", priority=" + priority + "]";
    }
    
}
