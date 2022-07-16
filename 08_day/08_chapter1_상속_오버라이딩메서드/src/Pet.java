
public class Pet {

	//공통적인 속성
	public String name;
	public int age;
	
	//공통적인 동작
	public void eat() {
		System.out.println("eat~");
	}
	public void sleep() {
		System.out.println("Pet.sleepPet");
	}
	
	public Pet() {
		super(); // Object의 기본생성자 호출
	}
	public Pet(String name, int age) {
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
}
