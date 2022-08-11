package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.DeptDTO;

public class DeptDAO {

	public List<DeptDTO> list(SqlSession session){
		return session.selectList("com.mybatis.dept.DeptMapper.list");
	}
	
	public int deptInsert(SqlSession session, DeptDTO dto) {
		return session.insert("com.mybatis.dept.DeptMapper.deptInsert", dto);
	}
	
	public int deptDelete(SqlSession session, int deptno) {
		return session.insert("com.mybatis.dept.DeptMapper.deleteByDeptno", deptno);
	}
	
	public int deptUpdate(SqlSession session, DeptDTO dto) {
		return session.update("com.mybatis.dept.DeptMapper.deptUpdate", dto);
	}
}
