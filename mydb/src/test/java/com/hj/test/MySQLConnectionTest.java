package com.hj.test;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {
	private static final String DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	
	private static final String URL = "jdbc:sqlserver://122.199.232.68:34865";
	
	private static final String USER="sa";
	
	private static final String PW="bit";
	
	
	public MySQLConnectionTest() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void testConnection() throws Exception{
		Class.forName(DRIVER);
		
		try(Connection con=DriverManager.getConnection(URL,USER,PW)){
			System.out.println(con);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
