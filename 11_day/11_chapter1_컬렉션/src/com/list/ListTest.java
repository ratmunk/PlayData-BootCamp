package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		/*
		 *   List 계열
		 *   - 순서있고 중복허용
		 *   - ArrayList 클래스 사용
		 */
		
//		ArrayList<String> list = new ArrayList<String>();
		List<String> list = new ArrayList<String>(); // 다형성
		
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");

		//출력1
		System.out.println(list);
		
		//출력2
		for (String s : list) {
			System.out.println("<<" + s);
		}
		//출력3
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("###" + list.get(i));
		}
		//출력4
		Iterator<String> xxx = list.iterator();
		while(xxx.hasNext()) {
			String kkk = xxx.next();
			System.out.println("$$$$" + kkk);
		}
		
	}

}
