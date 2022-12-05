package com.wendy.truck.service;

import java.nio.file.Path;
import java.util.List;

import com.wendy.truck.db.model.FoodFacility;

public interface FoodFacilityService {

	void prepareData(Path csvPath);

	List<FoodFacility> getAllFoodFacilities();

	List<FoodFacility> getAllFoodTrucks();

	List<FoodFacility> getTrucksbyFoodItem(String foodName);

}
