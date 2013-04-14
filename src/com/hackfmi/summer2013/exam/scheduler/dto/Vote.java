package com.hackfmi.summer2013.exam.scheduler.dto;

public class Vote {

	private ExamRequest exam;
	private Student student;
	private int vote;
	
	public Vote(ExamRequest exam, Student student, int vote) {
		this.exam = exam;
		this.student = student;
		this.vote = vote;
	}

	public ExamRequest getExam() {
		return exam;
	}
	
	public void setExam(ExamRequest exam) {
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
