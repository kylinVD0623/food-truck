package com.wendy.truck.model;

import com.opencsv.bean.AbstractBeanField;
import com.opencsv.exceptions.CsvConstraintViolationException;
import com.opencsv.exceptions.CsvDataTypeMismatchException;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class FacilityTypeCodeConverter extends AbstractBeanField {

	@Override
	protected Object convert(String value) throws CsvDataTypeMismatchException, CsvConstraintViolationException {
		return FacilityTypeCode.fromValue(value);
	}

}
