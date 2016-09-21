package com.feedbackApplication.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class FeedbackRowMapper implements RowMapper<Feedback> {

	@Override
	public Feedback mapRow(ResultSet resultSet, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Feedback feedback = new Feedback();
		feedback.setFeedbackReceiver(resultSet.getString("feedbackReceiver"));
		String anonymous = resultSet.getString("anonymous");
		feedback.setAnonymous(anonymous);
		feedback.setFeedbackSubmitter(anonymous.equals("Yes")?"Anonymous":resultSet.getString("feedbackSubmitter"));
		feedback.setFeedbackDate(resultSet.getDate("feedbackDate").toString());
		feedback.setRating(resultSet.getInt("rating"));
		feedback.setFeedbackText(resultSet.getString("feedbackText"));
		return feedback;
	}

}
