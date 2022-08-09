package com.service;

import java.util.List;

import com.dto.BoardDTO;

public interface BoardService {
		
		//목록보기
		public List<BoardDTO> list();
		
		//글쓰기
		public int write(BoardDTO dto);
		
		//글자세히 보기
		public BoardDTO retrieve(int num);
}
