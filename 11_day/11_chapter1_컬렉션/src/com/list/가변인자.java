package com.list;

import java.util.Arrays;

public class 가변인자 {

	//가변인자
	public static void a2(int ...n) {
		System.out.println(Arrays.toString(n));
	}
	
	public static void main(String[] args) {

		a2(10);
		a2(10,20);
		a2(10,3,4,5,6,7,87,8);
		
	}

}
