package com.loose;

public class OracleDAO implements DBDAO {

	@Override
	public void connect_db() {
		System.out.println("OracleDAO.connect_db");
	}

}
