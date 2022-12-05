package com.wendy.truck.model;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PermitStatusCode {

	APPROVED("APPROVED"),

	EXPIRED("EXPIRED"),

	ISSUED("ISSUED"),

	ONLINE("ONLINE"),

	REQUESTED("REQUESTED"),

	SUSPEND("SUSPEND");

	private String value;

	public static PermitStatusCode fromValue(String value) {
		return Arrays.stream(PermitStatusCode.values()).filter(s -> s.getValue().equals(value)).findFirst()
				.orElse(null);
	}

}
