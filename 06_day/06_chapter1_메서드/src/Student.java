// 재사용
public class Student {

	//인스턴스 변수
	private String name;
	private int age;
	private String address;
	
	//생성자
	public Student() {
	}

	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
    // worker 메서드
	//getter ==> 권장 메서드명은   get변수명으로 지정한다.
	//       ==> 두번째 단어의 첫글자는 대문자로 지정한다.(camel 표기법)        
	// name 반환
	public String   getName() {
		return name;
	}
	
	// age 반환
	public int getAge() {
		return age;
	}
	
	// address 반환
	public String  getAddress() {
		return address;
	}
	
	// worker 메서드
	//setter ==> 권장 메서드명은   set변수명으로 지정한다.
	//       ==> 두번째 단어의 첫글자는 대문자로 지정한다.(camel 표기법)  
	
	
	// address 수정
	public void  setAddress(String addr) {
		this.address = addr;
	}
	
	public void setAge(int a) {
		this.age = a;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
}
