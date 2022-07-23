package com.date;

import java.util.Date;

public class TestMain {
	public static void main(String[] args) {
		
		/*
		 *  날짜 데이터
		 *  
		 *  1. java.util.Date
		 *  
		 *  
		 *  2. java.util.Calendar (*)
		 * 
		 */
		
		//1. java.util.Date 사용
		Date d = new Date();
		System.out.println(d); //Mon Jul 18 10:36:16 KST 2022

		int year = d.getYear(); // deprecated 된 경우
		System.out.println(year);
	}

}
