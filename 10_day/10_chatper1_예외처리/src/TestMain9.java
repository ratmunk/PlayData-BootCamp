import java.io.IOException;

// 위임하는 방법으로 예외처리에서 주의할 점 => 상속이 전제된 메서드 재정의
/*
  오버라이딩(overriding) 규칙
  ==> 예외 클래스 계층구조 숙지필요.
    부모: 
         접근지정자  리턴타입   메서드명([변수,..]) throws XXException    {}

  자식:
                          리턴타입    메서드명([변수,..])          {}
                        
    - 자식클래스에서 재정의시 접근지정자는 같거나 확대만 가능 
    - 자식클래스에서 재정의시 throws는 계층구조가 같거나 축소만 가능                   
 */
class SuperClass{
	
	public void a() {}
	protected void b() throws ArithmeticException {}
	 void c() throws ArithmeticException {}
	 void d() throws RuntimeException {}
}

class ChildClass extends SuperClass{
	
	public void a() throws Exception{}
	
	protected void b() {}
	
	public void c() throws Exception{}
	
	public void d() throws IOException{}
}



public class TestMain9 {
	public static void main(String[] args) {
		System.out.println("start");
   
		System.out.println("main 정상종료");
	}//end main
}//end class
