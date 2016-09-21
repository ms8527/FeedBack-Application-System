package com.feedbackApplication.database;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;


public class DatabaseService {
	
	private final BasicDataSource dataSource; 
	private final JdbcTemplate jdbcTemplate;
	//private static final String URL = "jdbc:mysql://localhost:3306/feedback";
	private static final String URL = "jdbc:mysql://feedback.c1y7mqghyro3.us-east-1.rds.amazonaws.com:3306/feedback";
	private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "mypassword";
	private static final int INITIAL_SIZE = 5;
	private static final int MAX_ACTIVE_SIZE = 10;
	
	private DatabaseService(){
		dataSource = new BasicDataSource();
		dataSource.setDriverClassName(DRIVER_NAME);
		dataSource.setUrl(URL);
		dataSource.setUsername(USERNAME);
		dataSource.setPassword(PASSWORD);
		dataSource.setInitialSize(INITIAL_SIZE);
		dataSource.setMaxActive(MAX_ACTIVE_SIZE);
		
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	private static class LazyHolder{
		private static final DatabaseService INSTANCE = new DatabaseService();
	}
	public static JdbcTemplate getJdbcTemplate(){
		return LazyHolder.INSTANCE.jdbcTemplate;
	}
}
