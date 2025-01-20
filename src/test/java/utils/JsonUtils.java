package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.experimental.UtilityClass;
import models.DatePickerData;
import models.EnvData;


import java.io.FileNotFoundException;
import java.io.FileReader;

@UtilityClass
public class JsonUtils {
	private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
	private static final String RESOURCES_PATH = "src/test/resources/";
	public final String TEST_DATA_PATH = RESOURCES_PATH + "test-data/";
	public final String DATE_PICKER_DATA_PATH = TEST_DATA_PATH + "datePickerData.json";
	private final String ENVIRONMENT_PATH = RESOURCES_PATH + "environment/env.json";


	public EnvData getEnvData() {
		return deserializeJson(ENVIRONMENT_PATH, EnvData.class);
	}

	public DatePickerData getPostData() {
		return deserializeJson(DATE_PICKER_DATA_PATH, DatePickerData.class);
	}

	private <T> T deserializeJson(String filePath, Class<T> tClass) {
		try {
			return gson.fromJson(new FileReader(filePath), tClass);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}
