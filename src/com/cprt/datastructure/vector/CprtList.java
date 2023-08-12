package com.cprt.datastructure.vector;

import com.cprt.datastructure.base.StaticDataStructure;

public class CprtList<T> extends StaticDataStructure<T> {
    
    private T[] elements;

    public CprtList() {
        super();
    }

    public CprtList(int initialCapacity) {
        super(initialCapacity);
    }

    public boolean add(T element) {
        return super.add(element);
    }

    public boolean add(T element, int pos) {
        return super.add(element, pos);
    }

    public int size() {
        return super.size();
    }

    public Object get(int pos) {
        return super.get(pos);
    }

    public int indexOf(T element) {
        return super.indexOf(element);
    }

    public boolean remove(int pos) {
        return super.remove(pos);
    }

    public boolean remove(T element) {
        return super.remove(element);
    }

    public boolean contains(T element) {
        return super.contains(element);
    }

    public int lastIndexOf(T element) {
        return super.lastIndexOf(element);
    }

    public boolean clear() {
        return super.clear();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String toString(String additionalSeparator) {
        return super.toString(additionalSeparator);
    }

    protected boolean isValidPosition(int pos) {
        return super.isValidPosition(pos);
    }

}
