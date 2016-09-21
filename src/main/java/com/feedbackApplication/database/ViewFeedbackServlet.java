package com.feedbackApplication.database;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.jdbc.core.JdbcTemplate;

public class ViewFeedbackServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String fromDate = request.getParameter("dateFrom");
		String toDate = request.getParameter("dateTo");
		String anonymous = request.getParameter("Anonymous")==null?"":request.getParameter("Anonymous");
		String rating = request.getParameter("rating");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date fromDateUtil= null;
		java.sql.Date fromDateSql = null;
		
		java.util.Date toDateUtil = null;
		java.sql.Date toDateSql = null;
		try {
			fromDateUtil = fromDate.equals("")?null:sdf.parse(fromDate);
			fromDateSql = fromDateUtil==null?null:new java.sql.Date(fromDateUtil.getTime());
			
			toDateUtil = toDate.equals("")?null:sdf.parse(toDate);
			toDateSql = toDateUtil==null?null:new java.sql.Date(toDateUtil.getTime());
		} catch (ParseException e) {
			System.err.println("date parsing exception");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HttpSession session = request.getSession();
		
		String userEmail = (String)session.getAttribute("userEmail");
		
		JdbcTemplate jdbcTemplate = DatabaseService.getJdbcTemplate();
		System.out.println(fromDate+":"+toDate+":"+anonymous+":"+rating);
		List<Feedback> list = null;
		if(fromDate.equals("") && toDate.equals("") && anonymous.equals("") && rating.equals("")){
			System.out.println("no field is selected");
			
			String selectFeedbackSQL = "select * from feedback where feedbackReceiver = ?";
			list = jdbcTemplate.query(selectFeedbackSQL, new Object[]{userEmail}, new FeedbackRowMapper());
		}
		
		else if(!fromDate.equals("") && toDate.equals("") && anonymous.equals("") && rating.equals("")){
			System.out.println("from date only selected");
			String selectFeedbackSQL = "select * from feedback where feedbackReceiver = ? and feedbackDate >= ?";
			list = jdbcTemplate.query(selectFeedbackSQL, new Object[]{userEmail,fromDateSql}, new FeedbackRowMapper());
		}
		
		else if(fromDate.equals("") && !toDate.equals("") && anonymous.equals("") && rating.equals("")){
			System.out.println("only to date selected");
			String selectFeedbackSQL = "select * from feedback where feedbackReceiver = ? and feedbackDate <= ?";
			list = jdbcTemplate.query(selectFeedbackSQL, new Object[]{userEmail,toDateSql}, new FeedbackRowMapper());
		}
		
		else if(fromDate.equals("") && toDate.equals("") && !anonymous.equals("") && rating.equals("")){
			System.out.println("only to anonymous thing selected");
			String selectFeedbackSQL = "select * from feedback where feedbackReceiver = ? and anonymous = ?";
			list = jdbcTemplate.query(selectFeedbackSQL, new Object[]{userEmail,anonymous}, new FeedbackRowMapper());
		}
		
		else if(fromDate.equals("") && toDate.equals("") && anonymous.equals("") && !rating.equals("")){
			System.out.println("only rating thing selected");
			String selectFeedbackSQL = "select * from feedback where feedbackReceiver = ? and rating = ?";
			list = jdbcTemplate.query(selectFeedbackSQL, new Object[]{userEmail,rating}, new FeedbackRowMapper());
		}
		
		else if(!fromDate.equals("") && !toDate.equals("") && anonymous.equals("") && rating.equals("")){
			System.out.println("from date and to date selected");
			String selectFeedbackSQL = "select * from feedback where feedbackReceiver = ? and feedbackDate >= ? and feedbackDate <= ?";
			list = jdbcTemplate.query(selectFeedbackSQL, new Object[]{userEmail,fromDateSql,toDateSql}, new FeedbackRowMapper());
		}
		
		else if(!fromDate.equals("") && toDate.equals("") && !anonymous.equals("") && rating.equals("")){
			System.out.println("from date and anonymous selected");
			String selectFeedbackSQL = "select * from feedback where feedbackReceiver = ? and feedbackDate >= ? and anonymous = ?";
			list = jdbcTemplate.query(selectFeedbackSQL, new Object[]{userEmail,fromDateSql,anonymous}, new FeedbackRowMapper());
		}
		
		else if(!fromDate.equals("") && toDate.equals("") && anonymous.equals("") && !rating.equals("")){
			System.out.println("from date and rating selected");
			String selectFeedbackSQL = "select * from feedback where feedbackReceiver = ? and feedbackDate >= ? and rating = ?";
			list = jdbcTemplate.query(selectFeedbackSQL, new Object[]{userEmail,fromDateSql,rating}, new FeedbackRowMapper());
			
		}
		
		else if(fromDate.equals("") && !toDate.equals("") && !anonymous.equals("") && rating.equals("")){
			System.out.println("to date and  anonymous  selected");
			String selectFeedbackSQL = "select * from feedback where feedbackReceiver = ? and feedbackDate <= ? and anonymous = ?";
			list = jdbcTemplate.query(selectFeedbackSQL, new Object[]{userEmail,toDateSql,anonymous}, new FeedbackRowMapper());
		}
		
		else if(fromDate.equals("") && !toDate.equals("") && anonymous.equals("") && !rating.equals("")){
			System.out.println("to date and rating selected");
			String selectFeedbackSQL = "select * from feedback where feedbackReceiver = ? and feedbackDate <= ? and rating = ?";
			list = jdbcTemplate.query(selectFeedbackSQL, new Object[]{userEmail,toDateSql,rating}, new FeedbackRowMapper());
		}
		
		else if(fromDate.equals("") && toDate.equals("") && !anonymous.equals("") && !rating.equals("")){
			System.out.println("anonymous and rating selected");
			String selectFeedbackSQL = "select * from feedback where feedbackReceiver = ? and anonymous= ? and rating = ?";
			list = jdbcTemplate.query(selectFeedbackSQL, new Object[]{userEmail,anonymous,rating}, new FeedbackRowMapper());
		}
		
		else if(!fromDate.equals("") && !toDate.equals("") && !anonymous.equals("") && rating.equals("")){
			System.out.println("from date , to date and anonymous selected");
			String selectFeedbackSQL = "select * from feedback where feedbackReceiver = ? and feedbackDate >= ? and feedbackDate <= ? and anonymous= ?";
			list = jdbcTemplate.query(selectFeedbackSQL, new Object[]{userEmail,fromDateSql,toDateSql,anonymous}, new FeedbackRowMapper());
		}
		
		else if(!fromDate.equals("") && !toDate.equals("") && anonymous.equals("") && !rating.equals("")){
			System.out.println("from date, to date and rating selected");
			String selectFeedbackSQL = "select * from feedback where feedbackReceiver = ? and feedbackDate >= ? and feedbackDate <= ? and rating= ?";
			list = jdbcTemplate.query(selectFeedbackSQL, new Object[]{userEmail,fromDateSql,toDateSql,rating}, new FeedbackRowMapper());
		}
		
		else if(fromDate.equals("") && !toDate.equals("") && !anonymous.equals("") && !rating.equals("")){
			System.out.println("to date, anonymous and rating selected");
			String selectFeedbackSQL = "select * from feedback where feedbackReceiver = ? and feedbackDate <= ?  and anonymous= ? and rating = ?";
			list = jdbcTemplate.query(selectFeedbackSQL, new Object[]{userEmail,toDateSql,anonymous,rating}, new FeedbackRowMapper());
		}
		else if(!fromDate.equals("") && toDate.equals("") && !anonymous.equals("") && !rating.equals("")){
			System.out.println("from date, anonymous and rating selected");
			String selectFeedbackSQL = "select * from feedback where feedbackReceiver = ? and feedbackDate >= ?  and anonymous= ? and rating = ?";
			list = jdbcTemplate.query(selectFeedbackSQL, new Object[]{userEmail,fromDateSql,anonymous,rating}, new FeedbackRowMapper());
		}
		else{
			System.out.println("all selected");
			String selectFeedbackSQL = "select * from feedback where feedbackReceiver = ? and feedbackDate >= ?  and feedbackDate <= ? and anonymous= ? and rating = ?";
			list = jdbcTemplate.query(selectFeedbackSQL, new Object[]{userEmail,fromDateSql,toDateSql,anonymous,rating}, new FeedbackRowMapper());
		}
		
		System.out.println("Results from db size: "+list.size());
		request.setAttribute("myFeedback", list);
		RequestDispatcher view = request.getRequestDispatcher("/feedFilter.jsp");
        view.forward(request, response);
		/*for(int i=0;i<list.size();i++){
		System.out.println(list.get(0)+":"+list.get(1)+":"+list.get(2)+":"+list.get(3)+":"+list.get(4));
		
		request.setAttribute("list", list);
        RequestDispatcher view = request.getRequestDispatcher("feedFilter.jsp");
          view.forward(request, response);
		
		}*/
	}
	
}
