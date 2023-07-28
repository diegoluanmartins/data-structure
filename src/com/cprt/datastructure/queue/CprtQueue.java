package com.cprt.datastructure.queue;
import java.util.EmptyStackException;

import com.cprt.datastructure.base.StaticDataStructure;

public class CprtQueue<T> extends StaticDataStructure<T> {

    private static int POS = 0;

    public CprtQueue(){
        super();
    }

    public CprtQueue(int initialCapacity){
        super(initialCapacity);
    }

    public void push(T element){
        this.add(element);
    }

    public T peek(){
        if(super.isEmpty()){
            throw new EmptyStackException();
        }
        return this.elements[POS];
    }

    public T remove(){
        T element = this.peek();
        this.remove(POS);
        return element;
    }

    
}
