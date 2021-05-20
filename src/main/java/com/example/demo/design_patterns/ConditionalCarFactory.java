package com.example.demo.design_patterns;

//Factory Pattern using conditional If statements.
public class ConditionalCarFactory {

	private static Car car = null;

	public static Car getCarObjectBasedOnCarType(String type) {

		if (type.equalsIgnoreCase("alto")) {
			car = new AltoCar();
		} else if (type.equalsIgnoreCase("audi")) {
			car = new AudiCar();
		} else if (type.equalsIgnoreCase("benz")) {
			car = new BenzCar();
		}

		return car;
	}

	public Car get(String type) {

		Car car = null;

		if (type.equalsIgnoreCase("alto")) {
			car = new AltoCar();
		} else if (type.equalsIgnoreCase("audi")) {
			car = new AudiCar();
		} else if (type.equalsIgnoreCase("benz")) {
			car = new BenzCar();
		}

		return car;
	}
}
