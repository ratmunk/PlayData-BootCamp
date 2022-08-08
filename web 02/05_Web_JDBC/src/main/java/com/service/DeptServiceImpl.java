package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.dao.DeptDAO;
import com.dto.DeptDTO;

public class DeptServiceImpl implements DeptService {

	//4가지 정보 설정
	String driver ="oracle.jdbc.driver.OracleDriver";
	String url ="jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "SCOTT";
	String passwd = "TIGER";
	
	public DeptServiceImpl() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//end 생성자
	
	@Override
	public List<DeptDTO> list() {
		// Connection 까지만 얻기
		List<DeptDTO> list = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			DeptDAO dao = new DeptDAO();
			list = dao.list(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	@Override
	public int write(DeptDTO dto) {
		// Connection 까지만 얻기
		int num = 0;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			DeptDAO dao = new DeptDAO();
			num = dao.write(con, dto);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return num;
	}

}
