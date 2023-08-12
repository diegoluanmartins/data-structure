package com.cprt.datastructure.base;
public class StaticDataStructure<T> {

    protected T[] elements;
    protected int size = 0;

    private static final Object[] EMPTY_ELEMENTDATA = {};
    
    public StaticDataStructure(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elements = (T[]) new Object[initialCapacity];
        } else{
            this.elements = (T[]) EMPTY_ELEMENTDATA;
        }
        this.size = 0;
    }
    
    public StaticDataStructure() {
        this(10);
    }

    protected boolean add(T element) {
        increaseCapacity();
        this.elements[size] = element;
        this.size++;
        return true;
    }

    protected boolean add(T element, int pos) {
        increaseCapacity();
        if (!this.isValidPosition(pos)) {
            throw new IllegalArgumentException("Invalid position");
        }
        // if (pos == this.size - 1) {
        //     return false;
        // }
        for (int i = this.size - 1; i >= pos; i--) {
            this.elements[i + 1] = this.elements[i];
        }
        this.elements[pos] = element;
        this.size++;
        return true;
    }

    public int size() {
        return this.size;
    }

    protected Object get(int pos) {
        if (!this.isValidPosition(pos)) {
            throw new IllegalArgumentException("Invalid position");
        }
        return this.elements[pos];
    }

    protected int indexOf(T element) {
        for (int i = 0; i < this.size; i++) {
            if (element.equals(this.elements[i])) {
                return i;
            }
        }
        return -1;
    }

    protected boolean remove(int pos) {
        if (!this.isValidPosition(pos)) {
            throw new IllegalArgumentException("Invalid position");
        }
        for (int i = pos; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;
        this.elements[this.size] = null;
        return true;
    }

    protected boolean remove(T element) {
        int pos = this.indexOf(element);
        if (pos > -1) {
            this.remove(pos);
            return true;
        } else {
            return false;
        }
    }

    public boolean contains(T element) {
        return this.indexOf(element) > -1;
    }

    protected int lastIndexOf(T element) {
        int lastIndex = -1;
        for (int i = this.size; i == 0; i--) {
            if (element.equals(this.elements[i])) {
                lastIndex = i;
                break;
            }
        }
        return lastIndex;
    }

    public boolean clear() {
        this.elements = (T[]) EMPTY_ELEMENTDATA;
        this.size = 0;
        return true;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public String toString(String additionalSeparator) {
        StringBuilder s = new StringBuilder();
        s.append("[" + additionalSeparator);
        for (int i = 0; i < this.size - 1; i++) {
            s.append(this.elements[i]);
            s.append(", " + additionalSeparator);
        }

        if (this.size > 0) {
            s.append(this.elements[this.size - 1]);
        }

        s.append(additionalSeparator + "]");

        return s.toString();
    }

    @Override
    public String toString() {
        return this.toString("");
    }

    protected boolean isValidPosition(int pos) {
        return (!(pos > this.size - 1 || pos < 0) || pos == 0);
    }

    private void increaseCapacity() {
        if (this.size == this.elements.length) {
            T[] newElements = (T[]) new Object[(this.elements.length + 1) * 2];
            for (int i = 0; i < this.size; i++) {
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }

    
}
