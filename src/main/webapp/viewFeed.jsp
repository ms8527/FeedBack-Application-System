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
<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
    <title>FeedBack</title>
            <link rel="stylesheet" href="css/style.css"> 
            <link rel="stylesheet" href="./css/buttons.css"> 
  </head>

  <body>

 <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,700" rel="stylesheet" type="text/css">
 <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">

  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
  
   
    	<title>FeedBack Filters</title>
    	<div class="feedback">
			<form name="ViewFeeds" method="post" action="ViewFeedbackServlet">
			<div style="text-align:center"></div>
					
		
			<h2>FeedBack Filters</h2>
			
			<label for="first_name">Date<span> *</span></label>
			
			<label for="first_name">From</label> <input type="date" name="dateFrom" placeholder="From">
			
			<label for="first_name">To</label><input type="date" name="dateTo" placeholder="to" >
		     <br>
			
			<label for="first_name">Anonymous<span> *</span>
					<input  type="radio"  name="Anonymous"  value="Yes">Yes
					<input  type="radio"  name="Anonymous"  value="No">No
		    </label>
			
			 <label for="rating">Rating <span> *</span>
			 <input type="number" name="rating" min="0" max="5">
			 </label>
			   
			
			
			<input class="btn" type="submit" value="Submit" name="submit">   
			<div style="clear:both"></div>
		</form>
	</div>

    
     <!--    <script src="js/index.js"></script> -->

    <style>
body {
	background: url(./css/bg.jpg) no-repeat center center fixed;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover;
}

* {
	margin: 0;
	padding: 0;
}

.feedback {
	width: 500px;
	background: #C2E8F7;
	padding: 10px;
	margin: 20px auto;
}

.feedback form {
	background: #fff;
	border-radius: 5px;
	padding: 10px;
}

.feedback label {
	display: block;
	padding: 5px 0;
	color: #00546a;
}

#ema {
	border: 1px solid #ccc;
	padding: 5px;
	width: 99%;
	font-size: 14px;
	margin: 5px 0;
}

.feedback textarea {
	border: 1px solid #ccc;
	padding: 5px;
	width: 99%;
	font-size: 14px;
	margin: 5px 0;
}

.feedback form h2 {
	color: hsl(191, 88%, 26%);
	margin-bottom: 13px;
	padding: 6px 0 20px 0;
	position: relative;
	text-align: center;
}

.feedback form h2::after {
	background: #ffffff; /* Old browsers */
	background: -moz-linear-gradient(left, #ffffff 0%, #08687e 50%, #ffffff 100%);
	/* FF3.6+ */
	background: -webkit-gradient(linear, left top, right top, color-stop(0%, #ffffff),
		color-stop(50%, #08687e), color-stop(100%, #ffffff));
	/* Chrome,Safari4+ */
	background: -webkit-linear-gradient(left, #ffffff 0%, #08687e 50%, #ffffff 100%);
	/* Chrome10+,Safari5.1+ */
	background: -o-linear-gradient(left, #ffffff 0%, #08687e 50%, #ffffff 100%);
	/* Opera 11.10+ */
	background: -ms-linear-gradient(left, #ffffff 0%, #08687e 50%, #ffffff 100%);
	/* IE10+ */
	background: linear-gradient(to right, #ffffff 0%, #08687e 50%, #ffffff 100%);
	/* W3C */
	filter: progid:DXImageTransform.Microsoft.gradient(  startColorstr='#ffffff',
		endColorstr='#ffffff', GradientType=1); /* IE6-9 */
	bottom: -3px;
	content: ".";
	display: block;
	font-size: 0;
	height: 1px;
	position: absolute;
	width: 100%;
	z-index: 2147483647;
}

.feedback .btn {
	background: hsl(191, 49%, 47%);
	border: 4px solid hsl(0, 0%, 100%);
	box-shadow: 0 2px 5px hsl(0, 0%, 80%);
	-webkit-box-shadow: 0 2px 5px hsl(0, 0%, 80%);
	color: hsl(0, 0%, 100%);
	float: right;
	font-weight: bold;
	padding: 10px;
	-webkit-appearance: none;
	width: auto;
}
/* 	input{ */
/* 		 -webkit-appearance: none; */
/* 		 -webkit-border-radius:0; */
/* 	} */
@media ( max-width :500px) {
	.feedback {
		width: 90%;
	}
}

div.stars {
	width: 270px;
	display: inline-block;
}

input.star {
	display: none;
}

label.star {
	float: right;
	padding: 2px;
	font-size: 26px;
	color: #444;
	transition: all .2s;
}

input.star:checked ~ label.star:before {
	content: '\f005';
	color: #FD4;
	transition: all .25s;
}

input.star-5:checked ~ label.star:before {
	color: #FE7;
	text-shadow: 0 0 20px #952;
}

input.star-1:checked ~ label.star:before {
	color: #F62;
}

label.star:hover {
	transform: rotate(-15deg) scale(1.3);
}

label.star:before {
	content: '\f006';
	font-family: FontAwesome;
}
</style>
    
    
  </body>
  <%
    } 
%>
</html>
