package com.tight;

public class DBService {

	//OracleDAO 접근(사용)
//	OracleDAO dao;
	MySQLDAO dao;
	
	public void setDAO(MySQLDAO dao) {
		this.dao = dao;
	}
	
	public void connect() {
		dao.mysql_connect();
	}
	
	
}
