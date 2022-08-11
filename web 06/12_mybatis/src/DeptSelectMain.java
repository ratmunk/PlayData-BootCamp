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

public class DeptSelectMain {

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
		/*
		 *   SqlSession 메서드
		 *   
		 *   1. select
		 *     // 여러 레코드 반환시
		 *     List  list = session.selectList(String id);
		 *     List  list = session.selectList(String id, Object objs ); //objs는 where절에 사용될 데이터
		 *     List  list = session.selectList(String id, Object objs, RowBounds k ); RowBounds는 페이징처리시 사용
		 *     
		 *     // 하나 레코드 반환시 ==> PK 조건 지정, 그룹함수등
		 *     T  x = session.selectOne(String id);
		 *     T  x = session.selectOne(String id, Object obs); //objs는 where절에 사용될 데이터
		 *      
		 */
		//1. id="list" 전체 목록
//		 List<DeptDTO> list = session.selectList("list");
//		 System.out.println(list);
		
		//2.   id="selectByDeptno" 호출
//		 int deptno = 40;
//		 List<DeptDTO> list2 = 
//				  session.selectList("selectByDeptno", deptno);
//		 System.out.println(list2); 
		 
		/*
 DeptDTO  ==> DeptDTO dto = new DeptDTO();
setDeptno  ==> dto.setDeptno(40);
setDname  ==> dto.setDname("SALES");
getDeptno
getDname
getDeptno
getDname
DeptDTO
setDeptno
setDname
setLoc
[DeptDTO [deptno=30, dname=SALES, loc=CHICAGO]]
		 */
		//3.   id="selectByDeptnoAndDname" 호출
//		 DeptDTO dto = new DeptDTO();
//		 dto.setDeptno(40);
//		 dto.setDname("SALES");
//		 List<DeptDTO> list3 = 
//				  session.selectList("selectByDeptnoAndDname", dto);
//		 System.out.println(list3);
//		 
		 //3.   id="selectByDeptnoAndDname" 호출
//		HashMap<String, Object> map = new  HashMap<String, Object>();
//		map.put("xxx", 40);
//		map.put("yyy", "SALES");
//		
//		List<DeptDTO> list4 = 
//				  session.selectList("selectByDeptnoAndDnameMap", map);
//		 System.out.println(list4); 
		
		// 4. id="listPage" 호출
		//List  list = session.selectList(String id, Object objs, RowBounds k );
		// int offSet = (curPage-1)*perPage; 
//		 List<DeptDTO> list4 = 
//				  session.selectList("listPage", null, new RowBounds(1, 2)); // new RowBounds(시작위치:0부터, 갯수)
//		 System.out.println(list4);
		///////////////////////////////////////////////////////////////////////
		
		//5. id ="selectOneByDeptno"
		DeptDTO dto = session.selectOne("selectOneByDeptno", 40);
		System.out.println(dto);
		
		// 최종적으로 session를 close해야 된다.
		session.close();
		
	}//end main
}//end clas






