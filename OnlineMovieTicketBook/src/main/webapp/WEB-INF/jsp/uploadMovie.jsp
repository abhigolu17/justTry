<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link href="css/homePage.css" rel="stylesheet"></link>
<title>Insert title here</title>
</head>
<body class="container_style">

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Upload Movie</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="adminHome">Home</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>${admin.email}</a></li>
				<li><a href="home"><span class="glyphicon glyphicon-log-in"></span>
						Logout</a></li>
			</ul>
		</div>
	</nav>

	<div class="container" style="margin-top: 30px">
		<div class="col-md-10 col-md-offset-1">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">
						<strong>Upload Movie </strong>
					</h3>
				</div>

				<div class="panel-body">
					<form role="form" action="addMovie" method="post">
						<div class="form-group">
							<input type="text" name="movieID" id="movieID"
								class="form-control " placeholder="Enter Movie ID" tabindex="3" required="required" value="">
						</div>
						<div class="form-group">
							<input type="text" name="movieName" id="movieName"
								class="form-control " placeholder="Enter Movie Name"
								tabindex="3" required="required" value="">
						</div>

						<div class="row">
							<div class="col-xs-12 col-sm-4 col-md-4">
								<div class="form-group">
									<input type="text" name="movieTicket" id="movieTicket" class="form-control"
										placeholder="Enter Movie Ticket Price" tabindex="1" required="required" value="">
								</div>
							</div>					
							<div class="col-xs-12 col-sm-4 col-md-4">
								<div class="form-group">
									<select name="type" class="form-control">
										<option value="movieType">Action</option>
										<option value="movieType">Comedy</option>
										<option value="movieType">Adventure</option>
										<option value="movieType">Dramas</option>
										<option value="movieType">Biography</option>
										<option value="movieType">Crime</option>
										<option value="movieType">Horror</option>
										<option value="movieType">Fantasy</option>
										<option value="movieType">Science Fiction</option>
										<option value="movieType">Romance</option>
									</select>
								</div>
							</div>
							<div class="col-xs-12 col-sm-4 col-md-4">
								<div class="form-group">
									<input type="text" name="totalSeat" id="totalSeat" class="form-control"
										placeholder="Enter Total Ticket Seat" tabindex="1" required="required" value="">
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-xs-12 col-sm-4 col-md-4">
								<div class="form-group">
									<input type="date" name="date" id="date" class="form-control "
										placeholder="Movie Ticket" tabindex="2" required="required" value="">
								</div>
							</div>
							<div class="col-xs-12 col-sm-4 col-md-4">
								<div class="form-group">
									<input type="time" name="time" id="time" class="form-control"
										placeholder="Time" tabindex="1" required="required" value="">
								</div>
							</div>
							<div class="col-xs-12 col-sm-4 col-md-4">
								<div class="form-group">
									<input type="file" name="image" id="image" class="form-control"
										placeholder="Enter Image" tabindex="1" required="required" value="">
								</div>
							</div>
						</div>
						<hr style="margin-top: 10px; margin-bottom: 10px;">
						<button type="submit" class="btn btn-success">Upload Now</button>
					</form>

				</div>
			</div>
		</div>
	</div>
</body>
</html>