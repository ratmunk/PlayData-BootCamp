
public class Pet {

	String name;
	int age;
	
	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//name과 age를 한꺼번에 반환해주는 메서드
	public String getInfo() {
		return name+"\t"+age;
	}
}
