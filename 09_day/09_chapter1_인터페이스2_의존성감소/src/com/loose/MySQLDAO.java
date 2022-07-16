package com.loose;

public class MySQLDAO implements DBDAO {

	@Override
	public void connect_db() {
		System.out.println("MySQLDAO.connect_db");
	}

}
