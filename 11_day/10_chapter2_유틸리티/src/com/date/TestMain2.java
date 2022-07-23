package com.date;

import java.util.Calendar;
import java.util.Date;

public class TestMain2 {
	public static void main(String[] args) {
		
		/*
		 *  날짜 데이터
		 *  
		 *  1. java.util.Date
		 *   => new 이용
		 *  
		 *  2. java.util.Calendar (*)
		 *   => new 이용(X)
		 *   => Calendar.getInstance() 이용
		 *     직접 new하지 않고 static메서드인 getInstance()에서
		 *      객체생성해서 반환해주는 방식으로 사용된다.
		 *      이유? new를 여러번 사용하지 못하도록하기 위함.
		 */
		
		//2. java.util.Calendar 사용
	
		Calendar cal = Calendar.getInstance();
		
		System.out.println("1. 날짜 출력:" + cal);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; // 월 + 1
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int seconds = cal.get(Calendar.SECOND);
		
		System.out.println("년도:" +  year);
		System.out.println("월:" +  month); 
		System.out.println("일:" +  day);
		System.out.println("시:" +  hour);
		System.out.println("분:" +  minute);
		System.out.println("초:" +  seconds);
	
		//특정날짜 설정
		Calendar cal2 = Calendar.getInstance();
		
		cal2.set(2021, 1, 25); // 월지정시 주의
		
		// Calendar에서 Date 설정
		cal2.setTime(new Date());
		
		int year2 = cal2.get(Calendar.YEAR);
		int month2 = cal2.get(Calendar.MONTH)+1; // 월 + 1
		int day2 = cal2.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("작년 년도:" +  year2);
		System.out.println("작년 월:" +  month2); 
		System.out.println("작년 일:" +  day2);
		
		
	
		
	}

}
