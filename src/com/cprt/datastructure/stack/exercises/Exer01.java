package com.cprt.datastructure.stack.exercises;

import java.util.ArrayList;
import java.util.List;

import javax.naming.SizeLimitExceededException;

import com.cprt.datastructure.stack.CprtStack;

public class Exer01 {

    private static int MAX_SIZE = 10;
    private static int MIN_SIZE = 10;

    public static void evenOrOdd(List<Integer> nums) throws SizeLimitExceededException{
        if (!isValidSize(nums)) throw new SizeLimitExceededException("MIN_SIZE = [" + MIN_SIZE +  "] to MAX_SIZE = [" + MAX_SIZE + "]");
        CprtStack<Integer> stack = new CprtStack<>();
        for(int num:nums){
            if((num%2) == 0){
                stack.push(num);
            } else{
                if(stack.isEmpty()){
                    System.out.println("Empty even num stack");
                } else{
                    stack.pop();
                }
            }
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
    
    public static boolean isValidSize(List<?> ls){
        return ls.size() >= MIN_SIZE && ls.size() <= MAX_SIZE;
    }


    public static void main(String[] args) throws SizeLimitExceededException{       
        List<List<Integer>> tests = new ArrayList<>();
        tests.add(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        tests.add(List.of(3, 8, 2, 6, 9, 5, 4, 7, 1, 10));
        tests.add(List.of(2, 5, 7, 3, 1, 8, 10, 4, 6, 9));
        tests.add(List.of(9, 2, 1, 5, 7, 6, 4, 10, 3, 8));
        tests.add(List.of(7, 9, 4, 6, 8, 10, 2, 1, 5, 3));
        tests.add(List.of(10, 4, 1, 5, 9, 6, 3, 2, 7, 8));
        tests.add(List.of(6, 8, 2, 3, 4, 9, 5, 1, 7, 10));
        tests.add(List.of(5, 9, 2, 6, 7, 10, 1, 3, 8, 4));
        tests.add(List.of(1, 10, 2, 7, 3, 8, 4, 5, 6, 9));
        tests.add(List.of(3, 9, 6, 8, 1, 7, 10, 2, 5, 4));
        tests.add(List.of(2, 3, 8, 7, 9, 6, 1, 4, 5, 10));
        tests.add(List.of(2, 3, 6, 7, 8, 5, 12, 13, 14, 15));
        tests.add(List.of(2, 4, 6, 10, 8, 16, 12, 18, 14, 15));
        for(List<Integer> test:tests){
            System.out.println("\nTesting the sequence: " + test.toString());
            evenOrOdd(test);
        }

    }
    
}
