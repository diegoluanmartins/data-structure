package com.cprt.datastructure.vector;

public class Vector {

    private Object[] elements;
    private int size;

    public Vector(int size) {
        this.elements = new Object[size];
        this.size = 0;
    }

    public boolean add(Object element) {
        increaseCapacity();
        if (size < this.elements.length) {
            this.elements[size] = element;
            this.size++;
            return true;
        }
        return false;
    }

    public boolean add(Object element, int pos){
        increaseCapacity();
        if (!this.isValidPosition(pos)){
            throw new IllegalArgumentException("Invalid position");
        }
        if (pos == this.size - 1){
            return false;
        }
        for (int i = this.size - 1; i >= pos; i--){
            this.elements[i+1] = this.elements[i];
        }
        this.elements[pos] = element;
        this.size++;
        return true;
    }

    public int size() {
        return this.size;
    }

    public Object get(int pos) {
        if (!this.isValidPosition(pos)){
            throw new IllegalArgumentException("Invalid position");
        }
        return elements[pos];
    }

    public int get(Object obj) {
        for (int i = 0; i < this.elements.length; i++) {
            if (obj.equals(this.elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean remove(int pos){
        if (!this.isValidPosition(pos)){
            throw new IllegalArgumentException("Invalid position");
        }
        for (int i = pos; i < this.size - 1; i++){
            this.elements[i] = this.elements[i+1];
        }
        this.size--;
        return true;
    }

    public boolean remove(Object element){
        int pos = this.get(element);
        if (pos > -1){
            this.remove(pos);
            return true;
        } else {
            return false;
        }
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

    private boolean isValidPosition(int pos){
        return !(pos > this.size - 1 || pos < 0);
    }

    private void increaseCapacity(){
        if (this.size == this.elements.length){
            Object[] newElements = new Object[this.elements.length * 2];
            for(int i=0; i<this.size; i++){
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }

}
