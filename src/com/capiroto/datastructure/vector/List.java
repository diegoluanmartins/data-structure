package com.capiroto.datastructure.vector;

import java.lang.reflect.Array;

public class List<T> {

    private T[] elements;
    private int size;

    public List() {
        this.elements = (T[]) new Object[size];
        this.size = 0;
    }

    public List(int size, Class<T> classType) {
        this.elements = (T[]) Array.newInstance(classType, size);
        this.size = 0;
    }

    public boolean add(T element) {
        increaseCapacity();
        this.elements[size] = element;
        this.size++;
        return true;
    }

    public boolean add(T element, int pos) {
        increaseCapacity();
        if (!this.isValidPosition(pos)) {
            throw new IllegalArgumentException("Invalid position");
        }
        if (pos == this.size - 1) {
            return false;
        }
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

    public Object get(int pos) {
        if (!this.isValidPosition(pos)) {
            throw new IllegalArgumentException("Invalid position");
        }
        return elements[pos];
    }

    public int indexOf(T element) {
        for (int i = 0; i < this.size; i++) {
            if (element.equals(this.elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean remove(int pos) {
        if (!this.isValidPosition(pos)) {
            throw new IllegalArgumentException("Invalid position");
        }
        for (int i = pos; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;
        return true;
    }

    public boolean remove(T element) {
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

    public int lastIndexOf(T element) {
        int lastIndex = -1;
        for (int i = 0; i < this.size; i++) {
            if (element.equals(this.elements[i])) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.size - 1; i++) {
            s.append(this.elements[i]);
            s.append(", ");
        }

        if (this.size > 0) {
            s.append(this.elements[this.size - 1]);
        }

        s.append("]");

        return s.toString();
    }

    private boolean isValidPosition(int pos) {
        return !(pos > this.size - 1 || pos < 0);
    }

    private void increaseCapacity() {
        if (this.size == this.elements.length) {
            T[] newElements = (T[]) new Object[this.elements.length * 2];
            for (int i = 0; i < this.size; i++) {
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }

}