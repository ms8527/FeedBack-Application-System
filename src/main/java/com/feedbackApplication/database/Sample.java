package com.feedbackApplication.database;

import org.springframework.jdbc.core.JdbcTemplate;

public class Sample {

	public int getCount(){
		JdbcTemplate jdbcTemplate = DatabaseService.getJdbcTemplate();
		 
	 	String getUserCountSQL = "select count(*) from user";
	 	
	 	int count = jdbcTemplate.queryForObject(getUserCountSQL, Integer.class);
	 	return count+1;
	}
}
