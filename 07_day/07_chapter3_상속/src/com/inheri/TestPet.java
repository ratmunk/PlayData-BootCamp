package com.inheri;

public class TestPet {

	public static void main(String[] args) {
		
		//Cat 생성
		Cat c = new  Cat("야옹", 1, "암컷");
		
		System.out.printf("이름:%s, 나이:%d, 성별:%s \n", 
				c.getName(), c.getAge(), c.getGender());
		//Dog 생성
		Dog d = new Dog("망치", 2, "화이트");
		System.out.printf("이름:%s, 나이:%d, 색상:%s", 
				d.getName(), d.getAge(), d.getColor());
		
	}
}
