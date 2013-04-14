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
@RequestMapping("/dummy")
public class DummyController {

	@Autowired
	private DummyService dummyService;
	
	@Autowired
	private View jsonView;
	
	private Logger log = Logger.getLogger(DummyController.class);
	
	@RequestMapping("/getAll")
	public ModelAndView getDummies() {
		List<JustDummy> dummies = null;
		
		try {
			dummies = dummyService.getDummies();
		} catch (Exception e) {
			log.error(e.getMessage());
			return createNewErrorResponse(e.getMessage());
		}
		
		return new ModelAndView(jsonView, "dummies", dummies);
	}

	public ModelAndView createNewErrorResponse(String message) {
		return new ModelAndView(jsonView, "errorMsg", message);
	}
}
