package com.service;

import java.sql.Connection;
import java.util.List;

import com.dto.DeptDTO;

public interface DeptService {

	//목록보기
	public List<DeptDTO> list();
	
	//부서등록
	public int write(DeptDTO dto);
}
