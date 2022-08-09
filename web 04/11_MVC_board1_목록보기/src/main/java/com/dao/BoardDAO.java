package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.BoardDTO;

public class BoardDAO {

	//목록보기
	public List<BoardDTO> list(Connection con){
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql="select num, title, author, content, writeday, readcnt from board order by num desc";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int num = rs.getInt("num");
			    String title = rs.getString("title");
				String author = rs.getString("author");
				String writeday = rs.getString("writeday");
				int readcnt = rs.getInt("readcnt");
				// 나중에 Builder 패턴
				BoardDTO dto = new BoardDTO();
				dto.setNum(num);
				dto.setTitle(title);
				dto.setAuthor(author);
				dto.setWriteday(writeday);
				dto.setReadcnt(readcnt);
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
