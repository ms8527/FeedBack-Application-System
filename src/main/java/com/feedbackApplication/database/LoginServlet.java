package com.feedbackApplication.database;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		
		String userEmail = request.getParameter("userEmail");
		
		String userPassword = request.getParameter("password");
		
		System.out.println("Data from request object ---- userEmail: "+userEmail + "--password: "+userPassword);
		
		String loginVerifySQL = "select * from user where userEmailId = ? and userPassword = ?";
		JdbcTemplate jdbcTemplate = DatabaseService.getJdbcTemplate();
		try{
			
			User user = jdbcTemplate.queryForObject(loginVerifySQL, new Object[]{userEmail,userPassword},new UserRowMapper());
			HttpSession session = request.getSession(true);
			
			System.out.println("user data present --- userName: "+user.getUserName());
			session.setAttribute("userEmail",userEmail);
			session.setAttribute("userName", user.getUserName());
			
			
			request.getRequestDispatcher("/feednext.jsp").forward(request, response);
		}
		catch(IncorrectResultSizeDataAccessException exception){
			System.out.println("user data not present");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			
		}
		
	}

}
