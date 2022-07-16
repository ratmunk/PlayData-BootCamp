
// 예외발생됨 ==> 비정상종료 코드를 정상종료하도록 예외처리하는 방법
/*
 *   try{
 *     실행문장;
 *     실행문장;
 *     실행문장;
        ... 
 *   }catch(XXXException e){
 *     예외처리 코드문장; ==> 메시지 출력
 *   }
 */
public class TestMain3 {

	public static void main(String[] args) {
		
		System.out.println("main 시작");
	try {	
		int num = 0;
		int result = 10/num; // 종료됨(비정상종료)
		System.out.println(result);
	}catch(ArithmeticException e) {
		System.out.println("0으로 나누어서 예외 발생");
	}
	
		System.out.println("main end: 정상종료");
	}//end main
}//end class
