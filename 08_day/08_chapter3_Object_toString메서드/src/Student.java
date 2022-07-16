/*
 *  재사용 클래스 작성 패턴
 *  1. 인스턴스 변수
 *  2. 생성자
 *  3. getter/setter
 *  4. toString() 재정의
 * 
 */
public class Student { // extends Object 자동 지정됨

	String name;
	int age;
	
	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	
	
}
