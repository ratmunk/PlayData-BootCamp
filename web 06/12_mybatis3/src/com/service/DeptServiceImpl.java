package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.DeptDAO;
import com.dto.DeptDTO;

public class DeptServiceImpl implements DeptService {

	 /*
	       SqlSession session = MySqlSessionFactory.getSession();
	       try{
	         //DAO 연동
	       }finally{
	         session.close();
	       }
	  */
	 
	@Override
	public List<DeptDTO> list() {
		// 핵심작업은 SqlSession 얻기
		SqlSession session = MySqlSessionFactory.getSession(); // 나중에 얻기
		List<DeptDTO> list = null;
		try {
			DeptDAO dao = new DeptDAO();
			list = dao.list(session);
		}finally {
			session.close();
		}	
		return list;
	}

	@Override
	public int deptInsert(DeptDTO dto)
			throws Exception {
	       SqlSession session = MySqlSessionFactory.getSession();
	       int n = 0;
	       try{
	         //DAO 연동
	    	   DeptDAO dao = new DeptDAO();
	    	  n = dao.deptInsert(session, dto);
	    	  session.commit();
	       }finally{
	         session.close();
	       }
		return n;
	}

	@Override
	public int deptDelete(int deptno) throws Exception {
	       SqlSession session = MySqlSessionFactory.getSession();
	       int n = 0;
	       try{
	         //DAO 연동
	    	   DeptDAO dao = new DeptDAO();
		       n = dao.deptDelete(session, deptno);
		       session.commit();
	       }finally{
	         session.close();
	       }
		return n;
	}

	@Override
	public int deptUpdate(DeptDTO dto) throws Exception {
		 SqlSession session = MySqlSessionFactory.getSession();
	       int n = 0;
	       try{
	         //DAO 연동
	    	   DeptDAO dao = new DeptDAO();
	    	  n = dao.deptUpdate(session, dto);
	    	  session.commit();
	       }finally{
	         session.close();
	       }
		return n;
	}
  
	
	
}
