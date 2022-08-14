package com.service;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.BoardDAO;
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

}
