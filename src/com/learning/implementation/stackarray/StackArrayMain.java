package com.learning.implementation.stackarray;

import com.learning.implementation.Employee;

public class StackArrayMain {

	public static void main(String[] args) {

		StackArray<Employee> emp = new StackArray<Employee>(5);
		emp.push(new Employee("Malatesh", "29"));
		emp.push(new Employee("Vanitha", "25"));
		emp.push(new Employee("Surendra", "22"));
		emp.push(new Employee("Kiran", "54"));
		emp.push(new Employee("Raman", "45"));
		emp.printElements();
		System.out.println("Size of stack is - " + emp.size());
		emp.pop();
		emp.printElements();
		System.out.println("Size of stack is - " + emp.size());
		emp.push(new Employee("Rajesh", "45"));
		emp.push(new Employee("Karesh", "40"));
		emp.printElements();
		System.out.println("Size of stack is - " + emp.size());
		emp.pop();
		emp.printElements();
		System.out.println("Size of stack is - " + emp.size());
	}

}
