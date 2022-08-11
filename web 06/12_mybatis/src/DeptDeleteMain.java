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

public class DeptDeleteMain {
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
	     *   int n = session.delete(String id);
	     *   int n = session.delete(String id, Object obj);
	     * 
	     */
		
		int n = session.delete("deleteByDeptno", 56);
		
		DeptDTO dto = new DeptDTO();
		dto.setDeptno(55);
		dto.setDname("개발");
		
		n = session.delete("deleteByDeptnoOrDname", dto);
		System.out.println("삭제된 레코드갯수:" + n);
		session.commit();
		
		// 최종적으로 session를 close해야 된다.
		session.close();
		
	}//end main
}//end clas






