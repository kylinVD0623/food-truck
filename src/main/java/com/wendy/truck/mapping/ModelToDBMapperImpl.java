package com.wendy.truck.mapping;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.wendy.truck.db.model.FacilityDistrict;
import com.wendy.truck.db.model.FacilityLocation;
import com.wendy.truck.db.model.FacilityPermit;
import com.wendy.truck.db.model.FacilityTypeCode;
import com.wendy.truck.db.model.FoodFacility;
import com.wendy.truck.db.model.PermitStatusCode;
import com.wendy.truck.model.WorkData;

@Component
class ModelToDBMapperImpl implements ModelToDBMapper {

	@Override
	public FoodFacility map(WorkData record) {
		FoodFacility result = FoodFacility.builder()
				.applicant(record.getApplicant())
				.facilityType(record.getFacilityType() != null ? FacilityTypeCode.fromValue(record.getFacilityType().name()) : null)
				.foodItems(record.getFoodItems())
				.schedule(record.getSchedule())
				.daysHours(record.getDaysHours())
				.facilityLocation(mapFacilityLocation(record))
				.facilityPermit(mapFacilityPermit(record))
				.facilityDistrict(mapFacilityDistrict(record))
				.build();

		return result;
	}
	
	@Override
	public List<FoodFacility> mapAll(List<WorkData> records) {
		return records.stream().map(this::map).collect(Collectors.toList());
	}
	
	private FacilityLocation mapFacilityLocation(WorkData record) {
		return FacilityLocation.builder()
				.locationId(record.getLocationId())
				.cnn(record.getCnn())
				.description(record.getLocationDescription())
				.address(record.getAddress())
				.block(record.getBlock())
				.lot(record.getLot())
				.blocklot(record.getBlocklot())
				.xCoordinate(record.getXCoordinate())
				.yCoordinate(record.getYCoordinate())
				.latitude(record.getLatitude())
				.longitude(record.getLongitude())
				.location(record.getLocation())
				.zipCode(record.getZipCode())
				.build();
	}
	
	private FacilityPermit mapFacilityPermit(WorkData record) {
		return FacilityPermit.builder()
				.permitNumber(record.getPermitNumber())
				.status(record.getPermitStatus() != null ? PermitStatusCode.fromValue(record.getPermitStatus().name()) : null)
				.noiSent(record.getNoiSent())
				.approvedDate(record.getApprovedDate())
				.receivedDate(record.getReceivedDate())
				.priorPermit(record.getPriorPermit())
				.expirationDate(record.getExpirationDate())
				.build();
	}
	
	private FacilityDistrict mapFacilityDistrict(WorkData record) {
		return FacilityDistrict.builder()
				.firePrenventionDistricts(record.getFirePrenventionDistricts())
				.policeDistricts(record.getPoliceDistricts())
				.supervisorDistricis(record.getSupervisorDistricis())
				.neighborhoods(record.getNeighborhoods())
				.build();
	}

}
