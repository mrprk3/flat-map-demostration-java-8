package com.mrprk.map.flatmap;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeController {

	public static void main(String[] args) {
		// here i am getting all list of employee
		List<Employee> employees = EmployeeDB.getAllEmp();

		// Lets collect all names from employees
		// here i am using the map() to perform one to one mapping
		List<String> names = employees.stream().map((emp) -> emp.getName()).collect(Collectors.toList());
		System.out.println(names);

		// lets collect all phones number using map
		List<List<String>> phNumbers = employees.stream().map((i) -> i.getPhone()).collect(Collectors.toList());
		System.out.println(phNumbers);

		// Lets collect all the phone numbers in single list
		// To perform this operation we need to use flatMap() many to one

		List<String> phones = employees.stream().flatMap((i) -> i.getPhone().stream()).collect(Collectors.toList());
		System.out.println(phones);

	}
}