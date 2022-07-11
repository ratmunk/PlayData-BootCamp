//  핸들링 클래스
public class TestPet {

	public static void main(String[] args) {
		// Cat과 Dog 클래스 핸들링

		//1. Cat 정보가 아무것도 없다.
		Cat c = new Cat();
		//2. Cat 정보중 이름만 아는 경우
		Cat c2 = new Cat("야옹이");
		//3. Cat 정보중 이름과 나이만 아는 경우
		Cat c3 = new Cat("나비",2);
		//4. Cat 정보 모두 아는 경우
		Cat c4 = new Cat("나비2",2,"암컷");
		
		System.out.printf("1 번째 고양이 정보: 이름:%s, 나이:%d , 성별:%s \n",
				           c.name, c.age, c.gender);
		System.out.printf("2 번째 고양이 정보: 이름:%s, 나이:%d , 성별:%s \n",
		           c2.name, c2.age, c2.gender);
		System.out.printf("3 번째 고양이 정보: 이름:%s, 나이:%d , 성별:%s \n",
		           c3.name, c3.age, c3.gender);
		System.out.printf("4 번째 고양이 정보: 이름:%s, 나이:%d , 성별:%s \n",
		           c4.name, c4.age, c4.gender);
		
		//Dog 생성하고 출력하시오.
		Dog d = new Dog("망치", 1, "불독");
		Dog d2 = new Dog("망치2", 2);
		
	}

}
