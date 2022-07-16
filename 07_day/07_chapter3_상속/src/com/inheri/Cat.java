package com.inheri;

public class Cat extends Pet{
	//의존적인  속성
	private String gender;
	public Cat() {
	}
	public Cat(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	// 의존적인 동작
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}//end class
