package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {

		/*    Set계열
		 *  - 순서 없고 중복불가
		 *  - HashSet 클래스 사용
		 *  
		 *  <E> ==> 제네릭스(generics)
		 *     용도: 저장할 데이터 타입 제한용도
		 */
		
//		HashSet set = new HashSet();
		Set set = new HashSet();  //다형성
		
		set.add("홍길동");
		set.add(222);
		set.add(3.13);
		set.add("홍길동");
		set.add(true);
		set.add(222);
		set.add(3.13);
		
		//문자열만 가져오자? instanceof 로 ...
		for (Object obj : set) {
			if(obj instanceof String) {
				String xx = (String)obj;
				System.out.println(xx);
			}
		}
		
		//출력하기1
		System.out.println(set); //toString()
		
		//출력하기2
		for (Object obj : set) {
			System.out.println("<<"+ obj);
		}
		//출력하기3
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			Object xx = ite.next();
			System.out.println("$$" + xx);
		}
	
		
		System.out.println("포함여부:" + set.contains("홍길동"));
		System.out.println("포함여부:" + set.contains("이순신"));
		
		System.out.println("삭제:" + set.remove("홍길동"));
		System.out.println("삭제:" + set.remove("이순신"));
		System.out.println(set);
		
		System.out.println("크기(길이):" + set.size());
		
		set.clear();
		System.out.println(set); // []
	}

}
