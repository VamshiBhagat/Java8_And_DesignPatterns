package com.example.demo.models;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Student {

	private int id;
	private String name;
	private int age;
	private String country;

	public Student() {
		super();
	}

	public Student(int id, String name, int age, String country) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void getResourceData() throws IOException {
		ClassLoader loader = this.getClass().getClassLoader();
		File file = new File(loader.getResource("sample.txt").getFile());
		System.out.println(new String(Files.readAllBytes(file.toPath())));
		
	}
}
