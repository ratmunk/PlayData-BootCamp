import java.util.Arrays;

public class ArrayTest2_2차원1_정방형 {

	public static void main(String[] args) {

		//1. new 이용
		int [][] n = new int[2][3];
		
		for (int i = 0; i < n.length; i++) { // 행반복
			for (int j = 0; j < n[i].length; j++) { //열반복
				System.out.println(n[i][j]);
			}
		}
		System.out.println("########################");
		for (int[] x : n) {
			for (int x2 : x) {
				System.out.println(x2);
			}
		}
		n[0][0]=1;
		n[0][1]=2;
		n[0][2]=3;
		n[1][0]=4;
		n[1][1]=5;
		n[1][2]=6;
		
		System.out.println(Arrays.deepToString(n));
		
		//2. 값 이용
		int [][] n2 = {{9,8,7},{6,5,4}};
		System.out.println(Arrays.deepToString(n2));
		
		//3. new + 값 이용
		int [][] n3 = new int[][] {{3,2,4},{665,32,1}};
		System.out.println(Arrays.deepToString(n3));
		
		System.out.println("행의길이:"+ n3.length);
		System.out.println("1행의 열길이:"+ n3[0].length);
	
		
		
		
		
		
		
		
	}//end main
}//end class
