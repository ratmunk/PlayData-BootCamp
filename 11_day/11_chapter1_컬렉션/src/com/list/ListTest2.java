package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		/*
		 *   List 계열
		 *   - 순서있고 중복허용
		 *   - ArrayList 클래스 사용
		 */
        // CRUD: create(저장), READ(읽기,조회), UPDATE(수정), DELETE(삭제)
		List<String> list = new ArrayList<String>(); // 다형성
		// 추가
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");

		//삽입
		list.add(0,"강감찬");
		
		//수정
		list.set(1, "아버지");
		
		//삭제
		list.remove(0);
		list.remove("아버지");
		
		System.out.println("특정값의 위치:"+ list.indexOf("이순신"));
		
		Object[] arr = list.toArray();
		System.out.println(Arrays.toString(arr));
		
		System.out.println(list);
		
		
	}

}
