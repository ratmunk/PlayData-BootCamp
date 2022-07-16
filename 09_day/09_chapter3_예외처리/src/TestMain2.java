
// 비정상종료 의미
public class TestMain2 {

	public static void main(String[] args) {
		
		System.out.println("main 시작");
		
		int num = 0;
		int result = 10/num; // 종료됨(비정상종료)
		System.out.println(result);
		
		System.out.println("main end: 정상종료");
	}//end main
}//end class
