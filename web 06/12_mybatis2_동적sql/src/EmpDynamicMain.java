import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dto.DeptDTO;
import com.dto.EmpDTO;

public class EmpDynamicMain {

	public static void main(String[] args) {
		// Mybatis DB 연동

		//1. Configuration.xml 읽기
		String resource = "com/config/Configuration.xml";
		InputStream inputStream=null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory x =
		  new SqlSessionFactoryBuilder().build(inputStream);
		
		
		//2. SqlSessionFactory 에서 SqlSession 얻기
		SqlSession session = x.openSession();
		/////////////////////////////////////////////////////
		 // 가. update 문 ==> set절이 동적인 경우
		/*
		 *    udate emp
		 *    set sal = 값
		 *    where empno = 값;

		 *    udate emp
		 *    set sal = 값, ename=값
		 *    where empno = 값;

		 */
//		 EmpDTO dto = new EmpDTO();
//		 dto.setEmpno(7369); //고정
//		 
////		 dto.setSal(8000);
//		 dto.setEname("SMITH");
//		
//		 int n = session.update("updateSalorEnameIfNecessary", dto);
//		 session.commit();
		 
		// 나. 다중 insert 문 ==> 저장할 값이 동적
		/*
		 *    오라클에서의 다중 insert문
		 *    
		 *    insert all
	 *     		into dept (deptno,dname,loc) values ( 값,값2,값3)  
	 *     		into dept (deptno,dname,loc) values ( 값,값2,값3)  
	 *          ...
	 *    
	 *        select * from dual;
		 *    
		 * 
		 */
//		DeptDTO dto1 = new DeptDTO(1, "AAA", "AAA");
//		DeptDTO dto2 = new DeptDTO(2, "AAA2", "AAA2");
//		DeptDTO dto3 = new DeptDTO(3, "AAA3", "AAA3");
//		List<DeptDTO> list =
//				Arrays.asList(dto1, dto2, dto3);
//				
//		int n = session.insert("com.mybatis.emp.EmpMapper.deptMultiInsert"
//				, list);
//		session.commit();
//		System.out.println("저장갯수:" + n);
		
		//다. 다중 delete ==> 삭제할 값이 동적
		/*
		 *   delete from dept
		 *   where 컬럼 IN ( 값, 값, .... );
		 * 
		 */
//		DeptDTO dto1 = new DeptDTO();
//		dto1.setDeptno(1);
//		DeptDTO dto2 = new DeptDTO();
//		dto2.setDeptno(2);
//		
//		List<DeptDTO> list = Arrays.asList(dto1, dto2);
//		int n2 = session.delete("com.mybatis.emp.EmpMapper.deptMultiDelete", list);
//		session.commit();
//		System.out.println("삭제된 갯수:" + n2);
		
		//다. 다중 delete2 ==> 삭제할 값이 동적
		List<String> list = Arrays.asList("BBB", "CCC","ZZZ");
		int n2 = session.delete("com.mybatis.emp.EmpMapper.deptMultiDelete2", list);
		session.commit();
		System.out.println("삭제된 갯수:" + n2);
		
		
		
		/////////////////////////////////////////////////////
		// 최종적으로 session를 close해야 된다.
		session.close();
		
	}//end main
}//end clas






