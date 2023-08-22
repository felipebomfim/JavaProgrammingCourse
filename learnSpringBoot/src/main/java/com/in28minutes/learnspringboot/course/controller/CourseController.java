package com.in28minutes.learnspringboot.course.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learnspringboot.course.bean.Course;
import com.in28minutes.learnspringboot.course.repository.CourseRepository;



@RestController
public class CourseController {
//	public List<Course> courses = Arrays.asList(new Course(1,"Learn Microservices","in28minutes"),
//			new Course(2,"Learn Full Stack with Angular and React","Felipe"));
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		return courseRepository.findAll();
	}
	
	@GetMapping("/courses/{id}")
	public Optional<Course> getCourse(@PathVariable long id){
//		Optional<Course> course = courses.stream().filter(c -> c.getId() == id).findFirst();
		Optional<Course> course = courseRepository.findById(id);
	    return course;
	}

}
