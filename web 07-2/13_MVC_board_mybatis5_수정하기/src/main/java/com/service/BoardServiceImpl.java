package com.service;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.BoardDAO;
import com.dto.BoardDTO;
import com.dto.PageDTO;

public class BoardServiceImpl implements BoardService {

	/*
	    SqlSession session  = MySqlSessionFactory.getSession();
	    try{
	     //DAO 연동 
	    
	    }finally{
	      session.close();
	    }
	*/
	@Override
	public PageDTO list(String searchName, String searchValue, int curPage) {
		 PageDTO pageDTO = null;
		 SqlSession session  = MySqlSessionFactory.getSession();
		    try{
		     //DAO 연동 
		     BoardDAO dao = new BoardDAO();
		     pageDTO = dao.list(session, searchName, searchValue, curPage);
		    }finally{
		      session.close();
		    }
		
		return pageDTO;
	}//end list

	@Override
	public int write(BoardDTO dto) {
		 int n = 0;
		 SqlSession session  = MySqlSessionFactory.getSession();
		    try{
		     //DAO 연동 
		      BoardDAO dao = new BoardDAO();
		      n = dao.write(session, dto);
		      session.commit();
		    }finally{
		      session.close();
		    }
		return n;
	}//end write

	@Override
	public BoardDTO retrieve(int num) {
		
		
		BoardDTO dto = null;
		  SqlSession session  = MySqlSessionFactory.getSession();
		    try{
		     //DAO 연동 
		      BoardDAO dao = new BoardDAO();
		      dao.readCntUpdate(session, num);
		      session.commit();
		      dto = dao.retrieve(session, num);
		    }finally{
		      session.close();
		    }
		return dto;
	}//end retrieve

	@Override
	public int update(BoardDTO dto) {
		 int n = 0;
		 SqlSession session  = MySqlSessionFactory.getSession();
		    try{
		     //DAO 연동 
		      BoardDAO dao = new  BoardDAO();
		      n = dao.update(session, dto);
		      session.commit();
		    }finally{
		      session.close();
		    }
		return n;
	}//end update

}
