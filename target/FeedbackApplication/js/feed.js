function valid() {
		var name = document.getElementById("nam").value;
		if(name == ''){
			$("#name").html("Name must be filled out");
			return false;
		}
		
		var email = document.getElementById("ema").value;
		if(email == ''){
			$("#em").html("Email must be filled out");
			return false;
		}
		
		var filter=/^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i
		if (!filter.test(email)){
			$("#em").html("Please enter valid email address");
			return false;
		}
		
		var title = document.getElementById("title").value;
		if(title == ''){
			$("#ttl").html("Title Name must be filled out");
			return false;
		}
		
		var comment = document.getElementById("comment").value;
		if(comment == ''){
			$("#cmnt").html("Comment box must be filled out");
			return false;
		}
		
	}
	function na(){
		$("#name").html("");
		return false;
	}
	
	function emas(){
		$("#em").html("");
		return false;
	}
	function titles(){
		$("#ttl").html("");
		return false;
	}
	function cmnts(){
		$("#cmnt").html("");
		return false;
	}