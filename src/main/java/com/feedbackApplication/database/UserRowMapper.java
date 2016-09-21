package com.feedbackApplication.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet resultSet, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		
		User user = new User();
		user.setUserEmail(resultSet.getString("userEmailId"));
		user.setUserPassword(resultSet.getString("userPassword"));
		user.setUserName(resultSet.getString("userName"));
		user.setUserDOB(resultSet.getString("userDOB"));
		user.setUserPhone(Long.parseLong(resultSet.getString("userPhone")));
		return user;
	}

}
