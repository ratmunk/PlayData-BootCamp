// catch문의  예외클래스의 메서드 2개 정리
/*
 *   System.out.println(e.getMessage());
 *   e.printStackTrace();
 */
public class TestMain3 {

	public static void main(String[] args) {

		//단일 catch문
		//다중 catch문 ==> 다형성을 이용한 Exception 클래스 + 단일 catch문 사용해도 되지만 권장 안함.
		System.out.println("start");
		
		try {
			int num = 0;
			int result  = 10 / num;
			System.out.println(result);
			
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누어 예외발생됨.");
//			System.out.println(e.getMessage()); // / by zero
			e.printStackTrace();  // 개발자가 디버깅할때 
		}

		System.out.println("main 정상종료");
	}//end main
}//end class
