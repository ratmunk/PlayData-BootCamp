
/*
 *   초기화 블럭
 *   
 *   1. 인스턴스 초기화 블럭 
 *   
 *   2. static 초기화 블럭 (****)
 *     ==> 생성자처럼 특정 작업 초기화할 때 사용한다.
 *     예> 파일입력등...
 * 
 */

public class TestMain {

	//인스턴스 초기화 블럭 ==> 객체생성시 수행됨. 활용 빈도수는 떨어짐.
	{
		System.out.println("instance");		
	}
	
	//static 초기화 블럭 ==> 호출하지 않아도 실행됨. 프로그램실행시 수행됨.
	static {
		System.out.println("static1");
	}
	static {
		System.out.println("static2");
	}
	
	public static void a() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		a();
		TestMain t = new TestMain();

	}
}
