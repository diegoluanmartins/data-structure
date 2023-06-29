package com.capiroto.datastructure.vector;

import java.util.Arrays;

public class Vector {
    
    private String[] elements;
    private int size;

    public Vector(int size){
        this.elements = new String[size];
        this.size = 0;
    }

    // public void add(String element){
    //     for(int i=0; i < this.elements.length; i++){
    //         if(this.elements[i] == null){
    //             this.elements[i] = element;
    //             break;
    //         }
    //     }
    // }

    // public void add(String element) throws Exception{
    //     if (size < this.elements.length){
    //         this.elements[size] = element;
    //         this.size++;
    //     }
    //     else{
    //         throw new Exception("out of bounds");
    //     }
    // }

    public boolean add(String element){
        if (size < this.elements.length){
            this.elements[size] = element;
            this.size++;
            return true;
        }
        return false;
    }

    public int size(){
        return this.size;
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < size -1; i++){
            s.append(this.elements[i]);
            s.append(", ");
        }

        if (this.size > 0){
            s.append(this.elements[this.size - 1]);
        }

        s.append("]");

        return s.toString();
    }

}
