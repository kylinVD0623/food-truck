package com.wendy.truck.db.model;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FacilityTypeCode {

	TRUCK("TRUCK"),

	PUSH_CART("PUSH_CART");

	private String value;

	public static FacilityTypeCode fromValue(String value) {
		return Arrays.stream(FacilityTypeCode.values()).filter(s -> s.getValue().equals(value)).findFirst()
				.orElse(null);
	}

}
