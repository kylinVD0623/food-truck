package com.wendy.truck.model;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FacilityTypeCode {

	TRUCK("Truck"),

	PUSH_CART("Push Cart");

	private String value;

	public static FacilityTypeCode fromValue(String value) {
		return Arrays.stream(FacilityTypeCode.values()).filter(s -> s.getValue().equals(value)).findFirst()
				.orElse(null);
	}

}
