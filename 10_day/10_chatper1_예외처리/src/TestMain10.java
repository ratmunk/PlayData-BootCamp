import java.io.IOException;
import java.util.Random;

/*
 *   강제적으로 예외발생 방법
 *   -> 시스템은 예외코드로 간주하지 않기 때문인데,
 *      개발자가 예외로 간주할 경우에 사용
 * 
 *   -> 문법:
 *   
 *       if(조건) throw new XXXException(message);
 *       
 *       
 *    * throws vs throw
 *    
 *     1) throws 는 위임할 때 사용 
 *     2) throw 는 명시적으로 예외 발생시킬때 사용
 */
// 
class MyRandom{
	public int random_int() throws ArithmeticException{	
		
		// 난수값을 반환해주는 유틸리티 클래스
		Random x = new Random();
//		System.out.println(x.nextBoolean());
//		System.out.println(x.nextDouble());
//		System.out.println(x.nextFloat());
//		System.out.println(x.nextInt());
//		System.out.println(x.nextInt(3)); // 0~2까지 랜덤값 반환
		// 랜덤값이 0 이 나오면 예외라고 가정한다.
		int result = x.nextInt(3); // 0~2까지 랜덤값 반환
		System.out.println(result);
		if(result==0) throw new ArithmeticException("랜덤값 0은 예외"); // 예외처리시 보여줄 메시지 
		return result;
	}
}

public class TestMain10 {
	public static void main(String[] args) {
		System.out.println("start");
   
	 try {	
		MyRandom r = new MyRandom();
		int result = r.random_int();
		System.out.println("랜덤값:" + result);
	 }catch(ArithmeticException e) {
		 System.out.println(e.getMessage());
	 }
		System.out.println("main 정상종료");
	}//end main
}//end class
