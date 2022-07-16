package com.aaa;

public class TestFlyer {

	public static void main(String[] args) {
		
//		Flyer f = new Flyer(); //객체생성 불가

		FlyerImpl f2 =
				new FlyerImpl();
		f2.a();
		f2.b("hello");
		f2.c();
		
//		f2.num =10; // 상수
		System.out.println(f2.num);
		System.out.println(f2.COUNT);
		
		// default 메서드: 객체생성후 참조변수.default메서드
		f2.d();
		f2.e(100);
		
		//static 메서드: 인터페이스명.static메서드
		int result = Flyer.f();
		System.out.println(result);		
		
		
		
		
		
		
	}

}
