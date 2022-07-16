
public class TestStudent {

	//
	public static void studentChange(Student s) {
		s.setAge(30);
	}

	public static void main(String[] args) {

		Student s = new Student("홍길동", 20, "서울");
		System.out.println("변경전 나이:"+ s.getAge());  // 20
		studentChange(s);
		System.out.println("변경후 나이:"+ s.getAge());  // 30
		
	}

}
