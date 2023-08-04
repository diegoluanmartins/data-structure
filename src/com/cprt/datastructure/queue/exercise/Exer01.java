package com.cprt.datastructure.queue.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.cprt.datastructure.queue.CprtQueue;

public class Exer01 {

    private CprtQueue printingQueue = new CprtQueue<>();

    public static void main(String[] args) throws IOException {

        while (true) {
            System.out.println("Inform document to print: path quantity");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            String name = reader.readLine();
            System.out.println(name);
        }

    }

    private static void printDocumentQueue(int i) {
        new Thread() {
            @Override
            public void run() {
                for (int t = 0; t < 1000000; t++) {
                }
                System.out.println("printing " + i);

            }
        }.start();
    }

}
