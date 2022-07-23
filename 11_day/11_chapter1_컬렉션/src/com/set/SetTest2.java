package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest2 {

	public static void main(String[] args) {

		/*    Set계열
		 *  - 순서 없고 중복불가
		 *  - HashSet 클래스 사용
		 *  
		 *  <E> ==> 제네릭스(generics)
		 *     용도: 저장할 데이터 타입 제한용도
		 *     
		 *  기본형데이터 저장할때는 반드시 wrapper 사용해야 된다.   
		 *  실제 add할때는 기본형으로 사용 ( 오토박싱 )
		 */
		
		//나이(정수)만 저장
		HashSet<Integer> kk1 = new HashSet<Integer>();
		kk1.add(10);
		HashSet<Boolean> kk2 = new HashSet<Boolean>();
		kk2.add(true);
		HashSet<Float> kk3 = new HashSet<Float>();
		kk3.add(3.14F);
		HashSet<Character> kk4 = new HashSet<Character>();
		kk4.add('A');
		
		 // 이름(문자열)만 저장
		HashSet<String> set = new HashSet<String>();
		set.add("홍길동1");
		set.add("홍길동2");
//		set.add(20);
		
		System.out.println(set);
		
		for (String s : set) {
			System.out.println(">>" + s);
		}
	
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			String xx = ite.next();
			System.out.println("$$" + xx);
		}
		
		
		
		
	}

}
