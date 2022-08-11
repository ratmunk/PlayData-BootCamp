package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.dao.BoardDAO;
import com.dto.BoardDTO;
import com.dto.PageDTO;

public class BoardServiceImpl implements BoardService {
	    //4가지 정보 설정
		String driver ="oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "SCOTT";
		String passwd = "TIGER";
		
	public BoardServiceImpl() {
			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}//end 생성자	
	
	//글쓰기
	@Override
	public int write(BoardDTO dto) {
		// Connection 까지만 얻기
				int num = 0;
				Connection con = null;
				try {
					con = DriverManager.getConnection(url,userid,passwd);
					BoardDAO dao = new BoardDAO();
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
	}//end write
	
	@Override
	public PageDTO list(String searchName, String searchValue, int curPage) {
		// Connection 까지만 얻기
		      PageDTO pageDTO = null;
				Connection con = null;
				try {
					con = DriverManager.getConnection(url,userid,passwd);
					BoardDAO dao = new BoardDAO();
					pageDTO = dao.list(con, searchName, searchValue, curPage);
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					try {
						if(con!=null)con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				return pageDTO;
	}//end list()

	@Override
	public BoardDTO retrieve(int num) {
		BoardDTO dto = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			BoardDAO dao = new BoardDAO();
			dto = dao.retrieve(con, num);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	}

	@Override
	public int update(BoardDTO dto) {
		// Connection 까지만 얻기
		int num = 0;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			BoardDAO dao = new BoardDAO();
			num = dao.update(con, dto);
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
	}//end update

	@Override
	public int delete(int n) {
		// Connection 까지만 얻기
				int num = 0;
				Connection con = null;
				try {
					con = DriverManager.getConnection(url,userid,passwd);
					BoardDAO dao = new BoardDAO();
					num = dao.delete(con, n);
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
	}//end delete



}//end class
