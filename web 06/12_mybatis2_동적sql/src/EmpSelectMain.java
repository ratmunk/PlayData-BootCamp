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

import com.dto.EmpDTO;

public class EmpSelectMain {

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
		
		//1. if 문
//		EmpDTO dto = new EmpDTO();
////		dto.setEmpno(7839);
//		
//		List<EmpDTO> empList = 
//				session.selectList("com.mybatis.emp.EmpMapper.selectByEmpnoDynamic",
//						dto);
//		System.out.println(empList);

		//2. Choose 문
//		HashMap<String, String> map =
//				new HashMap<String, String>();
////		map.put("job", "CLERK");
////		map.put("job", "SALESMAN");
//		map.put("job", "MANAGER");
//		List<EmpDTO> empList = 
//		session.selectList("com.mybatis.emp.EmpMapper.selectByJobChoose",
//				map);
//		System.out.println(empList.size());
		
		//3. 조건이 있거나 없거나 ==> <where>태그
		EmpDTO dto = new EmpDTO();
		dto.setSal(1500);
	
	List<EmpDTO> empList = 
			session.selectList("com.mybatis.emp.EmpMapper.selectBySqlWhereDynamic",
					dto);
	System.out.println(empList.size());
		
		 
	
	
	
		/////////////////////////////////////////////////////
		// 최종적으로 session를 close해야 된다.
		session.close();
		
	}//end main
}//end clas






