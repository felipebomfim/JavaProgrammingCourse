package com.in28minutes.oops.level2.book;

public class Review {

    private int id;
    private String comment;
    private int rate;

    public Review(int id, String comment, int rate) {
        // TODO Auto-generated constructor stub
        this.id = id;
        this.comment = comment;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Review [id = " + id + ", comment = " + comment + ", rate = " + rate + "]";
    }
    
    

}
