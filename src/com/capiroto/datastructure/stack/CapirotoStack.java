package com.capiroto.datastructure.stack;

import java.util.EmptyStackException;

import com.capiroto.datastructure.base.StaticDataStructure;

public class CapirotoStack<T> extends StaticDataStructure<T> {
    
    public CapirotoStack(){
        super();
    }

    public CapirotoStack(int initialCapacity){
        super(initialCapacity);
    }

    public void push(T element){
        super.add(element);
    }

    public boolean isEmpty(){
        return super.isEmpty();
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
        if (this.isEmpty()){
            return null;
        }
        return this.elements[--size];
    }

}
