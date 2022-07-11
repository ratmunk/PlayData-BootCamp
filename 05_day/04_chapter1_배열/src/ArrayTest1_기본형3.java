import java.util.Arrays;

public class ArrayTest1_기본형3 {

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
	    *     int [] n = { 1, 2 };
	    *     
	    *     // 다음코드 불가
	    *     int []n;
	    *     n = {1,2};
	    * 
	    *   3. new + 값 이용 ( 1번과 2번 혼합 )
	    *   
	    *     int [] n = new int[]{ 1, 2 };
	    * 
	    *     // 다음 코드 사용 가능
	    *      int [] n;
	    *      n = new int[]{ 1, 2 };
	    *      
	    *     []==> 크기 지정 불가
	    * 
	    */
		
		 int [] n;
		 n = new int[] {1,2};
		
		 System.out.println(Arrays.toString(n));
		
	}
}









