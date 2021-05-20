package com.example.demo.design_patterns;

public class CreationalDesignPatternTest {

	public static void main(String[] args) {
		System.out.println("Enter car model name : ");
		String name = "Benz";// new Scanner(System.in).nextLine();
		Class object = CarFactory.getCarObjectByType(name);
		System.out.println(object.getClass());
	}
}
