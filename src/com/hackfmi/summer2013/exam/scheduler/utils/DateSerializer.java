package com.hackfmi.summer2013.exam.scheduler.utils;

import java.io.IOException;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

public class DateSerializer extends JsonSerializer<Date> {

	@Override
	public void serialize(Date date, JsonGenerator jsonGen, SerializerProvider serializerProvider)
			throws IOException, JsonProcessingException {
		jsonGen.writeString(DateUtil.dateToString(date));
	}
}
