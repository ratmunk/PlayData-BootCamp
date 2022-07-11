
public class TestStudent {

	public static void main(String[] args) {

		//홍길동,20,서울
		Student s = 
		new Student("홍길동",20,"서울");
		
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.address);
		
		Student s2 = new Student();
	}

}
