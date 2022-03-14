package com.restapisample.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restapisample.demo.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(14,"java","java is easy"));
		list.add(new Course(15,"c","c is easy"));
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Course getCourse(long courseid){
		Course c=null;
		 for(Course course: list)
		 {
			 if(course.getId()== courseid)
			 {
				 c=course;
				 break;
			 }
		 }
		
		return c;
	}
	

}
