package com.in28minutes.learnspringboot.course.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Course {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
	private long id;
    
	private String name;
	private String author;
	
	public Course() {
	    super();
	}
	
	public Course(int id, String name, String author) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	

}
