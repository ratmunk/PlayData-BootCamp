// static import는 안드로이드 어플 개발시 많이 사용.
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.parseInt;
import static java.lang.Math.random;
import static java.lang.Math.PI;

public class TestMain {

	public static void main(String[] args) {

		//1. static 로 된  변수(상수)와 메서드 사용
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(MAX_VALUE);  //권장안함
		System.out.println(Integer.parseInt("100")+1);
		System.out.println(parseInt("100")+1); //권장안함
		
		System.out.println(Math.random()); // 0.0 <= 값 < 1.0
		System.out.println(random()); // //권장안함 
		
		System.out.println(Math.PI); 
		System.out.println(PI);  //권장안함
	}

}
