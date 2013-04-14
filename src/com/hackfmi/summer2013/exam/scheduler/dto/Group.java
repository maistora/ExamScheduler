package com.hackfmi.summer2013.exam.scheduler.dto;

public class Group {

	private int id;
	private Specialty specialty;
	private int year;
	private int number;
	
	public Group(int id, Specialty specialty, int year, int number) {
		this.id = id;
		this.specialty = specialty;
		this.year = year;
		this.number = number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
