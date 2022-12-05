package com.wendy.truck.helper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.wendy.truck.model.WorkData;

public class CSVHelper {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List<WorkData> csvToFacilities(Path path) {
		try (CSVReader reader = new CSVReader(Files.newBufferedReader(path))) {

			List<WorkData> facilities = new ArrayList<WorkData>();

			CsvToBean<WorkData> csvToBean = new CsvToBeanBuilder(reader).withType(WorkData.class)
					.withIgnoreLeadingWhiteSpace(true).build();

			facilities = csvToBean.parse();

			return facilities;

		} catch (IOException e) {
			throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
		}
	}

}
