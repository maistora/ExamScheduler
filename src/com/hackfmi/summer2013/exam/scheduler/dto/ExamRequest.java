package com.hackfmi.summer2013.exam.scheduler.dto;

import java.util.Date;

public class ExamRequest {

	private int id;
	private Date day;
	private int duration;
	private boolean proposal;
	private Date submited;
	private String description;
	private boolean exam;
	private int room;
	private int teacherId;
	private int subjectId;
	private int specialtyId;
	private int groupId;
	
	public ExamRequest(int teacherId, int subjectId, int specialtyId,
			String day, int duration, boolean proposal,
			String submited, String description, boolean exam, int room) {
		this.day = day;
		this.duration = duration;
		this.proposal = proposal;
		this.submited = submited;
		this.description = description;
		this.exam = exam;
		this.room = room;
		this.teacherId = teacherId;
		this.subjectId = subjectId;
		this.specialtyId = specialtyId;
	}
	
	public ExamRequest(int teacherId, int subjectId, int specialtyId,
			int groupId, Date day, int duration, boolean proposal,
			Date submited, String description, boolean exam, int room) {
		this.day = day;
		this.duration = duration;
		this.proposal = proposal;
		this.submited = submited;
		this.description = description;
		this.exam = exam;
		this.room = room;
		this.teacherId = teacherId;
		this.subjectId = subjectId;
		this.specialtyId = specialtyId;
		this.groupId = groupId;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
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

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getSpecialtyId() {
		return specialtyId;
	}

	public void setSpecialtyId(int specialtyId) {
		this.specialtyId = specialtyId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
}
