import java.util.Arrays;

public class ArrayTest2_참조형 {

	public static void main(String[] args) {
		
		
		// 참조형 : 클래스, 배열 , 인터페이스
		
		// 1. 배열 선언
		
String m; // 참조형 변수, String타입 변수,로컬변수(stack), 주소값 저장(임의의 문자열 주소값-> method area메모리의 리터럴pool영역에 저장)
	


		String [] n;//참조형변수, String타입의 배열, 로컬변수(statck),
		            // 주소값저장( 임의의 문자열이 저장된 배열주소 )
		//2. 배열 생성
		n = new String[2];
		 
	    // 참조형 데이터는 자동으로 null로 초기화
		System.out.println(n[0]); // null
	    System.out.println(n[1]); // null
	    
	    //3. 초기화
	    n[0] = "홍길동1";
	    n[1] = "홍길동2";
	    n[0] = "홍길동100";
	    
	    
	    //4. 출력1
	    System.out.println(n[0]);
	    System.out.println(n[1]);
	    
	    // 출력2
	    for (int i = 0; i < n.length; i++) {
			System.out.println(">" + n[i]);
		}
	    // 출력3
	    for (String s : n) {
			System.out.println("$" + s);
		}
	    
	    // Arrays 클래스의  toString 메서드 이용한 출력4
		//  import java.util.Arrays;
		//  sysout( Arrays.toString(배열));
	    System.out.println(Arrays.toString(n));
	}
}









