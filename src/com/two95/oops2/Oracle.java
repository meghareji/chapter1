package com.two95.oops2;

public class Oracle implements OracleDatabase{
	static  {
		System.out.println("Oracle DB Initialized");
		}
		public void getConnection() {
		clearCache();
		System.out.println("Got the connection from Oracle DB");
		}
		private void clearCache() {
		System.out.println("Cache Cleared");
		}
		public void createStatement() {
		System.out.println("Created Oracle Statement");
		}
		public void executeQuery() {
		System.out.println("SQL Executed");
		}
		public void shutDown() {
		System.out.println("Oracle Shutdown Completed");
		}
		}
	

