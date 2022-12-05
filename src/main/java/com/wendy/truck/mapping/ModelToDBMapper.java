package com.wendy.truck.mapping;

import java.util.List;

import com.wendy.truck.db.model.FoodFacility;
import com.wendy.truck.model.WorkData;

public interface ModelToDBMapper {

	FoodFacility map(WorkData record);

	List<FoodFacility> mapAll(List<WorkData> records);

}
