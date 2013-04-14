package com.hackfmi.summer2013.exam.scheduler.dto;

public class Teacher {
	
	private int id;
	private String name;
	private String title;
	
	public Teacher(int id, String name, String title)
	{
		setId(id);
		setName(name);
		setTitle(title);
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
}
