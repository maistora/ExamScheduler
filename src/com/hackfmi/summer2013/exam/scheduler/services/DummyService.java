package com.hackfmi.summer2013.exam.scheduler.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hackfmi.summer2013.exam.scheduler.dao.DataBaseController;
import com.hackfmi.summer2013.exam.scheduler.dto.JustDummy;

@Service
public class DummyService {

	DataBaseController dbController;
	
	DummyService() {
		dbController = new DataBaseController();
	}
	
	public List<JustDummy> getDummies() {
		final ArrayList<JustDummy> dummies = new ArrayList<JustDummy>();
		for (int i = 0; i < 10; i++) {
			final JustDummy justDummy = new JustDummy();
			justDummy.setDate(new Date());
			justDummy.setName("Name-" + 1);
			justDummy.setNumber(i);
			
			dummies.add(justDummy);
		}
		return dummies;
	}
}
