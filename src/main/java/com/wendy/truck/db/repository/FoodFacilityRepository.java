package com.wendy.truck.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wendy.truck.db.model.FacilityTypeCode;
import com.wendy.truck.db.model.FoodFacility;

@Repository
public interface FoodFacilityRepository extends JpaRepository<FoodFacility, Long> {

	List<FoodFacility> findAllByFacilityType(FacilityTypeCode facilityType);

}
