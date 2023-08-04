package com.cprt.datastructure.queue.util;

public class PrintDocument implements Comparable<Pacient> {

    private String name;
    private int pageQty;

    
    public PrintDocument() {}

    public PrintDocument(String name, int pageQty) {
        this.name = name;
        this.pageQty = pageQty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageQty() {
        return pageQty;
    }

    public void setPageQty(int priority) {
        this.pageQty = priority;
    }

    @Override
    public int compareTo(Pacient o) {
        return Integer.valueOf(this.pageQty).compareTo(o.getPriority());
    }

    @Override
    public String toString() {
        return "PrintDocument [name=" + name + ", pageQty=" + pageQty + "]";
    }
    
}
