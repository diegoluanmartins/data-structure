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

    public boolean add(T element){
        return super.add(element);
    }

    public T peek(){
        if(super.isEmpty()){
            throw new EmptyStackException();
        }
        return super.elements[POS];
    }

    public T remove(){
        T element = this.peek();
        super.remove(POS);
        return element;
    }

    
}
