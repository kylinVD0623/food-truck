package com.wendy.truck.db.model;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FacilityLocation {

	private Long locationId;

	private Long cnn;

	private String description;

	private String address;

	private String block;

	private String lot;

	private String blocklot;

	private Double xCoordinate;

	private Double yCoordinate;

	private Double latitude;

	private Double longitude;

	private String location;

	private String zipCode;

}
