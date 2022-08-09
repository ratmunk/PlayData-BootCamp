package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.dao.BoardDAO;
import com.dto.BoardDTO;

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
	public List<BoardDTO> list() {
		// Connection 까지만 얻기
				List<BoardDTO> list = null;
				Connection con = null;
				try {
					con = DriverManager.getConnection(url,userid,passwd);
					BoardDAO dao = new BoardDAO();
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
	}//end list()



}//end class
