package com.project.cafeemployeemanagement.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.project.cafeemployeemanagement.constant.Constants;

public class CustomTimeDeserialize extends JsonDeserializer<Date> {

    @Override
    public Date deserialize(JsonParser p, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {
        SimpleDateFormat formatter = new SimpleDateFormat(Constants.TIME_FORMAT);

        try {
            return formatter.parse(p.getText());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return ctxt.parseDate(p.getText());
    }
}
