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
		specialties.put(0, new Specialty(0, "Информатика"));
		specialties.put(1, new Specialty(1, "Компютърни науки"));
		specialties.put(2, new Specialty(2, "Информационни системи"));
		specialties.put(3, new Specialty(3, "Софтуерно инженерство"));
		specialties.put(4, new Specialty(4, "Математика"));
		specialties.put(5, new Specialty(5, "Статистика"));
		specialties.put(6, new Specialty(6, "Математика и Информатика"));
		
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
		
		teachers.put(0, new Teacher(0, "Иван Петров", "проф."));
		teachers.put(1, new Teacher(1, "Владимир Димитров", "доц."));
		teachers.put(2, new Teacher(2, "Калинка Калоянова", "проф."));
		teachers.put(3, new Teacher(3, "Марин Димитров", "доц."));
		teachers.put(4, new Teacher(4, "Стефан Чинтулов", "проф."));
		
		courses.put(0, new Course(0, "Дизайн и анализ на алгоритми"));
		courses.put(1, new Course(1, "Анализ I"));
		courses.put(2, new Course(2, "Анализ II"));
		courses.put(3, new Course(3, "Информатика"));
		courses.put(4, new Course(4, "ООП"));
		courses.put(5, new Course(5, "Бази данни"));
		courses.put(6, new Course(6, "Алгебрични структури"));
		
		students.put(71151, new Student(71151, "Елиза Иванова", groups.get(0)));
		students.put(85214, new Student(85214, "Весела Маринова", groups.get(1)));
		students.put(32146, new Student(32146, "Деян Ризов", groups.get(2)));
		students.put(65485, new Student(65485, "Петър Калинов", groups.get(0)));
	}
}
