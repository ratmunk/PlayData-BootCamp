package com.abstract2;

public class TestPet {

	public static void main(String[] args) {

//		Pet p = new Pet(); // new 불가
		// 다형성 가능
		Pet p = new Cat();
		    p = new Dog();
		Cat c = new Cat();
		c.eat();
		Dog d = new Dog();
		d.eat();
	}

}
