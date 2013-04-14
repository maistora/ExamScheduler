package com.hackfmi.summer2013.exam.scheduler.dto;

public class TeacherCourseGroup {

	private Teacher teacher;
	private Course course;
	private Group group;
	
	public TeacherCourseGroup(Teacher teacher, Course course, Group group) {
		this.teacher = teacher;
		this.course = course;
		this.group = group;
	}

	public Teacher getTeacher() {
		return teacher;
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public Course getCourse() {
		return course;
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public Group getGroup() {
		return group;
	}
	
	public void setGroup(Group group) {
		this.group = group;
	}
}
