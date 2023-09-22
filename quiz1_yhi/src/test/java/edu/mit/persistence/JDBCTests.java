package edu.mit.persistence;

import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {

	@Test
	public void testConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.getConnection("jdbc:mysql://@127.0.0.1"
				, "aaa", "1234");
	
	}
	
	@Test
	public void aaa() {
		log.info("잘 나온다.");
	}
	
}


