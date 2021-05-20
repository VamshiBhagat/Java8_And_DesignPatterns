package com.example.demo.design_patterns;

public enum SampleEnum {

	SUNDAY("sun"), 
	MONDAY("mon"), 
	TUESDAY("tue"), 
	WEDNESDAY("wed"), 
	THURSDAY("thu"), 
	FRIDAY("fri"), 
	SATURDAY("sat"),
	VAMSHI("vamshi krishna");

	private String number;

	SampleEnum(String i) {
		number = i;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
