package com.wendy.truck.service;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.wendy.truck.db.model.FacilityTypeCode;
import com.wendy.truck.db.model.FoodFacility;
import com.wendy.truck.db.repository.FoodFacilityRepository;
import com.wendy.truck.helper.CSVHelper;
import com.wendy.truck.mapping.ModelToDBMapper;
import com.wendy.truck.model.WorkData;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
class FoodFacilityServiceImpl implements FoodFacilityService {

	private static final String CSV_PATH = "src/main/resources/datacsv/Mobile_Food_Facility_Permit.csv";

	private FoodFacilityRepository repository;

	private ModelToDBMapper mapper;

	@PostConstruct
	public void init() {
		prepareData(Paths.get(CSV_PATH));
	}

	@Override
	public void prepareData(Path path) {
		List<WorkData> records = CSVHelper.csvToFacilities(path);
		List<FoodFacility> result = (List<FoodFacility>) repository.saveAll(mapper.mapAll(records));
		result.forEach(facility -> {
			log.info("Insert FoodFacility to database: " + facility.toString());
		});
	}

	@Override
	public List<FoodFacility> getAllFoodFacilities() {
		List<FoodFacility> facilities = repository.findAll();
		return facilities;
	}

	@Override
	public List<FoodFacility> getAllFoodTrucks() {
		List<FoodFacility> facilities = repository.findAllByFacilityType(FacilityTypeCode.TRUCK);
		return facilities;
	}

	@Override
	public List<FoodFacility> getTrucksbyFoodItem(String foodName) {
		List<FoodFacility> facilities = repository.findByFoodItemsLike("%" + foodName + "%");
		return facilities;
	}

}
