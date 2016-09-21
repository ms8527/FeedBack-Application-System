<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="feedback">
		<form name="giveFeedback" method="post" action="GiveFeedbackServlet">
			<div style="text-align: center"></div>


			<h2>Feedback</h2>
			<label for="first_name">Receiver Email <span>*</span></label> <input
				type="email" id="ema" name="email" maxlength="50" size="30"><span
				id="em" style="color: red"></span> <label for="first_name">Anonymous<span>
					*</span> <input type="radio" name="Anonymous" value="Yes">Yes <input
				type="radio" name="Anonymous" value="No">No
			</label> <label for="comments">Comments <span>*</span> <textarea
					id="comment" name="comments" maxlength="1000" cols="25" rows="6"></textarea><span
				id="cmnt" style="color: red"></span>

				<div class="stars">
					<form>
						<label for="rating">Rating <input class="star star-5"
							id="star-5" type="radio" name="star" /> <label
							class="star star-5" for="star-5"></label>
							 <input class="star star-4" id="star-4" type="radio" name="star" /> <label
							class="star star-4" for="star-4"></label> <input
							class="star star-3" id="star-3" type="radio" name="star" /> <label
							class="star star-3" for="star-3"></label> <input
							class="star star-2" id="star-2" type="radio" name="star" /> <label
							class="star star-2" for="star-2"></label> <input
							class="star star-1" id="star-1" type="radio" name="star" /> <label
							class="star star-1" for="star-1"></label>
						</label>
					</form>
				</div> <input class="btn" type="submit" value="Submit" name="submit">
				<div style="clear: both"></div>
		</form>
	</div>

</body>
</html>