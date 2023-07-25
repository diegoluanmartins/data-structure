package com.cprt.datastructure.stack.exercises;

import java.util.Arrays;
import java.util.List;

import javax.naming.SizeLimitExceededException;

import com.cprt.datastructure.stack.CprtStack;

public class Exer06 {

    public static List<String> OPEN_BRACKETS = Arrays.asList("(", "{", "[");
    public static List<String> CLOSE_BRACKETS = Arrays.asList(")", "}", "]");

    public static int getBracketState(String c) {
        if (OPEN_BRACKETS.contains(c)) {
            return 1;
        }
        if (CLOSE_BRACKETS.contains(c)) {
            return 0;
        }
        return -1;
    }

    public static boolean isValidString(String s) {
        CprtStack<String> brackets = new CprtStack<>();
        for (int i = 0; i < s.length(); i++) {
            String character = s.substring(i, i + 1);
            switch (getBracketState(character)) {
                case 0:
                    if (!brackets.isEmpty() && brackets.peek().equals(OPEN_BRACKETS.get(CLOSE_BRACKETS.indexOf(character)))) {
                        brackets.pop();
                    } else {
                        return false;
                    }
                    break;
                case 1:
                    brackets.push(character);
                    break;
            }
        }
        return brackets.isEmpty();
    }

    public static void main(String[] args) throws SizeLimitExceededException {
        String[] texts = new String[] { "((A+B)", "A+B(", ")A+B(-C)", "(A+B))-(C+D)", "((A+B)-(C)+D)", "", "A+B" };
        for (String text : texts) {
            System.out.println(text + " =  isValidString? = " + isValidString(text));
        }
    }
}
