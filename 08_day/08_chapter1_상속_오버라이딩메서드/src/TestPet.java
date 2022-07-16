
public class TestPet {

	public static void main(String[] args) {

		Cat c = new Cat("야옹이1", 2, "암컷");
		Cat c2 = new Cat("야옹이2", 2, "숫컷");
		
		//기능 호출
		c.eat();
		c.sleep();
		c.cryCat();
		
		Dog d = new Dog("멍멍이1", 3, "화이트");
		Dog d2 = new Dog("멍멍이2", 1, "블랙");
		
		//기능 호출
		d.eat();
		d.sleep();
		d.swimDog();
	}

}
