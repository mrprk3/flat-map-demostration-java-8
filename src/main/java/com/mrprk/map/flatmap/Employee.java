package com.mrprk.map.flatmap;

import java.util.List;

public class Employee {

	private int id;

	private String name;

	private List<String> phone;

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

	public List<String> getPhone() {
		return phone;
	}

	public Employee(int id, String name, List<String> phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}

}
