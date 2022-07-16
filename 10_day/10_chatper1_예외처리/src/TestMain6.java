// finally문 정리
/* 
 *   다음문장은 예외처리는 불가능하지만
 *   반드시 수행되어야 하는 문장을 의도적으로 노출하기 위해서 사용한 것이다.
 * 
 *   try{
 *     실행코드;
 *     실행코드;
 *   }finally{
 *     무조건 실행되어야 하는 문장  ==> 주로 외부자원(파일,DB) 사용할 때 잘 사용했다고 알려주는 작업 ( close() 지정 )
 *   }
 *   * 외부자원(파일,DB) 사용하는 프로세스
 *   1) 외부자원을 사용하겠습니다. ( 초기화 ) ==> 생성자, static{}
 *   2) 사용
 *   3) 잘 사용했습니다.  ( 자원반납 ) ==> finally문
 * 
 */
public class TestMain6 {
	public static void main(String[] args) {
		System.out.println("start");
     try {		
		System.out.println("보편적인 코드");
     }finally {
    	 System.out.println("홍길동 출력");
	 }
		System.out.println("main 정상종료");
	}//end main
}//end class
