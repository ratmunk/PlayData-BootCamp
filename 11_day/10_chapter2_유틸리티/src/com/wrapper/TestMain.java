package com.wrapper;

public class TestMain {

	public static void main(String[] args) {

		
		 int n= 10; //기본형으로 10 생성
		 
		 Integer n2 = new Integer(10); // 참조형(클래스)으로 10 생성
		
		 System.out.println(n);
		 System.out.println(n2); // n2.toString()
		 
		 // wrapper 클래스 제공한 이유 ==> 유용한 메서드 및 상수를 활용해라
		 System.out.println(Integer.MIN_VALUE); // -2147483648
		 System.out.println(Integer.MAX_VALUE); // 2147483647
		 
		 // "10" --> 10
		 int x = Integer.parseInt("10");
		 System.out.println(x);
		 
		 // 100 --> "100"
		 String s = String.valueOf(100);
		 System.out.println(s);
		 
		 //최대값,최소값, 합계 얻기
		 int max = Integer.max(100, 101);
		 int min = Integer.min(100, 101);
		 int sum = Integer.sum(100, 101);
		 
		 System.out.println(max);
		 System.out.println(min);
		 System.out.println(sum);
	}

}
