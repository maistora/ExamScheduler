package com.hackfmi.summer2013.exam.scheduler.dto;

public class Vote {

	private Exam exam;
	private Student student;
	private int vote;
	
	public Vote(Exam exam, Student student, int vote) {
		super();
		this.exam = exam;
		this.student = student;
		this.vote = vote;
	}

	public Exam getExam() {
		return exam;
	}
	
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public int getVote() {
		return vote;
	}
	
	public void setVote(int vote) {
		this.vote = vote;
	}
}
