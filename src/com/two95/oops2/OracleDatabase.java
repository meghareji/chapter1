package com.two95.oops2;

public interface OracleDatabase {
	public void getConnection();
	public void createStatement();
	public void executeQuery();
	public void shutDown();
}
