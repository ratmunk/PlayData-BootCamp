package com.service;

import org.apache.ibatis.session.SqlSession;

import com.dto.BoardDTO;
import com.dto.PageDTO;

public interface BoardService {

	//목록보기
	public PageDTO list(String searchName, 
			String searchValue, int curPage);
	
	//글쓰기
	public int write(BoardDTO dto);
	
	//글자세히 보기
	public BoardDTO retrieve(int num);
	
}
