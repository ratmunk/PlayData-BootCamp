import java.util.Arrays;

public class ArrayTest3_기본형_참조형 {

	//메서드
	public static void int_change(int x) {
		System.out.println(x);
		x = 20;
	}
	
	public static void intArr_change(int [] xxx) {
		xxx[0]=100;
	}

	public static void main(String[] args) {
	
		//기본형
		// 기본형 데이터는 메서드 호출해서 전달시 값(실제값)이 전달된다. ==> 복사형태로 사용됨.
		// 따라서 넘겨받은 곳에서 임의로 데이터를 변경해도 원본값은 영향 받지 않는다.
		int num = 10;
		System.out.println("호출전:"+num);
		int_change(num); // 10이 넘어간다.
		System.out.println("호출후:"+num);
		
		//참조형(클래스, 배열, 인터페이스 )
		// 참조형 데이터는 메서드 호출해서 전달시 값(주소값)이 전달된다. ==> 원본과 같은 주소를 갖게 된다.
		// 따라서 넘겨 받은 곳에서 임의로 데이터를 변경하면 원본값이 영향을 받는다.
		int [] k = {1,2,3};
		System.out.println("호출전:"+ Arrays.toString(k));		
		intArr_change(k); // Ox100
		System.out.println("호출후:"+ Arrays.toString(k));		
		
	}
}









