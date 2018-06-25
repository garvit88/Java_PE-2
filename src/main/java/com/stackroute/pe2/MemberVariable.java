package com.stackroute.pe2;

import java.util.ArrayList;

class Member {
	private String name;
	private int age;
	private double salary;
	
	public Member(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

public class MemberVariable {
	Member m = new Member("Harry Potter",30,2500.38);
	
	public String[] display() {
		ArrayList<String> val = new ArrayList<String>();
		val.add(m.getName());
		val.add(String.valueOf(m.getAge()));
		val.add(String.valueOf(m.getSalary()));
		String[] values = val.toArray(new String[val.size()]);
		return values;
	}
}
