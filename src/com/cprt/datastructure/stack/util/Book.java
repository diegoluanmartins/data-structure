package com.cprt.datastructure.stack.util;

public class Book {
    
    private String name;
    private String isbn;
    private int releaseYear;
    private String authorName;

    public Book(String name, String isbn, int releaseYear, String authorName) {
        this.name = name;
        this.isbn = isbn;
        this.releaseYear = releaseYear;
        this.authorName = authorName;
    }

    public Book() {
        this("", null, 0, null);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
        result = prime * result + releaseYear;
        result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (isbn == null) {
            if (other.isbn != null)
                return false;
        } else if (!isbn.equals(other.isbn))
            return false;
        if (releaseYear != other.releaseYear)
            return false;
        if (authorName == null) {
            if (other.authorName != null)
                return false;
        } else if (!authorName.equals(other.authorName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", isbn=" + isbn + ", releaseYear=" + releaseYear + ", authorName=" + authorName
                + "]";
    }
    
}
