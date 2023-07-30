package com.in28minutes.oops.level2.book;

public class BookRunner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Book book = new Book(123, "Object Oriented Programming with Java", "Felipe");
        book.addReview(new Review(10, "great book", 5));
        book.addReview(new Review(101, "Awesome", 5));
        
        System.out.println(book);
    }

}
