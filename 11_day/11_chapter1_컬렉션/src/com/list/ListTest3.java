package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest3 {

	public static void main(String[] args) {
		
		// List를 매우 쉽게 만드는 방법
		
		//1. 기본적인 방법
		List<String> list = new ArrayList<String>(); // 다형성
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		System.out.println(list);
		
		
		//2. Arrays 유틸리티 이용하는 방법
		List<String> list2 = Arrays.asList("홍길동","이순신","유관순");
		System.out.println(list2);
		
		List<Integer> list3 = Arrays.asList(1,2,2,43); 
		System.out.println(list3);
		
		
		// 이름과 나이 저장
		// 홍길동/20,  이순신/40, 유관수/18
		List<Object> xxx = new ArrayList<Object>(); 
		xxx.add("홍길동");
		xxx.add(20);
		xxx.add("이순신");
		xxx.add(44);
		
		//다음 방법이 가장 많이 사용되는 형태이다. ( * X 무한대 )
		List<Person> xxx2 = new ArrayList<Person>();
		xxx2.add(new Person("홍길동", 20));
		xxx2.add(new Person("이순신", 44));
		
		for (Person p : xxx2) {
		     if("홍길동".equals(p.getName())) { //강사
//		     if(p.getName().equals("홍길동")) { //이종수
		    	 System.out.println(">>>"+ p);
		     }
		}
		
		List<Person> xxx3 = Arrays.asList(new Person("홍길동", 20), new Person("이순신", 44));
		
		for (Person p : xxx2) {
			System.out.println(p); //p.toString()
		}
		
		Iterator<Person> ite = xxx2.iterator();
		while(ite.hasNext()) {
			Person k = ite.next();
			System.out.println(k); // k.toString()
		}
		
	}//end main

}//end class

class Person{
	
	String name;
	int age;
	
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}




