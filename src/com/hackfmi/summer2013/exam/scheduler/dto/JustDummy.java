package com.hackfmi.summer2013.exam.scheduler.dto;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.hackfmi.summer2013.exam.scheduler.utils.DateSerializer;

public class JustDummy {

	private String name;
	private int number;
	private Date date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@JsonSerialize(using=DateSerializer.class)
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
