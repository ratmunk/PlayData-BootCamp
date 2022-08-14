package com.dto;

import java.util.List;

// 4개의 정보 저장 ==> list.jsp에서 출력
public class PageDTO {

	 int totalRecord; //전체 레코드 갯수
	 int curPage;     //현재 페이지 번호
	 int perPage=3;   //페이지당 보여줄 갯수
	 List<BoardDTO> list;  // list.jsp에서 보여줄 데이터
	 
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getPerPage() {
		return perPage;
	}
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}
	public List<BoardDTO> getList() {
		return list;
	}
	public void setList(List<BoardDTO> list) {
		this.list = list;
	}
	 
     	 
	
	
}
