import java.util.Arrays;

public class ArrayTest1_기본형2 {

	public static void main(String[] args) {
		
	   /*
	    *   기본형 배열 생성 방법 3가지
	    *   
	    *   1. new 이용
	    *     
	    *     int [] n;
	    *     n = new int[2];
	    *     ==> int []n = new int[2];
	    *     n[0]=1;
	    *     n[1]=2;
	    *     
	    *   2. new 없이  값만 이용
	    *   
	    *     int [] n = { 1, 2 };
	    *     
	    *     // 다음코드 불가
	    *     int []n;
	    *     n = {1,2};
	    * 
	    * 
	    */
		
		int [] x = { 1, 2, 3};
		
		//출력1
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		
		//출력2
		for (int i = 0; i < x.length; i++) {
		  System.out.println(x[i]);
		}
		//
		//출력3
		for (int i : x) {
			System.out.println("<<<" + i);
		}
		
		//출력4
		System.out.println(Arrays.toString(x));
		
		
		
		
		
	}
}









