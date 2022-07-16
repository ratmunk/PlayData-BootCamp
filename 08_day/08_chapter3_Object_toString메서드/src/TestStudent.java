
public class TestStudent {

	public static void main(String[] args) {

		Student s =
				new Student("홍길동", 20);
		
		//참조 변수 출력
		System.out.println(s); // Student@15db9742
//		System.out.println(s.toString()); //Student@15db9742
		
		//정보출력
//		System.out.println(s.getName()+"\t"+s.getAge());
	}

}
