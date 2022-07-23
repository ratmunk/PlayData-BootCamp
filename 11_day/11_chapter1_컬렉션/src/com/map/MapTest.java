package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {

		/*   Map 계열
		 *   - Collection API 무관
		 *   - key/value (name/value) 쌍으로 저장
		 *   - key 이용해서 대부분 관리된다.
		 *   - 제네릭스 지원
		 *   - HashMap 클래스 실제 사용
		 *   - Set과 동일하게 순서없이 저장됨.
		 */

//		HashMap<String, String> map = new HashMap<String, String>();
		Map<String, String> map = new HashMap<String, String>(); //다형성
		//저장
		map.put("A1", "홍길동1");
		map.put("A2", "홍길동2");
		map.put("A3", "홍길동3");
		map.put("A3", "이순신"); // 동일한 key인 경우에는 덮어쓰기
		
		//출력1
		System.out.println(map);  // map.toString()
		
		//출력2
		System.out.println(map.get("A1"));
		System.out.println(map.get("A2"));
		System.out.println(map.get("A4")); // 존재하지 않는 key 사용하면 null 반환
		
		//출력3 ==> key값을 먼저 얻고 나중에 value값 얻기
		Set<String> keys = map.keySet(); // 데이터가 많거나 또는 키값을 모를때
		for (String key : keys) {
			System.out.println(key + ":" +  map.get(key));
		}
		//Iterator로 해보기
		/*
		 *   1) iterator() 메서드로 Iterator 타입 얻기
		 *     Iterator<T> ite = 셋|리스트.iterator();
		 *     
		 *   2) 반복해서 값 얻기
		 *     while(ite.hasNext()){
		 *        데이터타입 변수 = ite.next();
		 *     }
		 * 
		 */
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()) {
			String key = ite.next();
			System.out.println(key + "|" +  map.get(key));
		}
		
		
		
	}//end main
}//end class





