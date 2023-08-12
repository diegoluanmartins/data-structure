package com.cprt.datastructure.stack.exercises;

import javax.naming.SizeLimitExceededException;

import com.cprt.datastructure.stack.CprtStack;
import com.cprt.datastructure.stack.util.Book;

public class Exer03 {

    public static void bookStack() throws SizeLimitExceededException{
        CprtStack<Book> books = new CprtStack<>(20);
        books.push(new Book("Effective Java", "978-0134685991", 2017, "Joshua Bloch"));
        books.push(new Book("Java: The Complete Reference", "978-1260440232", 2019, "Herbert Schildt"));
        books.push(new Book("Head First Java", "978-0596009205", 2005, "Kathy Sierra and Bert Bates"));
        books.push(new Book("Java Concurrency in Practice", "978-0321349606", 2006,
                            "Brian Goetz, Tim Peierls, Joshua Bloch, Joseph Bowbeer, David Holmes, and Doug Lea"));
        books.push(new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "978-0132350884", 2008,
                            "Robert C. Martin"));
        books.push(new Book("Java: How to Program", "978-0134743356", 2017, "Paul Deitel and Harvey Deitel"));

        //toString
        System.out.println(".toString() = " + books.toString("\n"));

        //push
        books.push(new Book("Java Programming 101", "978-1987654321", 2023, "Jane Smith"));
        System.out.println(".push() = " + books.toString("\n"));

        //peek
        System.out.println(".peek() = " + books.peek());

        //contains
        System.out.println(".contains(Java: How to Program, 978-0134743356, 2017, Paul Deitel and Harvey Deitel) = " +  books.contains(new Book("Java: How to Program", "978-0134743356", 2017, "Paul Deitel and Harvey Deitel")));

        //pop
        System.out.println("before .pop() = " + books.toString("\n"));
        books.pop();
        System.out.println("after .pop() = " + books.toString("\n"));


    }
    
    public static void main(String[] args) throws SizeLimitExceededException{       
        bookStack();
    }
}
