<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%
     String userEmail = (String)session.getAttribute("userEmail");
    if (userEmail == null || userEmail == "") {
%>
You are not logged in<br/>
<a href="login.jsp">Please Login</a>
<%} else {
%>
<html><p style="color:#FFF;">Welcome <%=(String)session.getAttribute("userName")%>
<%String userName=(String)session.getAttribute("userName");%>
</p>

<a class="round medium green button"  href='feednext.jsp'>Home</a>
<a class="round medium green button "style="margin-left:1220; margin-top:-53"  href='login.jsp'>Log out</a>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/buttons.css">
<style>
body
{background: url(./css/bg.jpg) no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;

}
.center{
text-align:center;
}

</style>
</head>
<body>

    
<br/>
<br/>
<br/>

   <div class="center">
       <form  name="ViewFeed" action="viewFeed.jsp" method="GET" >
       <input class="styled-button-green" type="submit"  value="View Feedback">

</form>
<br/>
<br/>
<form name="GiveFeed" action="giveFeed.jsp" method="GET" >
    <input class="styled-button-green" type="submit" value="Give Feedback">
 
</form>

<br/>
<br/>

</div>
</body>
<%
    } 
%>
</html>