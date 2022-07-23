package com.stringbuilder;

public class TestMain {

	public static void main(String[] args) {
		
		//StringBuffer / StringBuilder ==> 한번 생성된 문자열이 변경이 가능하다.

		// 생성은 new 이용
		//여러 프로세스가 사용시 하나의 프로세스만 사용가능. 즉 순서대로 접근해서 사용한다. 성능떨어짐. 데이터 무결성보장
		StringBuffer buffer = new StringBuffer("hello"); 
		//여러 프로세스가 사용시 동시에 여러 프로세스 사용가능. 즉 같이 접근해서 사용한다. 성능 좋음. 데이터 무결성보장 안됨.
		StringBuilder builder = new StringBuilder("hello");
		
		System.out.println(buffer);
		System.out.println(builder);
		System.out.println(buffer instanceof StringBuffer);
//		System.out.println(buffer instanceof String);
		
	}

}
