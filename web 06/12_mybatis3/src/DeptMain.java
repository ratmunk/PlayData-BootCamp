import java.util.List;
import java.util.Scanner;

import com.dto.DeptDTO;
import com.service.DeptService;
import com.service.DeptServiceImpl;

public class DeptMain {

	public static void main(String[] args) {

		while(true) {
			System.out.println("메뉴");
			System.out.println("1. 목록");
			System.out.println("2. 저장");
			System.out.println("3. 삭제");
			System.out.println("4. 수정");
			System.out.println("0. 프로그램 종료");
			
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();			
			if(num==1) {
				DeptService service = new DeptServiceImpl();
				List<DeptDTO> list = service.list();
				for (DeptDTO dto : list) {
					System.out.println(dto);
				}
			}else if(num==2) {
				System.out.println("저장할 부서번호 입력");
				int deptno = scan.nextInt();
				System.out.println("저장할 부서명 입력");
				String dname = scan.next();
				System.out.println("저장할 부서위치 입력");
				String loc = scan.next();
				
				DeptDTO dto = new DeptDTO(deptno, dname, loc);
				DeptService service = new DeptServiceImpl();
				int n=0;
				try {
					n = service.deptInsert(dto);
					if(n==1) {
						System.out.println("저장 성공");
					}
				} catch (Exception e) {
					System.out.println("부서번호 중복 에러 발생");
					System.out.println("부서번호 확인 요망");
				}
			}else if(num==3) {	
				System.out.println("삭제할 부서번호 입력");
				int deptno = scan.nextInt();
				DeptService service = new DeptServiceImpl();
				try {
					int n = service.deptDelete(deptno);
					if(n==1) {
						System.out.println("삭제 성공");
					}
				} catch (Exception e) {
					System.out.println("삭제 에러 발생");
					System.out.println("부서번호 확인 요망");
				}
			}else if(num==4) {
				System.out.println("수정할 부서번호 입력");
				int deptno = scan.nextInt();
				System.out.println("수정할 부서명 입력");
				String dname = scan.next();
				System.out.println("수정할 부서위치 입력");
				String loc = scan.next();
				
				DeptDTO dto = new DeptDTO(deptno, dname, loc);
				DeptService service = new DeptServiceImpl();
				int n=0;
				try {
					n = service.deptUpdate(dto);
					if(n==1) {
						System.out.println("수정 성공");
					}
				} catch (Exception e) {
					System.out.println("부서번호 중복 에러 발생");
					System.out.println("부서번호 확인 요망");
				}	
			}else if(num==0) {
				System.out.println("프로그램 정상 종료");		
				System.exit(0);
			}
		}//end while
	}//end main
}//end class
