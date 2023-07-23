package com.capiroto.datastructure.stack.exercises;

import javax.naming.SizeLimitExceededException;

import com.capiroto.datastructure.stack.CapirotoStack;

public class Exer05 {

    public static boolean isPalindrome(String s) {
        CapirotoStack<String> palindrome = new CapirotoStack<>(s.length() / 2);
        int middle = s.length() % 2;
        for (int i = 0; i < s.length() / 2; i++) {
            palindrome.push(s.substring(i, i + 1));
        }
        for (int i = s.length() / 2 + middle; i < s.length(); i++) {
            if (s.substring(i, i + 1).equalsIgnoreCase(palindrome.pop()))
                continue;
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws SizeLimitExceededException {
        String[] texts = new String[] { "AAAAA", "AAAAAA", "ADDFDDA", "AABCCBAA", "ABFFBB", "ADDFFDDA", "ADDFDDDA" };
        for (String text : texts) {
            System.out.println(text + " =  isPalindrome? = " + isPalindrome(text));
        }
    }
}
