package com.cprt.datastructure.queue;
import java.util.EmptyStackException;

import com.cprt.datastructure.base.StaticDataStructure;

public class CprtQueue<T> extends StaticDataStructure<T> {

    public CprtQueue(){
        super();
    }

    public CprtQueue(int initialCapacity){
        super(initialCapacity);
    }

    public void push(T element){
        super.add(element);
    }

    public T peek(){
        if(super.isEmpty()){
            throw new EmptyStackException();
        }
        return this.elements[0];
    }

    public T remove(){
        T element = this.peek();
        super.remove(0);
        return element;
    }  
    
}
