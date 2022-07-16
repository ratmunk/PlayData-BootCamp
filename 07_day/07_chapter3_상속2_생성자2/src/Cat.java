
public class Cat extends Pet {

	private String gender;

	//생성자
	public Cat() {
		super();
	}

	public Cat(String name, int age) {
		super(name, age);
//		this.name = name;
//		this.age = age;
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
