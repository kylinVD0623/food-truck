package com.wendy.truck.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wendy.truck.db.model.FoodFacility;
import com.wendy.truck.service.FoodFacilityService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class FoodFacilityController {

	private FoodFacilityService service;

	@GetMapping("/food-facilities")
	public ResponseEntity<List<FoodFacility>> getAllFacilities() {
		try {
			List<FoodFacility> facilities = new ArrayList<FoodFacility>();

			service.getAllFoodFacilities().forEach(facilities::add);

			if (facilities.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(facilities, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/food-truck")
	public ResponseEntity<List<FoodFacility>> getAllTrucks() {
		try {
			List<FoodFacility> facilities = new ArrayList<FoodFacility>();

			service.getAllFoodTrucks().forEach(facilities::add);

			if (facilities.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(facilities, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
