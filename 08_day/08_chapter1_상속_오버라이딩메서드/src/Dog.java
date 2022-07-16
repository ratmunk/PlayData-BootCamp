
public class Dog extends Pet {

	//의존적인 속성
	String color;
	
	//의존적인 동작
	public void swimDog() {
		System.out.println("Dog.swimDog");
	}

	@Override
	public void eat() {
		System.out.println("쪕쪕~");
	}



	public Dog() {
		super();
	}

	public Dog(String name, int age) {
		super(name, age);
	}

	public Dog(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
