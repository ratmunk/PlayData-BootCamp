package com.service;

import java.util.List;

import com.dto.DeptDTO;

public interface DeptService {
       	//목록보기
		public List<DeptDTO> list();
		
		//저장
		public int deptInsert(DeptDTO dto) throws Exception;
		
		//삭제
		public int deptDelete(int deptno) throws Exception;
		
		//수정
		public int deptUpdate(DeptDTO dto) throws Exception;
		
}
