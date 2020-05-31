package com.learning.implementation;

public class Employee {

	private String name;

	private String age;

	public Employee(String name, String age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "(Name - " + name + " age - " + age+" )";
	}

}
