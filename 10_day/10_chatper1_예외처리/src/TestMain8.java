// 위임하는 방법으로 예외처리
/*
 *    public 리턴타입 메서드명([변수,..]) 
 *          throws XXXException, XXX2Exception,...{}
 */
class Test2{
	public void a() throws ArithmeticException, NullPointerException {
		b();
	}
	public void b() throws ArithmeticException, NullPointerException{
		//가정1: ArithmeticException 발생가능한 코드
		int result = 10/2;
		System.out.println(result);
		
		//가정2: NullPointerException 발생가능한 코드
		String name = null;
		System.out.println(name.length());
		
	}
}
public class TestMain8 {
	public static void main(String[] args) {
		System.out.println("start");
     try {
		Test2 t = new Test2();
		t.a();
     }catch(ArithmeticException e) {
    	 System.out.println("ArithmeticException: "+ e.getMessage());
//    	 e.printStackTrace();
     }catch(NullPointerException e) {
    	 System.out.println("NullPointerException: "+e.getMessage());
//    	 e.printStackTrace();
     }catch(Exception e) {
    	 System.out.println("Exception: "+e.getMessage());
     }
		System.out.println("main 정상종료");
	}//end main
}//end class
