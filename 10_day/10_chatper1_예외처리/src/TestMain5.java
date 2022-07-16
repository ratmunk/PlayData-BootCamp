// finally문 정리
/*
 *   try{
 *     실행코드;
 *     실행코드;
       
 *   }catch(){
 *     예외발생시 처리코드   
 *   }catch(){
 *     예외발생시 처리코드   
 *   }finally{
 *     
 *     예외발생여부와 상관없이 무조건 실행되어야 하는 문장
 *   
 *   }
 * 
 */
public class TestMain5 {
	public static void main(String[] args) {
		System.out.println("start");
		
		try {
			int num = 0;
			int result  = 10 / num;
			System.out.println(result);

		}catch(ArithmeticException e) {
		   System.out.println("예외발생1");
		}catch(Exception e) {
			   System.out.println("위에서 catch못한 예외는 여기서 잡기위한 목적,예외발생3");
		}finally {
			System.out.println("반드시 수행되는 문장");
		}

		System.out.println("main 정상종료");
	}//end main
}//end class
