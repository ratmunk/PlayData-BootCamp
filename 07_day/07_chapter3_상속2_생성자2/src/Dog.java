
public class Dog extends Pet {

	private String color;

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
