package com.uninheri;

public class Dog {

	//공통속성
	private String name;
	private int age;
	
	//의존적인  속성
	private String color;

	public Dog() {
	}

	public Dog(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
	// 공통적인 동작
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
	// 의존적인 동작
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
