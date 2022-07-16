
public class Cat extends Pet {

	//의존적인 속성
	String gender;

	//의존적인 동작
	public void cryCat() {
		System.out.println("Cat.cryCat");
	}
	
	@Override  // 어노테이션
	public void eat() {
		System.out.println("냠냠~");
	}
	
	
	
	
	public Cat() {
		super(); // Pet의 기본생성자 호출
	}

	public Cat(String name, int age) {
		super(name, age);
	}

	public Cat(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
