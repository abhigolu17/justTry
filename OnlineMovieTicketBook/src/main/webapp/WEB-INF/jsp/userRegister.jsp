<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<link href="css/stdReg.css" rel="stylesheet" ></link> 
<meta charset="ISO-8859-1">
<title>User Register</title>
</head>
<body class="container_style">


	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Online Movie Ticket Book</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="#">Page 2</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="adminRegister"><span
						class="glyphicon glyphicon-user"></span> Admin</a></li>
				<li><a href="userRegister"><span
						class="glyphicon glyphicon-log-in"></span> Users</a></li>
			</ul>
		</div>
	</nav>

<table align="center">
                <tr>
                    <td style="font-style: italic; color: red;">${message}</td>
                </tr>
            </table>


<div class="container">
        <div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-6">
								<a href="#" class="active" id="login-form-link">Login</a>
							</div>
							<div class="col-xs-6">
								<a href="#" id="register-form-link">Register</a>
							</div>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form id="login-form" action="loginUser" method="post" role="form" style="display: block;">
									<div class="form-group">
										<input type="text" name="_id" id="_id" required="required" tabindex="1" class="form-control" placeholder="User ID" value="">
									</div>
									<div class="form-group">
										<input type="password" name="password" required="required" id="password" tabindex="1" class="form-control" placeholder="Password">
									</div>
									<div class="form-group text-center">
										<input type="checkbox" tabindex="3" class="" name="remember" id="remember">
										<label for="remember"> Remember Me</label>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Log In">
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<div class="text-center">
													<a href="http://phpoll.com/recover" tabindex="5" class="forgot-password">Forgot Password?</a>
												</div>
											</div>
										</div>
									</div>
								</form>
								<form id="register-form" action="addUser" method="post" role="form" style="display: none;">
									<div class="form-group">
										<input type="text" name="userID" id="userID" tabindex="1" class="form-control" placeholder="User ID" value="" required="required">
									</div>  
									<div class="form-group">
										<input type="text" name="fName" id="fName" placeholder="First Name" required="required" value="" size="27">
										<input type="text" name="lName" id="lName" placeholder="Last Name" value="" size="27" >
									</div>
									<div class="form-group">
										<input type="email" name="email" id="email" tabindex="3" class="form-control" placeholder="Email Address" required="required" value="">
									</div>
								
									<div class="form-group">
										<input type="password" name="password" id="password" tabindex="1" class="form-control" placeholder="Password" value="" required="required">
									</div>
									<div class="form-group">
										<input type="text" name="address" id="address" tabindex="5" class="form-control" placeholder="Address" value="" required="required">
									</div>
									<div class="form-group">	
										<input type="text" name="phone" id="phone" tabindex="4" class="form-control" placeholder="Phone Number" value="" required="required">
										<input type="radio" tabindex="1" id="gender"  name="gender" value="male"> Male
										<input type="radio" tabindex="1" id="gender" name="gender" value="female"> Female
										<input type="radio" tabindex="1" id="gender" name="gender" value="other"> Other
									</div>
									<div class="form-group">
									</div>

									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register" value="Register Now">
											</div>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	
	<script type="text/javascript">
	$(function() {

	    $('#login-form-link').click(function(e) {
	    	$("#login-form").delay(100).fadeIn(100);
	 		$("#register-form").fadeOut(100);
			$('#register-form-link').removeClass('active');
			$(this).addClass('active');
			e.preventDefault();
		});
		$('#register-form-link').click(function(e) {
			$("#register-form").delay(100).fadeIn(100);
	 		$("#login-form").fadeOut(100);
			$('#login-form-link').removeClass('active');
			$(this).addClass('active');
			e.preventDefault();
		});

	});
	</script>
</body>
</html>