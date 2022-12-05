package com.wendy.truck.db.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "FoodFacility")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class FoodFacility {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "applicant")
	private String applicant;

	@Column(name = "facilityType")
	@Enumerated(EnumType.STRING)
	private FacilityTypeCode facilityType;

	@Column(name = "foodItems", length = 500)
	private String foodItems;

	@Column(name = "schedule")
	private String schedule;

	@Column(name = "daysHours")
	private String daysHours;

	@Embedded
	@AttributeOverride(name = "locationId", column = @Column(name = "locationId"))
	@AttributeOverride(name = "cnn", column = @Column(name = "cnn"))
	@AttributeOverride(name = "description", column = @Column(name = "locationDescription"))
	@AttributeOverride(name = "address", column = @Column(name = "address"))
	@AttributeOverride(name = "block", column = @Column(name = "block"))
	@AttributeOverride(name = "lot", column = @Column(name = "lot"))
	@AttributeOverride(name = "blocklot", column = @Column(name = "blocklot"))
	@AttributeOverride(name = "xCoordinate", column = @Column(name = "xCoordinate"))
	@AttributeOverride(name = "yCoordinate", column = @Column(name = "yCoordinate"))
	@AttributeOverride(name = "latitude", column = @Column(name = "latitude"))
	@AttributeOverride(name = "longitude", column = @Column(name = "longitude"))
	@AttributeOverride(name = "location", column = @Column(name = "location"))
	@AttributeOverride(name = "zipCode", column = @Column(name = "zipCode"))
	private FacilityLocation facilityLocation;

	@Embedded
	@AttributeOverride(name = "permitNumber", column = @Column(name = "permitNumber"))
	@AttributeOverride(name = "status", column = @Column(name = "permitStatus"))
	@AttributeOverride(name = "noiSent", column = @Column(name = "noiSent"))
	@AttributeOverride(name = "approvedDate", column = @Column(name = "approvedDate"))
	@AttributeOverride(name = "receivedDate", column = @Column(name = "receivedDate"))
	@AttributeOverride(name = "priorPermit", column = @Column(name = "priorPermit"))
	@AttributeOverride(name = "expirationDate", column = @Column(name = "expirationDate"))
	private FacilityPermit facilityPermit;

	@Embedded
	@AttributeOverride(name = "firePrenventionDistricts", column = @Column(name = "firePrenventionDistricts"))
	@AttributeOverride(name = "policeDistricts", column = @Column(name = "policeDistricts"))
	@AttributeOverride(name = "supervisorDistricis", column = @Column(name = "supervisorDistricis"))
	@AttributeOverride(name = "neighborhoods", column = @Column(name = "neighborhoods"))
	private FacilityDistrict facilityDistrict;

}
