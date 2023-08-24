package com.in28minutes.learnspringboot.course.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
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
	public Course getCourse(@PathVariable long id){
//		Optional<Course> course = courses.stream().filter(c -> c.getId() == id).findFirst();
		Optional<Course> course = courseRepository.findById(id);
		
		if (course.isEmpty()){
			throw new RuntimeException("Course not found with id"+ id);
		}
		
	    return course.get();
	}
	
	@PostMapping("/courses")
	public void createCourse(@RequestBody Course course){
		courseRepository.save(course);
	}
	
	@PutMapping("/courses/{id}")
	public void updateCourse(@PathVariable long id, @RequestBody Course course) {
		courseRepository.save(course);
	}

	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable long id) {
		courseRepository.deleteById(id);
	}

	
}
