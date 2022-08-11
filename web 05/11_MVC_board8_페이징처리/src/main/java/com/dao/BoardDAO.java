package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.BoardDTO;
import com.dto.PageDTO;

import oracle.net.aso.b;

public class BoardDAO {

	
	//글삭제
	public int delete(Connection con, int n) {
			int num = 0;
			PreparedStatement pstmt = null;
			try {
				String sql="delete from board where num=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, n);
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
	}//end delete
	//글수정
	public int update(Connection con, BoardDTO dto) {
		int num = 0;
		PreparedStatement pstmt = null;
		try {
			String sql="update board set title=?, author=?, content=? where num=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getAuthor());
			pstmt.setString(3, dto.getContent());
			pstmt.setInt(4, dto.getNum());
			
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
	}//end update
	
	//조회수 증가
	private void readCntUpdate(Connection con, int num) {
		PreparedStatement pstmt = null;
		try {
			String sql="update board set readcnt = readcnt + 1  where num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
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
	}//end readCntUpdate
	//글자세히 보기
	public BoardDTO retrieve(Connection con, int num) {
		///////////////////////////////
		readCntUpdate(con, num);
		///////////////////////////////
		BoardDTO dto = new BoardDTO();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql="select num, title, author, content, to_char(writeday, 'YYYY/MM/dd') as writeday, "
					+ " readcnt from board where num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) { // 레코드 한개거나 없거나
			    String title = rs.getString("title");
				String author = rs.getString("author");
				String content = rs.getString("content");
				String writeday = rs.getString("writeday");
				int readcnt = rs.getInt("readcnt");
				dto.setNum(num);
				dto.setTitle(title);
				dto.setAuthor(author);
				dto.setContent(content);
				dto.setWriteday(writeday);
				dto.setReadcnt(readcnt);
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
		return dto;
	}//end retrieve
	
	
	//글쓰기
	public int write(Connection con, BoardDTO dto) {
		int num = 0;
		PreparedStatement pstmt = null;
		try {
			String sql="insert into board (num, title, author, content ) "
					+ " values( board_seq.nextval, ? , ?, ?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getAuthor());
			pstmt.setString(3, dto.getContent());
			
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
	}//end write
	
	
	
	//목록보기
	public PageDTO list(Connection con,String searchName, String searchValue, int curPage){
		PageDTO pageDTO = new PageDTO();
		int perPage = pageDTO.getPerPage();
		int offSet = (curPage-1)*perPage + 1;             // 시작위치
		////////////////////////////////////////////////////////
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			StringBuffer buffer = new StringBuffer();
			buffer.append("SELECT num, title, author, content, to_char(writeday, 'YYYY/MM/dd') as writeday , readcnt");
			buffer.append(" FROM");
			buffer.append(" (");
			buffer.append(" SELECT SEQ, num, title, author, content, writeday, readcnt");
			buffer.append(" FROM");
			buffer.append(" (");
			buffer.append(" SELECT ROWNUM AS SEQ, num, title, author, content, writeday, readcnt");
			buffer.append(" FROM");
			buffer.append(" (");
			buffer.append(" SELECT num, title, author, content, writeday , readcnt");
			buffer.append(" FROM board");
			
			if("title".equals(searchName) && searchValue != null) {
				buffer.append(" where title LIKE ?");
				buffer.append(" ORDER BY num DESC");
				buffer.append(" )");
				buffer.append(" )");
				buffer.append(" WHERE SEQ >= " + offSet);
				buffer.append(" )");
				buffer.append(" WHERE ROWNUM <= "+perPage);
				pstmt = con.prepareStatement(buffer.toString());
				pstmt.setString(1, "%"+searchValue+"%");

			}else if("author".equals(searchName) && searchValue != null){
				buffer.append(" where author LIKE ?");
				buffer.append(" ORDER BY num DESC");
				buffer.append(" )");
				buffer.append(" )");
				buffer.append(" WHERE SEQ >= " + offSet);
				buffer.append(" )");
				buffer.append(" WHERE ROWNUM <= "+perPage);
				pstmt = con.prepareStatement(buffer.toString());
				pstmt.setString(1, "%"+searchValue+"%");

			}else {
				buffer.append(" ORDER BY num DESC");
				buffer.append(" )");
				buffer.append(" )");
				buffer.append(" WHERE SEQ >= " + offSet);
				buffer.append(" )");
				buffer.append(" WHERE ROWNUM <= "+perPage);
				pstmt = con.prepareStatement(buffer.toString());
			}
			System.out.println("#################################");
			System.out.println(buffer.toString());
			System.out.println("#################################");
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
		////////////////////////////////////////////////////////
		pageDTO.setList(list);
		pageDTO.setCurPage(curPage);
		pageDTO.setTotalRecord(totalRecord(con, searchName, searchValue));
		return pageDTO;
		
	}//end list
	
	//전체 레코드
	private int totalRecord(Connection con, String searchName, String searchValue) {
		int count = 0;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql="select count(*) from board ";
			
			if("title".equals(searchName) && searchValue != null) {
				sql += " where title LIKE ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, "%"+searchValue+"%");
			}else if("author".equals(searchName) && searchValue != null){
				sql += " where author LIKE ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, "%"+searchValue+"%");
			}else {
				pstmt = con.prepareStatement(sql);
			}
			rs = pstmt.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);
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
		return count;
	}//end totalRecord
	
	
	
	
	
	
	
	
}//end class
