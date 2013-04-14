package com.hackfmi.summer2013.exam.scheduler.dto;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.hackfmi.summer2013.exam.scheduler.utils.DateSerializer;

public class Exam {

	private int id;
	private Date day;
	private int duration;
	private boolean proposal;
	private Date submited;
	private String description;
	private boolean exam;
	private int room;
	private TeacherCourseGroup techerCourseGroup;
	
	public Exam(int id, Date day, int duration, boolean proposal,
			Date submited, String description, boolean exam, int room,
			TeacherCourseGroup techerCourseGroup) {
		super();
		this.id = id;
		this.day = day;
		this.duration = duration;
		this.proposal = proposal;
		this.submited = submited;
		this.description = description;
		this.exam = exam;
		this.room = room;
		this.techerCourseGroup = techerCourseGroup;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@JsonSerialize(using=DateSerializer.class)
	public Date getDay() {
		return day;
	}
	
	public void setDay(Date day) {
		this.day = day;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public boolean isProposal() {
		return proposal;
	}
	
	public void setProposal(boolean proposal) {
		this.proposal = proposal;
	}
	
	public Date getSubmited() {
		return submited;
	}
	
	public void setSubmited(Date submited) {
		this.submited = submited;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isExam() {
		return exam;
	}
	
	public void setExam(boolean exam) {
		this.exam = exam;
	}
	
	public int getRoom() {
		return room;
	}
	
	public void setRoom(int room) {
		this.room = room;
	}
	
	public TeacherCourseGroup getTecherCourseGroup() {
		return techerCourseGroup;
	}
	
	public void setTecherCourseGroup(TeacherCourseGroup techerCourseGroup) {
		this.techerCourseGroup = techerCourseGroup;
	}
}
