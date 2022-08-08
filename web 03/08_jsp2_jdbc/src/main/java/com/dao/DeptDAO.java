package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.DeptDTO;

public class DeptDAO {
	
	//부서등록
	public int write(Connection con, DeptDTO dto) {
		int num = 0;
		PreparedStatement pstmt = null;
		try {
			String sql="insert into dept (deptno, dname, loc ) "
					+ " values(?, ? , ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
			
			num = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		return num;
	}
	
	
	public List<DeptDTO> list(Connection con){
		List<DeptDTO> list = new ArrayList<DeptDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql="select deptno,dname,loc from dept order by deptno desc";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				DeptDTO dto = new DeptDTO(deptno, dname, loc);
				list.add(dto);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		return list;
	}//end list
}//end class
