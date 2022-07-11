
// 자동차 관리 프로그램을 위한 분석단계에서 추출한 Car객체(속성,동작) 
// 설계단계에서는 Car 클래스 작성(인스턴스변수,메서드) 작성함.

public class Car {
	//인스턴스 변수	
	// 특별한 경우가 아니면 인스턴스 변수는 private 지정한다.
	// 이유는 외부에서 직접 접근하지 못하도록 하기 위해서..
	// 우회(생성자, 메서드)에서 접근한다.
	private String name;
	private int price;
	private String color;
	
	//생성자
	public Car() {}

	public Car(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}
	//메서드
	/*
	 *  문법:
	 *   public 리턴타입   메서드명([변수,.]){
	 *       문장;
	 *       [return [값;]]
	 *   }
	 * 
	 * - 메서드명은 사용자 정의 식별자로서
	 *  권장은 전부 소문자, 동사형으로 지정한다.
	 * 
	 */
	//1. 파라미터 변수 없고 리턴값도 없는 형태의 메서드
	public void sample_print() {
		System.out.println("Car 프로젝트 구현");
	}
	
	
}







