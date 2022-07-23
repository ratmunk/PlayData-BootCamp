package com.wrapper;

public class TestMain2 {

	public static void main(String[] args) {

		 // 오토박싱, 언박싱
		 int n= 10; //기본형으로 10 생성
		 Integer n2 = new Integer(10); // 참조형(클래스)으로 10 생성
		
		 
		 //1. 오토박싱(auto-boxing),  기본형 ==> 참조형
		 Integer x = n;
		 
		 //2. 오토언박싱(auto-unboxing) , 참조형 ==> 기본형
		 int x2 = x;
	}

}
