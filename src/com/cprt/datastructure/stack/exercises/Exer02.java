package com.cprt.datastructure.stack.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.naming.SizeLimitExceededException;

import com.cprt.datastructure.stack.CprtStack;

public class Exer02 {
    private static int MAX_SIZE = 10;
    private static int MIN_SIZE = 10;

    public static void evenAndOdd(List<Integer> nums) throws SizeLimitExceededException{
        if (!isValidSize(nums)) throw new SizeLimitExceededException("MIN_SIZE = [" + MIN_SIZE +  "] to MAX_SIZE = [" + MAX_SIZE + "]");
        CprtStack<Integer> evenStack = new CprtStack<>();
        CprtStack<Integer> oddStack = new CprtStack<>();
        for(int num:nums){
            if(num == 0){
                if(evenStack.isEmpty() || oddStack.isEmpty()){
                    System.out.println("Empty num stack");
                }
                evenStack.pop();
                oddStack.pop();
                continue;
            }
            if((num%2) == 0){
                evenStack.push(num);
            } else {
                oddStack.pop();
            }
        }
        if(!evenStack.isEmpty()) System.out.println("Even stack = ");
        while(!evenStack.isEmpty()){
            System.out.println(evenStack.pop());
        }
        if(!oddStack.isEmpty()) System.out.println("Odd stack = ");
        while(!oddStack.isEmpty()){
            System.out.println(oddStack.pop());
        }
    }
    
    public static boolean isValidSize(List<?> ls){
        return ls.size() >= MIN_SIZE && ls.size() <= MAX_SIZE;
    }


    public static void main(String[] args) throws SizeLimitExceededException{       
        List<List<Integer>> tests = new ArrayList<>();
        tests.add(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        tests.add(List.of(5, 10, 0, 0, 15, 0, 1, 20, 0, 25));
        tests.add(List.of(0, 0, 3, 0, 7, 10, 12, 0, 0, 20));
        tests.add(List.of(2, 0, 9, 8, 0, 5, 0, 3, 0, 1));
        tests.add(List.of(1, 6, 0, 12, 0, 0, 20, 0, 15, 0));
        tests.add(List.of(0, 0, 7, 3, 6, 0, 0, 5, 0, 8));
        tests.add(List.of(4, 15, 20, 1, 7, 0, 0, 0, 0, 0));
        tests.add(List.of(9, 8, 0, 0, 25, 0, 0, 0, 0, 3));
        tests.add(List.of(0, 0, 0, 2, 0, 0, 4, 0, 0, 0));
        tests.add(List.of(1, 0, 4, 0, 0, 0, 0, 8, 9, 12));
        tests.add(List.of(0, 10, 0, 15, 0, 2, 0, 7, 0, 0));
        tests.add(List.of(2, 3, 6, 7, 8, 5, 12, 13, 14, 15));
        tests.add(List.of(2, 4, 6, 10, 8, 16, 12, 18, 14, 15));
        for(List<Integer> test:tests){
            System.out.println("\nTesting the sequence: " + test.toString());
            evenAndOdd(test);
        }

    }
}
