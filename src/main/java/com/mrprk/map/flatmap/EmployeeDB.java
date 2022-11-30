package com.mrprk.map.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDB {

	public static List<Employee> getAllEmp() {
		return Stream
				.of(new Employee(101, "Atim", Arrays.asList("976543565", "986824452")),
						new Employee(102, "John", Arrays.asList("8768245622", "80025624413")),
						new Employee(143, "Vickey", Arrays.asList("90086543454", "70052456241")))
				.collect(Collectors.toList());
	}

}
