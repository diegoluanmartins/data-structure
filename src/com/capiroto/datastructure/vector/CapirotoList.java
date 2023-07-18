package com.capiroto.datastructure.vector;

import com.capiroto.datastructure.base.StaticDataStructure;

public class CapirotoList<T> extends StaticDataStructure<T> {
    
    private T[] elements;

    public CapirotoList() {
        super();
    }

    public CapirotoList(int initialCapacity) {
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
        if (!this.isValidPosition(pos)) {
            throw new IllegalArgumentException("Invalid position");
        }
        return elements[pos];
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
