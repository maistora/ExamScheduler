package com.hackfmi.summer2013.exam.scheduler.dto;

public class Student {

	private int facultyNumber;
	private String name;
	private Group group;
	
	public Student(int facultyNumber, String name, Group group) {
		this.facultyNumber = facultyNumber;
		this.name = name;
		this.group = group;
	}

	public int getFacultyNumber() {
		return facultyNumber;
	}
	
	public void setFacultyNumber(int facultyNumber) {
		this.facultyNumber = facultyNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Group getGroup() {
		return group;
	}
	
	public void setGroup(Group group) {
		this.group = group;
	}
}
