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
public class FacilityDistrict {

	private Integer firePrenventionDistricts;

	private Integer policeDistricts;

	private Integer supervisorDistricis;

	private Integer neighborhoods;

}
