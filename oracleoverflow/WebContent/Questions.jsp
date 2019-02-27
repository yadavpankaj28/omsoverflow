<!DOCTYPE html>
<html>
<head>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Question</title>
</head>
<body>
	<nav class="navbar navbar-light bg-light">
		<div class="d-flex justify-content-left">
			<a class="navbar-brand" href="#"> <img src="download.png"
				width="80" height="40" class="d-inline-block align-top" alt="">
			</a>
		</div>
		<div class="d-flex justify-content-center">
			<a class="nav-item" href="#">OMSOverflow</a>
		</div>

		<div class="d-flex justify-content-right">
			<a class="nav-link" href="#">Home</a> <a class="nav-link" href="#">Logout</a>
		</div>
	</nav>
	<div id="loginbox"  class="mainbox col-md-12 " align="center">
 <div class="container">
 	<div class="col-sm-6">
	<form action="HomePage.jsp" method="post">
		<div class="form-group">
			<label for="question">Write your Question</label>
			<textarea class="form-control" id="question" rows="10" placeholder="Please write"></textarea>
		</div>
		<div class="form-group">
			<label for="category">Category</label> <select class="form-control"
				id="category">
				<option>WebLogic</option>
				<option>OMS Legacy</option>
				<option>OJET</option>
				<option>Jenkins</option>
				<option>Git</option>
				<option>BI Publisher</option>
				<option>Others</option>
			</select>
		</div>
	<button type="submit" class="btn btn-primary mb-2 " >Submit</button>
	</form>
	</div>
</div>	
</div>
</body>
</html>