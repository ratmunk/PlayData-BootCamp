package com.app1;

class Outer{
	
	public int n = 10;
	protected int n2 = 20;
	int n3 = 30;
	private int n4 = 40;
	static int n5 = 50;
	
	public void methodOuter() {
		Inner inner = new Inner();
		inner.methodInner();
	}
	class Inner{
		int x = 100;
//		static int x2 = 200;  // static 사용 불가
		public void methodInner() {
			System.out.println(x);
			System.out.println(n);
			System.out.println(n2);
			System.out.println(n3);
			System.out.println(n4);
			System.out.println(n5);
		}
	}//end Inner

}//end Outerclass

public class TestMemberInnerTest {
	public static void main(String[] args) {

		Outer outer = new Outer();
		outer.methodOuter();
		
		
		// 다른 클래스에서 Inner 생성하는 방법
		Outer xx = new Outer();
		Outer.Inner inner = xx.new Inner();
		inner.methodInner();

	}
}
