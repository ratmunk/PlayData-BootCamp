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

public class EmpDeptSelectMain {

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
		
		//Dept의 list
		List<DeptDTO> deptList = 
				session.selectList("com.mybatis.dept.DeptMapper.list");
		System.out.println(deptList);
		
		//Emp의 list
		List<EmpDTO> empList =
				session.selectList("com.mybatis.emp.EmpMapper.list2");
				System.out.println(empList);		
		
		// 최종적으로 session를 close해야 된다.
		session.close();
		
	}//end main
}//end clas






