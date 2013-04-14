package com.hackfmi.summer2013.exam.scheduler.controllers;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.hackfmi.summer2013.exam.scheduler.dto.JustDummy;
import com.hackfmi.summer2013.exam.scheduler.services.DummyService;

@Controller
@RequestMapping("/calendar")
public class CalendarController {

	@Autowired
	private DummyService dummyService;
	
	@Autowired
	private View jsonView;
	
	private Logger log = Logger.getLogger(CalendarController.class);
	
	@RequestMapping("/load")
	public ModelAndView loadCalendar() {
		return createNewErrorResponse("loadCalendar placeholder");
	}
	
	@RequestMapping("/getSubjects")
	public ModelAndView getSubjects() {
		return createNewErrorResponse("getSubjects placeholder");
	}
	
	@RequestMapping("/getSpecialty")
	public ModelAndView getSpecialty() {
		return createNewErrorResponse("getSpecialty placeholder");
	}
	
	@RequestMapping("/getGroups")
	public ModelAndView getGroups() {
		return createNewErrorResponse("getGroups placeholder");
	}
	
	@RequestMapping("/saveExam")
	public ModelAndView saveExam() {
		return createNewErrorResponse("saveExam placeholder");
	}

	public ModelAndView createNewErrorResponse(String message) {
		return new ModelAndView(jsonView, "errorMsg", message);
	}
}
