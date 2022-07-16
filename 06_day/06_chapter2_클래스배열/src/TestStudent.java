
public class TestStudent {

	public static void main(String[] args) {
	
		//1. 개별적인 변수로 관리
		Student s1 = new Student("홍길동1", 20, "서울1");
		Student s2 = new Student("홍길동2", 30, "서울2");
		Student s3 = new Student("홍길동3", 40, "서울3");
		Student s4 = new Student("홍길동4", 30, "서울4");
		Student s5 = new Student("홍길동5", 23, "서울5");
		
		//2. 배열로 관리
		
		//가. new 이용
		Student [] stuArr = new Student[5];
		stuArr[0]= new Student("홍길동1", 20, "서울1");
		stuArr[1]= new Student("홍길동2", 30, "서울2");
		stuArr[2]= new Student("홍길동3", 40, "서울3");
		stuArr[3]= new Student("홍길동4", 30, "서울4");
		stuArr[4]= new Student("홍길동5", 23, "서울5");

		for (Student s : stuArr) {
			System.out.println(s.getName());
		}
		
		//2. 값 이용
		Student [] stuArr2 = { new Student("홍길동1", 20, "서울1"), 
							   new Student("홍길동2", 30, "서울2"),
							   new Student("홍길동3", 40, "서울3")
				             };
		
		for (Student s : stuArr2) {
			System.out.println(">>" + s.getName());
		}

		//3. new + 값
		Student [] stuArr3 = new Student[]{ new Student("홍길동1", 20, "서울1"), 
				   						    new Student("홍길동2", 30, "서울2"),
				   						    new Student("홍길동3", 40, "서울3")
	                                      };
		
		for (Student s : stuArr3) {
			System.out.println("###" + s.getName());
		}
		
	}//end main

}//end class
