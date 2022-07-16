// 다형성 적용한 catch문 사용
public class TestMain2 {

	public static void main(String[] args) {

		//단일 catch문
		//다중 catch문 ==> 다형성을 이용한 Exception 클래스 + 단일 catch문 사용해도 되지만 권장 안함.
		System.out.println("start");
		
		try {
			int num = 0;
			int result  = 10 / num;
			System.out.println(result);
			
		}catch(Exception e) {
			System.out.println("0으로 나누어 예외발생됨.");
		}

		System.out.println("main 정상종료");
	}//end main
}//end class
