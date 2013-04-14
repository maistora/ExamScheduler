package com.hackfmi.summer2013.exam.scheduler.dao;

import java.util.HashMap;
import java.util.Map;
import com.hackfmi.summer2013.exam.scheduler.dto.*;

public class DataBaseController {
	public static Map<Integer, Group> groups = new HashMap<>();
	public static Map<Integer, Teacher> teachers = new HashMap<>();
	public static Map<Integer, Course> courses = new HashMap<>();
	public static Map<Integer, Student> students = new HashMap<>();
	public static Map<Integer, ExamRequest> exams;
	public static Map<Integer, Specialty> specialties = new HashMap<>();
	public static Map<Integer, Vote> votes;
	public static Map<Integer, TeacherCourseGroup> teacherCourseGroups;
	
	public static void init() {
		specialties.put(0, new Specialty(0, "�����������"));
		specialties.put(1, new Specialty(1, "���������� �����"));
		specialties.put(2, new Specialty(2, "������������� �������"));
		specialties.put(3, new Specialty(3, "��������� �����������"));
		specialties.put(4, new Specialty(4, "����������"));
		specialties.put(5, new Specialty(5, "����������"));
		specialties.put(6, new Specialty(6, "���������� � �����������"));
		
		int counter = 0;
		int specialty = 0;
		int groupNumber = 1;
		
		while(specialty < 7)
		{
			groupNumber = 1;
			while(groupNumber < 5)
			{
				groups.put(counter, new Group(counter, specialties.get(specialty), 2010, groupNumber));
				counter++;
				groupNumber++;
			}
			specialty++;
		}
		
		teachers.put(0, new Teacher(0, "���� ������", "����."));
		teachers.put(1, new Teacher(1, "�������� ��������", "���."));
		teachers.put(2, new Teacher(2, "������� ���������", "����."));
		teachers.put(3, new Teacher(3, "����� ��������", "���."));
		teachers.put(4, new Teacher(4, "������ ��������", "����."));
		
		courses.put(0, new Course(0, "������ � ������ �� ���������"));
		courses.put(1, new Course(1, "������ I"));
		courses.put(2, new Course(2, "������ II"));
		courses.put(3, new Course(3, "�����������"));
		courses.put(4, new Course(4, "���"));
		courses.put(5, new Course(5, "���� �����"));
		courses.put(6, new Course(6, "���������� ���������"));
		
		students.put(71151, new Student(71151, "����� �������", groups.get(0)));
		students.put(85214, new Student(85214, "������ ��������", groups.get(1)));
		students.put(32146, new Student(32146, "���� �����", groups.get(2)));
		students.put(65485, new Student(65485, "����� �������", groups.get(0)));
	}
}
