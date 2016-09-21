package com.feedbackApplication.database;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.jdbc.core.JdbcTemplate;




public class SignUpServlet extends HttpServlet{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
		 
		 String  userEmail= request.getParameter("email");
		 String  userPassword= request.getParameter("password");
		 String  userName= request.getParameter("name");
		 
		 Date dobSql = null;
		 try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date dobUtil = sdf.parse(request.getParameter("DOB"));
			dobSql = new Date(dobUtil.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		 long  userPhone= Long.parseLong(request.getParameter("phone"));
		 
		 JdbcTemplate jdbcTemplate = DatabaseService.getJdbcTemplate();
		 
		 String insertUserSQL = "insert into user values (?,?,?,?,?)";
		 
		 int rowsAffected = jdbcTemplate.update(insertUserSQL,userEmail,userPassword,userName,dobSql,userPhone);
		
		System.out.println("user inserted : " + rowsAffected);
		
		HttpSession session = request.getSession(true);
		session.setAttribute("userEmail", userEmail);
		session.setAttribute("userName", userName);
		
		
		request.getRequestDispatcher("/feednext.jsp").forward(request, response);
	}
	/*@Override
	public void service(HttpServletRequest request, HttpServletResponse response){
		
		System.out.println("sfgshghdfdjsfhdsg");
	}*/

}
