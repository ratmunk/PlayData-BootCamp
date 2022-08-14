package com.dao;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dto.BoardDTO;
import com.dto.PageDTO;

public class BoardDAO {

	//전체 레코드 갯수
	public int totalRecord(SqlSession session, HashMap<String, String> map ) {
		return session.selectOne("com.mybatis.board.BoardMapper.totalRecord", map);
	}
	//목록
	public PageDTO list(SqlSession session,String searchName, 
			String searchValue, int curPage) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("searchName", searchName);
		map.put("searchValue", searchValue);
		
		PageDTO pageDTO = new PageDTO();
		int perPage = pageDTO.getPerPage();
		int offSet = (curPage-1)*perPage;
	    List<BoardDTO> list = session.selectList("com.mybatis.board.BoardMapper.list", map ,
                 new RowBounds(offSet, perPage));  
		// PageDTO에 4개의 정보 저장
	    pageDTO.setCurPage(curPage);
	    pageDTO.setList(list);
		pageDTO.setTotalRecord(totalRecord(session, map));
		
	    return pageDTO;
	}//end list
	
	//글쓰기
	public int write(SqlSession session, BoardDTO dto) {
		return session.insert("com.mybatis.board.BoardMapper.write", dto);
	}
	
	//조회수 증가
	public void readCntUpdate(SqlSession session, int num) {
		session.update("com.mybatis.board.BoardMapper.readCnt", num);
	}
	
	//글자세히 보기
	public BoardDTO retrieve(SqlSession session, int num) {
	   
		return session.selectOne("com.mybatis.board.BoardMapper.retrieve", num );
	}
	
}//end class
