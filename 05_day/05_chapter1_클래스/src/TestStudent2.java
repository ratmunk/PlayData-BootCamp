
public class TestStudent2 {

	public static void main(String[] args) {
		
		//1.  홍길동,20,서울 정보를 가진 학생 1명 생성
		 Student s = new Student();
		 s.name = "홍길동";
		 s.age = 20;
		 s.address ="서울";
		 System.out.println(s.name);
		 System.out.println(s.age);
		 System.out.println(s.address);
		 
		//2. 이순신,33,제주  정보를 가진 학생 1명 추가
		 Student s2 = new Student();
		 s2.name = "이순신";
		 s2.age = 33;
		 s2.address = "제주";
		 System.out.println(s2.name);
		 System.out.println(s2.age);
		 System.out.println(s2.address);
		 
		 
		 
		
	}//end main
}
