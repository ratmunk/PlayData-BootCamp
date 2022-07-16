package com.inheri;

// Cat과 Dog을 포함하는 큰 타입인 부모 클래스
public class Pet { // extends Object 자동 삽입됨
	
	//공통속성
	String name;
	int age;
	
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
}
