package com.in28minutes.learnspringboot.course.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//import com.in28minutes.learnspringboot.course.bean.Course;

class Course {

	private int id;
	private String name;
	private String author;

	public Course(int id, String name, String author) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public int getId() {
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

@RestController
public class CourseController {
	public List<Course> courses = Arrays.asList(new Course(1,"Learn Microservices","in28minutes"),
			new Course(2,"Learn Full Stack with Angular and React","Felipe"));
	
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		return this.courses;
	}
	
	@GetMapping("/courses/{id}")
	public Optional<Course> getCourse(@PathVariable int id){
		Optional<Course> course = courses.stream().filter(c -> c.getId() == id).findFirst();
		return course;
	}

}
