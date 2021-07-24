package com.srm.beancollections;

public class Person {

	String name;
	String address;
	int age;

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "address=" + address + ", age=" + age + ", name=" + name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}