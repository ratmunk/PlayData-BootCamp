
public class TestStudent {

	public static void main(String[] args) {
		
		//학생정보 저장 => 홍길동,20,서울
		// 학생정보 저장하기 위해서 Student 클래스 이용한다.
		// Student클래스는 main메서드가 없기 때문에 독자적으로 메모리에 로딩이 안된다.
		// 따라서 main메서드에서 Student클래스(모든클래스)가 메모리에 올라갈수 있도록(로딩) 도와줘야 된다.
		// 이 작업을 '객체생성' 한다고 부른다.
		/*
		 *   객체생성 문법
		 *   
		 *   클래스명  변수명 = new 클래스명();
		 * 
		 */
		 Student s = new Student();
		
		 s.name = "홍길동";
		 s.age = 20;
		 s.address ="서울";
		
		 System.out.println(s.name);
		 System.out.println(s.age);
		 System.out.println(s.address);
		
	}//end main
}
