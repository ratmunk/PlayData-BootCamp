// 재사용 클래스
public class Dog {
    
	String name; //파란색의 name은 인스턴스 변수,heap
	int age;
	String species;
	
	//이클립스가 자동으로 생성자 생성해준다.
	public Dog() {
	}
	public Dog(String name, // 밤색의 name은 로컬변수, stack
			   int age, String species) {
		this.name = name;
		this.age = age;
		this.species = species;
	}
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Dog(String name) {
		this.name = name;
	}
	public Dog(String name, String species) {
		this.name = name;
		this.species = species;
	}
	
	
	
	
	
	
}
