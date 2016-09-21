 <%@ page import="org.springframework.jdbc.core.JdbcTemplate" %>
 <%@ page import="com.feedbackApplication.database.DatabaseService" %>
 <%@ page import="com.feedbackApplication.database.Sample" %>
 
 <%
 JdbcTemplate jdbcTemplate = DatabaseService.getJdbcTemplate();
 
 Sample sample = new Sample();
	
 	//int count = 0;
 	
 %>
<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
    <title>Sign Up</title>
            <link rel="stylesheet" href="css/style.css">  
  </head>
  <style>
body {
	background: url(./css/bg.jpg) no-repeat center center fixed;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover;
}
</style>
  <body>

 <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,700" rel="stylesheet" type="text/css">

  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
   <div id="logmsk" style="display: block;">
    <div id='close'>X</div>
    	<form class="form" name="user" action="SignUpServlet" method="post" >
    <div id="userboxsignup">
        <h1 id="signup" style="background-color: rgb(118, 171, 219); background-position: initial initial; background-repeat: initial initial;">Sign up</h1>
        <div id="sumsk" style="display: none;">Sending</div>
        <input id="email" type="email" name="email" placeholder="email" style="opacity: 1; background-color: rgb(255, 255, 255); background-position: initial initial; background-repeat: initial initial;">
        <input id="pass" type="password" name="password" placeholder="Password" style="opacity: 1; background-color: rgb(255, 255, 255); background-position: initial initial; background-repeat: initial initial;">
        <input id="name" type="text" name="name"  placeholder="name" style="opacity: 1; background-color: rgb(255, 255, 255); background-position: initial initial; background-repeat: initial initial;">
        <input id="DOB" type="date" name="DOB" placeholder="DOB" style="opacity: 1; background-color: rgb(255, 255, 255); background-position: initial initial; background-repeat: initial initial;">
        <input id="phonenumber" type="tel" name="phone" placeholder="phone" style="opacity: 1; background-color: rgb(255, 255, 255); background-position: initial initial; background-repeat: initial initial;">
        <p  id="logint" style="opacity: 1;"><a href="login.jsp">Login as an existing user</a></p>
        
        <button id="signupb" style="opacity: 1; cursor: default;">Sign up</button>
    </div>
    </form>
</div>
    
        <script src="js/index.js"></script>

    
    
    
  </body>
</html>
