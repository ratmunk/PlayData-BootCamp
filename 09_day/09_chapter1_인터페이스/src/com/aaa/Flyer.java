package com.aaa;

public interface Flyer {

	//구성요소
	
	//1. 상수
	int num = 2; // public static final int num = 2; 동일
	public static final int COUNT = 2; // 권장
	//2. 추상메서드
	public void a(); // public abstract void a();
	void b(String s);        // public abstract void b(); 
	public abstract void c(); // 권장
	
	//3. default 메서드
	public default void d() {
		System.out.println("default 메서드.d");
	}
	public default void e(int n) {
		System.out.println("default 메서드.e");		
	}
	
	//4. static 메서드
	public static int f() {
		return 100;
	}
	
}  
