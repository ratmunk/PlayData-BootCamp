package com.string;

import java.util.Arrays;

/*
 *   String 클래스의 메서드 정리

 */
public class TestMain2 {
	public static void main(String[] args) {

	
		 String s = "hElLo"; // 한 번 생성된 문자열은 변경불가, 가공하면 새로운 문자열 반환
		
		 System.out.println("1. 문자열 길이:" + s.length());
		 int len = s.length();
		 System.out.println("1. 문자열 길이:" + len);
		 System.out.println("2. 특정문자얻기:" + s.charAt(0));
		 System.out.println("2. 특정문자얻기:" + s.charAt(4));
		 char c = s.charAt(2);
		 System.out.println("2. 특정문자얻기:" + c);
		 System.out.println("3. 모두 대문자로:" + s.toUpperCase());
		 System.out.println("4. 모두 소문자로:" + s.toLowerCase());
	
		 System.out.println("5. 특정 문자의 위치 반환:" + s.indexOf('h'));
		 System.out.println("5. 특정 문자의 위치 반환:" + s.indexOf('H'));
		 System.out.println("5. 특정 문자의 위치 반환:" + s.indexOf("E"));
		 System.out.println("5. 특정 문자의 위치 반환:" + s.indexOf("x")); // -1, 찾는 문자 없으면 -1 반환.
		 
		 System.out.println("6. 특정 문자(열) 포함여부:" + s.contains("hE")); // true
		 System.out.println("6. 특정 문자(열) 포함여부:" + s.contains("he")); // false
		 
		 String x = "hello";
		 String x2 = "Hello";
		 // 문자열 비교할 때는 == 절대사용불가,  equals() 메서드를 사용해야 된다.
		 System.out.println("7. 같은 문자열이냐?(대소문자 구별)"+ x.equals(x2));
		 System.out.println("7. 같은 문자열이냐?(대소문자 무시)"+ x.equalsIgnoreCase(x2));
		 
		 String x3 = "hello";
		 System.out.println("8. 문자열 연결?"+ x3.concat(" world"));
		 System.out.println("9. 문자열 변경?"+ x3.replace('h', 'H'));
		 System.out.println("9. 문자열 변경?"+ x3.replace("he", "HE"));
		 
		 System.out.println("10. 부분열 ?"+ x3.substring(1));
		 System.out.println("10. 부분열 ?"+ x3.substring(1,3));
		 
		 //특정문자를 구분자로 해서 문자열 분리하기
		 String xx = "홍길동/이순신/유관순";
		 String [] names = xx.split("/"); 
		 System.out.println(Arrays.toString(names));
		 
		 //문자열 ==> 문자의 배열
		 String xx2 = "hello";
		 char [] chrs = xx2.toCharArray();
		 System.out.println(Arrays.toString(chrs));
		 
		 //문자열이 아닌값을 문자열로 변경 => static 메서드 제공
		 String k = String.valueOf(10);
		 System.out.println(k);
//		 char [] z = {'h','e','l','l','o'};
		 String k2 = String.valueOf(new char[] {'h','e','l','l','o'});
		 System.out.println(k2);
		 
		 System.out.println(x3); //원본값은 변경이 안됨.
	}
}





