
//재사용
public class Student {

	//인스턴스 변수 ==> 데이터 저장
	private String name;
	private int age;
	private String address;
	
	
	//생성자 ==> 인스턴스 변수 초기화
	public Student() {
	}
	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	//getter 메서드, setter 메서드
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
