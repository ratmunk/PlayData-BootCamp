import java.util.Arrays;

public class ArrayTest1_기본형 {

	public static void main(String[] args) {
		
		/*
		 *   데이터 저장 방법
		 *   1. 변수
		 *    - 하나의 값만 저장가능
		 *    - 기본형 변수, 참조형 변수 모두 가능
		 *    
		 *   2. 배열
		 *    - 여러개 저장 가능
		 *    - 기본형 배열, 참조형 배열 모두 가능하다.
		 *    - 특징: 같은 데이터만 저장 가능. 
		 *           크기변경 불가.
		 *           인덱스(index,첨자)이용하여 배열의 요소 접근한다.
		 *           index는 0부터 시작함.
		 *    - 배열의 크기는  배열명.length  이용한다.
		 *           
		 *   3. 컬렉션(*)
		 *    - 여러개 저장 가능
		 * 
		 */
		
		//1. 기본형 배열
		
		//가. 배열 선언
		
		 int m;//변수 선언, 기본형 변수, int형 변수, 로컬변수(stack)에  저장됨. 변수에는 실제값인 int가 저장됨.
		 
		 int [] n; //배열 선언, 참조형 변수, int형 타입의 배열, 로컬변수, n에는 주소값이 저장되고 배열에 int값이 저장됨.
		 
		//나. 배열 생성
		 n = new int[3];  // 크기 3을 가진 영역이 서로 연결된 상태로 heap 메모리에 만들어진다.
		                  // heap 메모리에 만들어진 값은 자동을 초기화된다. ( 0으로 초기화 됨 )
		 // 기본형 데이터 int 는 자동으로 0으로 초기화된다.
		 /*
		  *   기본형 자동 초기화 값
		  *    정수: 0
		  *    실수: 0.0
		  *    불린: false
		  *    문자: /u0000
		  *   
		  *   참조형 자동 초기화 값
		  *    null
		  */
		 System.out.println(n[0]); // 0
		 System.out.println(n[1]); // 0
		 System.out.println(n[2]); // 0
		 
		 //다. 초기화
		 n[0] = 1;
		 n[1] = 2;
		 n[2] = 3;
		 m = 10;
		 
		 System.out.println("배열 크기:"+ n.length);
		 
		 //라. 직접 index 지정한 출력1
		 System.out.println(n[0]);
		 System.out.println(n[1]);
		 System.out.println(n[2]);
//		 System.out.println(n[3]);  java.lang.ArrayIndexOutOfBoundsException: 3 발생,없는 요소접근시 발생
		 
		 //반복문 이용한 출력2
		 for (int i = 0; i < n.length; i++) {
			System.out.println(">>"+ n[i]);
		}
		// foreach 반복문 이용한 출력3 (*)
		for (int x : n) {
			System.out.println("****"+ x);			
		} 
		// Arrays 클래스의  toString 메서드 이용한 출력4
		//  import java.util.Arrays;
		//  sysout( Arrays.toString(배열));
		System.out.println(Arrays.toString(n));
		 
	}
}









