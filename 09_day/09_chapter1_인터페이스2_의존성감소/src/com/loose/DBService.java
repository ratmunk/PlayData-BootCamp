package com.loose;

public class DBService {

	DBDAO dao;
	
	public void setDAO(DBDAO dao) {
		this.dao = dao;
	}
	
	public void connect() {
		dao.connect_db();
	}
	
}
