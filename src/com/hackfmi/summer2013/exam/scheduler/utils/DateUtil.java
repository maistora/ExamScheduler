package com.hackfmi.summer2013.exam.scheduler.utils;

import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateUtil {

	private static final String SIMPLE_PATTERN = "yyyyMMdd";

	public static String dateToString(Date date) {
		final DateTimeFormatter dateFormatter = DateTimeFormat.forPattern(SIMPLE_PATTERN);
		return dateFormatter.print(new DateTime(date));
	}
}
