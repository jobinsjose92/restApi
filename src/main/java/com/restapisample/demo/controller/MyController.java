package com.restapisample.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.restapisample.demo.entities.Course;
import com.restapisample.demo.services.CourseService;


@RestController 

public class MyController {

	@Autowired
	private CourseService courseservice;
	
	@GetMapping("/home")
	
	public String home(){
		return "this is homepage";
	}
	
	//to get courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseservice.getCourses();
		
	}
	
	@GetMapping("/courses/{courseid}")
	public Course getCourse(@PathVariable String courseid){
		return this.courseservice.getCourse(Long.parseLong(courseid));
		
	}
	
	
}
