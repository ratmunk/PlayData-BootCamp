import java.util.Arrays;

public class ArrayTest2_2차원2_비정방형 {

	public static void main(String[] args) {

		// 비정방형 2차원 배열
		//1. new 이용
		int [][] n = new int[3][];  // 행크기만 지정, 열은 나중에 지정
		
		n[0] = new int[2];  // 1행에 2열 지정
		n[1] = new int[1];  // 2행에 1열 지정
		n[2] = new int[3];  // 3행에 3열 지정
		
		
		System.out.println(Arrays.deepToString(n));
	
		n[0][0]=1;
		n[0][1]=2;
		
		n[1][0]=3;
		
		n[2][0]=4;
		n[2][1]=5;
		n[2][2]=6;
		
		System.out.println(Arrays.deepToString(n));
		
		
		
		
		
		
		
	}//end main
}//end class
