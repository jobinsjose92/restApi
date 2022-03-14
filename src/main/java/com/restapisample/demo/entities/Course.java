package com.restapisample.demo.entities;

public class Course {

	private long id;
	private String title;
	private String descriptions;
	public Course(long id, String title, String descriptions) {
		super();
		this.id = id;
		this.title = title;
		this.descriptions = descriptions;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", descriptions=" + descriptions + "]";
	}
	
	
}
