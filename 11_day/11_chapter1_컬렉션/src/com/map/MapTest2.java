package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest2 {
	public static void main(String[] args) {


		Map<String, String> map = new HashMap<String, String>(); //다형성

		map.put("A1", "홍길동1");
		map.put("A2", "홍길동2");
		map.put("A3", "홍길동3");
		
		System.out.println(map);  
		
		System.out.println(map.size());
		System.out.println(map.replace("A3", "유관순")); // replace는 변경전 값 반환
		
		map.remove("A1");
		map.clear(); //전체 삭제
		System.out.println(map);  // map.toString() == > {} , list|set.toString()==> []
		
		
	}//end main
}//end class





