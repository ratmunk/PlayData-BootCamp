package com.app2;

class Outer{
	
	public int n = 10;
	protected int n2 = 20;
	int n3 = 30;
	private int n4 = 40;
	static int n5 = 50;
	
	public void methodOuter() {
	
	}
	static class Inner{
		       int x= 100;
	    static int x2= 200;
	    public void methodInner() {
			System.out.println(x);
//			System.out.println(n);
//			System.out.println(n2);
//			System.out.println(n3);
//			System.out.println(n4);
			System.out.println(n5);
		}
	}//end Inner

}//end Outerclass
public class TestStaticInnerTest {

	public static void main(String[] args) {

		Outer.Inner inner = new Outer.Inner();
		inner.methodInner();

	}

}
