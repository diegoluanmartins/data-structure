package com.cprt.datastructure.stack;

import java.util.EmptyStackException;

import com.cprt.datastructure.base.StaticDataStructure;

public class CprtStack<T> extends StaticDataStructure<T> {
    
    public CprtStack(){
        super();
    }

    public CprtStack(int initialCapacity){
        super(initialCapacity);
    }

    public void push(T element){
        super.add(element);
    }

    /*
     * WARNING!
     * .peek() and .pop() methods have different ways of
     * handling empty stacks. This was done purposely to
     * test the code of both behaviours. In a real-life 
     * solution, both should have the same behaviou for 
     * empty stacks.
     */

    public T peek(){
        if(super.isEmpty()){
            throw new EmptyStackException();
        }
        return this.elements[size - 1];
    }

    public T pop(){
        if (super.isEmpty()){
            return null;
        }
        return this.elements[--size];
    }

    public boolean remove(T element){
        return super.remove(element);
    }

    public boolean remove(int pos){
        return super.remove(pos);
    }

}
