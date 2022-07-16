
public class Cat extends Pet {

	String gender;

	public Cat(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}

	//오버라이딩
	@Override
	public String getInfo() {
		char c = 'A';
		String c2 = "A";
//		return name+"\t"+age+"\t"+gender;
		return super.getInfo()+"\t"+gender;
	}
	
	//오버로딩
	public String getInfo(int n) {
		return null;
	}
}
