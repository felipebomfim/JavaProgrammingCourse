package com.in28minutes.oops.level2.book;

import java.util.ArrayList;

public class Book {
    private int id;
    private String title;
    private String author;
    private ArrayList <Review> reviews;

    public Book(int id, String title, String author) {
        // TODO Auto-generated constructor stub
        super();
        this.id = id;
        this.title = title;
        this.author = author;
        this.reviews = new ArrayList<Review>();
    }

    public void addReview(Review review) {
        // TODO Auto-generated method stub
        reviews.add(review);
    }

    @Override
    public String toString() {
        return "Book [id = " + id + ", title = " + title + ", author = " + author + ", reviews = " + reviews + "]";
    }

}
