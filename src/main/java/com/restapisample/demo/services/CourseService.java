package com.restapisample.demo.services;

import java.util.List;

import com.restapisample.demo.entities.Course;

public interface CourseService {

	public List<Course> getCourses();
	public Course getCourse(long courseid);
	
}
