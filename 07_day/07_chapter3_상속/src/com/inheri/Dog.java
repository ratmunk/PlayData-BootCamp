package com.inheri;

public class Dog extends Pet {

	//의존적인  속성
	private String color;
	public Dog() {
	}
	public Dog(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
	// 의존적인 동작
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}//end class
