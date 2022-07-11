import java.util.Arrays;

public class ArrayTest2_참조형2 {

	public static void main(String[] args) {
		
		  /*
		    *   참조형 배열 생성 방법 3가지
		    *   
		    *   1. new 이용
		    *     
		    *     String [] n;
		    *     n = new String[2];
		    *     ==> String []n = new String[2];
		    *     n[0]="홍길동1";
		    *     n[1]="홍길동2";
		    *     
		    *   2. new 없이  값만 이용
		    *   
		    *     String [] n = { "홍길동1", "홍길동2" };
		    *     
		    *     // 다음코드 불가
		    *     String []n;
		    *     n = { "홍길동1", "홍길동2" };
		    * 
		    * 
		    */
		
		String [] n = { "홍길동1", "홍길동2" };
		
		//출력1
		System.out.println(n[0]);
		System.out.println(n[1]);
		//출력2
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
		//출력3
		for (String s : n) {
			System.out.println(">>" + s);
		}
		//출력4
		System.out.println(Arrays.toString(n));	
	}
}









