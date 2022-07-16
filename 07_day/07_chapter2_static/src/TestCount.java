 class Counter{
	
	 int num; //인스턴스 변수 ==> 개별적인 데이터 저장시,자동초기화, 반드시 객체생성후에 사용가능
	 static int count;// static 변수==> 누적용으로 주로 사용된다. 자동초기화,객체(new) 생성 전에 사용 가능=>new무관(heap메모리쪽 관련없음).
	 public Counter() {
		 //갯수 세기
		 count++;
	 }
	 public int getNum(){ //인스턴스 메서드
		 return num;
	 }
	 public int getCount() { // 인스턴스 메서드에서는 static 변수 사용 가능==> static변수가 먼저생성됨.
		 System.out.println(this.num);
		 return count;
	 }
	 
	 //static 메서드 ==> 객체(new) 생성 전에 사용 가능=>new무관(heap메모리쪽 관련없음).
	 public static int getStaticCount() {
//		 System.out.println(this); // 인스턴스 참조 불가
//		 return num; // 인스턴스 참조 불가
		 return count;  // 같은 static 사용 가능
	 }
	 
}//end class

/*
 *  Counter 클래스를 몇번 new 했는지 갯수 알아보기
 * 
 */
public class TestCount {
	public static void main(String[] args) {
		
		System.out.println(Counter.getStaticCount()); // 객체생성없이 사용
		System.out.println(Counter.count); //누적용
		
		Counter c = new Counter();
		System.out.println(c.num);
		System.out.println(c.getCount());
		Counter c2 = new Counter();
		System.out.println(c2.getCount());
	}
}
