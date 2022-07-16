package com.string;

/*
 *   문자열 생성 방법
 *    ==> 문자열은 String 클래스 관리
 *   
 *   1. 리터럴 이용 => 문자열값이 같으면 재사용함. method area내의  리터럴 pool에 저장.
 *      String s = "hello";
 *      
 *   2. new 이용 ==> new 할 때마다 매번 생성됨. heap 메모리에 생성.
 *      String s2 = new String("hello");
 *      
 *  문자열 특징
 *    - 한번 생성된 문자열을 변경이 안됨. (배열과 동일)
 *     ==> 맨 처음 생성된 문자열을 메서드로 가공하면  가공된 새로운 문자열이 반환   
 */
public class TestMain {
	public static void main(String[] args) {

	
		 String s = "hello";
		 String ss = "hello";
		 
		 String s2 = new String("hello");
		 String ss2 = new String("hello");

		 // 주소값 비교
		 System.out.println(s==ss); // true
		 System.out.println(s2==ss2); // false
		 System.out.println(s==s2); // false
		 
		 //실제값 비교
		 System.out.println(s.equals(ss)); // true
		 System.out.println(s2.equals(ss2)); // true
		 System.out.println(s.equals(s2)); // true
		 
		 System.out.println(s); //관련된 메서드? toString()
		 System.out.println(s2);
		 
	}
}





