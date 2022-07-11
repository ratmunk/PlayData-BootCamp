//재사용 클래스
public class Cat {

	String name;
	int age;
	String gender;
	
	//오버로딩 생성자
	public Cat() {}
	public Cat(String n) {
		name = n;
	}
	public Cat(String n, int a) {
		name = n;
		age = a;
	}
	public Cat(String n, int a, String g) {
		name = n;
		age = a;
		gender = g;
	}

	
	
}
