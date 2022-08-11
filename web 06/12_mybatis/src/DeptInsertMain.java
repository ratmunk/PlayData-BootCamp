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

public class DeptInsertMain {
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
	     *   int n = session.insert(String id);
	     *   int n = session.insert(String id, Object obj);
	     * 
	     */
	    //가. DeptDTO 파라미터	
//		DeptDTO dto = new DeptDTO();
//		dto.setDeptno(55);
//		dto.setDname("관리");
//		dto.setLoc("서울");
//		int n = session.insert("deptInsert", dto);

		//나. hashmap 파라미터
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("x", 56);
		map.put("y", "개발");
		map.put("z", "제주");
		int n = session.insert("deptInsertMap", map);		
		
		
		
		//반드시 transaction 종료
		session.commit();
		
		// 최종적으로 session를 close해야 된다.
		session.close();
		
	}//end main
}//end clas






