package com.wendy.truck.db.model;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FacilityPermit {

	private String permitNumber;

	@Enumerated(EnumType.STRING)
	private PermitStatusCode status;

	private String noiSent;

	private Date approvedDate;

	private Date receivedDate;

	private Integer priorPermit;

	private Date expirationDate;

}
