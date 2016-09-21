package com.feedbackApplication.database;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.jdbc.core.JdbcTemplate;

public class GiveFeedbackServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		
		String recieverEmail = request.getParameter("email");
		String anonymus = request.getParameter("Anonymous");
		String commnets = request.getParameter("comments");
		int rating = 0;
		try{
			rating = Integer.parseInt(request.getParameter("star"));
		}
		catch(NumberFormatException exception){
			System.out.println("nothing selected in rating...so it will be zero");
		}
		
		HttpSession session = request.getSession();
		String submitterEmail = (String) session.getAttribute("userEmail");
		

		JdbcTemplate jdbcTemplate = DatabaseService.getJdbcTemplate();
		
		Date currentDateUtil = new Date();
		
		java.sql.Date currentDateSql = new java.sql.Date(currentDateUtil.getTime());
		String insertFeedbackSQL = "insert into feedback(feedbackReceiver,feedbackSubmitter,feedbackDate,feedbackText,anonymous,rating) values (?,?,DATE_FORMAT(NOW(),'%Y-%m-%d'),?,?,?)";
		 
		int rowsAffected = jdbcTemplate.update(insertFeedbackSQL,recieverEmail,submitterEmail,commnets,anonymus,rating);
		
		System.out.println("feedback inserted : " + rowsAffected);
		
		
		System.out.println("Give feedbak sevelet----"+recieverEmail+":"+submitterEmail+":"+anonymus+":"+commnets+":"+rating);
		request.getRequestDispatcher("/feednext.jsp").forward(request, response);
	}
}
