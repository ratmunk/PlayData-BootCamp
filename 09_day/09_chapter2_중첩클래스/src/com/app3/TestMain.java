package com.app3;

public class TestMain {

	public static void main(String[] args) {

		//익명클래스
		Flyer f = new Flyer() {
			
			@Override
			public void b() {
				System.out.println("Flyer.b()");
			}
			
			@Override
			public void a() {
				System.out.println("Flyer.a()");
			}
		};

		f.a();
		f.b();
		
	}//end main
}//end class
