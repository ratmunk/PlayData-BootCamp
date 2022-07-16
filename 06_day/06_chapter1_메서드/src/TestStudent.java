
// Student 클래스 핸들링
public class TestStudent {

	public static void main(String[] args) {

		
		Student s = new  Student("홍길동",20,"서울");
		
		//caller 메서드
		//getter 메서드 호출
		String name = s.getName();
		int age = s.getAge();
		String address = s.getAddress();
		
		//setter 메서드 호출
		s.setAddress("제주"); // "제주"가 파라미터이다.
		s.setAge(19);
		s.setName("이순신");
		
		 name = s.getName();
		 age = s.getAge();
		 address = s.getAddress();
		
		System.out.printf("이름:%s, 나이:%d, 주소:%s \n",name,age,address);
		
	}

}
