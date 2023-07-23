package com.capiroto.datastructure.stack.exercises;

import javax.naming.SizeLimitExceededException;

import com.capiroto.datastructure.stack.CapirotoStack;

public class Exer07 {

    public static String convertDecToBinary(Integer num) {
        if (num <= 1) {
            return num.toString();
        }
        return convertDecToBinary(Math.floorDiv(num, 2)) + num % 2;
    }

    public static String convertDecToBinaryWithStack(Integer num) {
        CapirotoStack<String> binStack = new CapirotoStack<>();
        while (num > 1) {
            Integer division = Math.floorDiv(num, 2);
            Integer mod = num % 2;
            binStack.push(mod.toString());
            num = division;
        }
        binStack.push(num.toString());
        String binVal = "";
        while (!binStack.isEmpty()) {
            binVal = binVal + binStack.pop();
        }
        return binVal;
    }

    public static void main(String[] args) throws SizeLimitExceededException {
        int[] decs = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 };
        for (int dec : decs) {
            System.out.println(dec + " = [recursion] = " + convertDecToBinary(dec) + "  [stack] = "
                    + convertDecToBinaryWithStack(dec));
        }
    }
}
