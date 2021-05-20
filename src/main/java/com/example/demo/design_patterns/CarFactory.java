package com.example.demo.design_patterns;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {

	private static Map<String, Object> map = new HashMap<>();

	static {
		map.put("Audi", AudiCar.class);
		map.put("Alto", AltoCar.class);
		map.put("Benz", BenzCar.class);
	}

	public static Class getCarObjectByType(String type) {
		Object object = map.get(type);
		return object;
	}
}
