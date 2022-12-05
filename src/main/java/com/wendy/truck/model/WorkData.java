package com.wendy.truck.model;

import java.util.Date;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvCustomBindByName;
import com.opencsv.bean.CsvDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WorkData {

	@CsvBindByName(column = "Applicant")
	private String applicant;

	@CsvCustomBindByName(column = "FacilityType", converter = FacilityTypeCodeConverter.class)
	private FacilityTypeCode facilityType;

	@CsvBindByName(column = "FoodItems")
	private String foodItems;

	@CsvBindByName(column = "Schedule")
	private String schedule;

	@CsvBindByName(column = "dayshours")
	private String daysHours;

	@CsvBindByName(column = "locationid")
	private Long locationId;

	@CsvBindByName(column = "cnn")
	private Long cnn;

	@CsvBindByName(column = "LocationDescription")
	private String locationDescription;

	@CsvBindByName(column = "Address")
	private String address;

	@CsvBindByName(column = "block")
	private String block;

	@CsvBindByName(column = "lot")
	private String lot;

	@CsvBindByName(column = "blocklot")
	private String blocklot;

	@CsvBindByName(column = "X")
	private Double xCoordinate;

	@CsvBindByName(column = "Y")
	private Double yCoordinate;

	@CsvBindByName(column = "Latitude")
	private Double latitude;

	@CsvBindByName(column = "Longitude")
	private Double longitude;

	@CsvBindByName(column = "Location")
	private String location;

	@CsvBindByName(column = "Zip Codes")
	private String zipCode;

	@CsvBindByName(column = "permit")
	private String permitNumber;

	@CsvCustomBindByName(column = "Status", converter = PermitStatusCodeConverter.class)
	private PermitStatusCode permitStatus;

	@CsvBindByName(column = "NOISent")
	private String noiSent;

	@CsvBindByName(column = "Approved")
	@CsvDate("MM/dd/yyyy")
	private Date approvedDate;

	@CsvBindByName(column = "Received")
	@CsvDate("yyyyMMdd")
	private Date receivedDate;

	@CsvBindByName(column = "PriorPermit")
	private Integer priorPermit;

	@CsvBindByName(column = "ExpirationDate")
	@CsvDate("MM/dd/yyyy hh:mm:ss a")
	private Date expirationDate;

	@CsvBindByName(column = "Fire Prevention Districts")
	private Integer firePrenventionDistricts;

	@CsvBindByName(column = "Police Districts")
	private Integer policeDistricts;

	@CsvBindByName(column = "Supervisor Districts")
	private Integer supervisorDistricis;

	@CsvBindByName(column = "Neighborhoods (old)")
	private Integer neighborhoods;

}
