import java.io.IOException;
import java.util.Random;

import javax.management.RuntimeErrorException;

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

// 필요시 생성할 수 가능한 사용자 정의 예외 클래스 작성방법
class UserException extends Exception{
	public UserException(String message) {
		super(message);
	}
}

class MyRandom2{
	public int random_int()throws UserException{	
		Random x = new Random();
		int result = x.nextInt(3); 
		System.out.println(result);
//		if(result==0) throw new NullPointerException("랜덤값 0은 예외"); 
//		if(result==0) throw new ArithmeticException("랜덤값 0은 예외"); 
//		if(result==0) throw new RuntimeException("랜덤값 0은 예외"); 
		if(result==0) throw new UserException("랜덤값 0은 예외"); 
//		if(result==0) throw new IOException("랜덤값 0은 예외"); 
		return result;
	}
}
public class TestMain11 {
	public static void main(String[] args) {
		System.out.println("start");  
		MyRandom2 r = new MyRandom2();
		int result=0;
		try {
			result = r.random_int();
		} catch (UserException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("랜덤값:" + result);
		System.out.println("main 정상종료");
	}//end main
}//end class
