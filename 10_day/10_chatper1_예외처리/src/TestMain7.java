// 위임하는 방법으로 예외처리
/*
 *    public 리턴타입 메서드명([변수,..]) 
 *          throws XXXException, XXX2Exception,...{}
 */
class Test{
	public void a() throws ArithmeticException {
		b();
	}
	public void b() throws ArithmeticException{
		int result = 10/0;
		System.out.println(result);
	}
}
public class TestMain7 {
	public static void main(String[] args) {
		System.out.println("start");
     try {
		Test t = new Test();
		t.a();
     }catch(ArithmeticException e) {
    	 System.out.println(e.getMessage());
//    	 e.printStackTrace();
     }
		System.out.println("main 정상종료");
	}//end main
}//end class
