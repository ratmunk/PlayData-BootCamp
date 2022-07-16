package com.abstract2;

public abstract class Pet {

	String name;
	public String getName() {
		return name;
	}
	public Pet() {}
	
	//추상 메서드
	public abstract void eat();
	
}
