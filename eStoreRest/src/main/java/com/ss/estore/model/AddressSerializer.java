package com.ss.estore.model;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class AddressSerializer extends JsonSerializer<List<Address>> {
	@Override
	public void serialize(List<Address> value, JsonGenerator jgen,
			SerializerProvider provider) throws IOException,
			JsonProcessingException {
		jgen.writeStartArray();
		for (Address model : value) {
			jgen.writeStartObject();
			jgen.writeObjectField("address", model);
			jgen.writeEndObject();
		}
		jgen.writeEndArray();
	}
}
