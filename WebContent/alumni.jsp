<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Alumni</title>
<link rel="stylesheet" href="./style/alumni.css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous">
	
</script>
</head>
<body>
	<div class="jumbotron text-center" id="jumbo">
		<div class="container">
			<div class="row">
				<div class="col-lg-2 ">
					<img src="./images/uor.png" alt="UOR" width="150" height="110">
				</div>
				<div class="col-lg-8 ">
					<h1>Center For Converging Technologies</h1>
					<h3>&nbsp University of Rajasthan, Jaipur</h3>
					<h4>&nbsp Information Management and E- Billing</h4>
				</div>
				<div class="col-lg-2 ">
					<img src="./images/cct.png" alt="CCT" width="150" height="110">
				</div>
			</div>

		</div>


	</div>

	<div class="container">
		<div class="bg-dark text-white">
			<nav class="nav nav-pills flex-column flex-sm-row">
				<a class="flex-sm-fill text-sm-center nav-link text-white active"
					href="#">Home</a> <a
					class="flex-sm-fill text-sm-center nav-link text-white" href="#">Alumni</a>
				<a class="flex-sm-fill text-sm-center nav-link text-white" href="#">Students</a>
				<a class="flex-sm-fill text-sm-center nav-link text-white" href="#">Faculty</a>
				<a class="flex-sm-fill text-sm-center nav-link text-white" href="#">Guest
					Faculty E-Bill</a>
			</nav>
		</div>

	</div>

	<div class="container">
		<div class="row" id="row2">
			<div class="col-lg-6">
				<form action="./addalumni" method="post">

					<div class="form-group ">
						<button type="button" id="newuser"
							class="btn btn-secondary btn-lg btn-block ">
							<b>Add New Alumni</b>
						</button>
						<br> <label for="exampleInputEmail1"> Name </label> <input
							type="text" name="name" class="form-control"
							id="exampleInputEmail1" aria-describedby="emailHelp"
							placeholder="Name" />
					</div>

					<div class="form-group">
						<label for="option1">Gender</label> <select class="form-control"
							name="gender" id="option1">
							<option value="male">Male</option>
							<option value="female">Female</option>
						</select>
					</div>

					<div class="form-group">
						<label for="datepicker1">Date Of Birth</label> <input type="date"
							name="dob" id="datepicker1">
					</div>

					<div class="form-group">
						<label for="batch1">Batch</label> <input type="number"
							class="form-control" min="2006" name="batch" id="batch1" placeholder="Year">
					</div>

					<div class="form-group">
						<label for="email1">Email</label> <input type="email"
							class="form-control"  id="email1" name="email" placeholder="Email"
							pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$">
					</div>
					
					<div class="form-group">
						<label for="contact1">Contact</label> <input type="number"
							class="form-control"  id="contact1" name="contact" placeholder="Mobile"
							>
					</div>
					
					<div class="form-group">
						<label for="industry1">Industry</label> <input type="text"
							class="form-control"  id="industry1" name="industry" placeholder="IT"
							>
					</div>
					
					<div class="form-group">
						<label for="occupation1">Current Occupation</label> <input type="text"
							class="form-control"  id="occupation1" name="occupation" placeholder="Job/Self-employed"
							>
					</div>
					
					<div class="form-group">
						<label for="location1">Current Location</label> <input type="text"
							class="form-control"  id="location1" name="location" placeholder="City"
							>
					</div>
					


					<button type="submit" class="btn btn-primary btn-block"
						id="submitbutton">Save</button>

				</form>
			</div>


			<div class="col-lg-6"></div>
		</div>
		
	</div>
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="card text-center" id="wholefooter">
					<div class="card-header" id="footerhead">Developed by "Vishal
						Joshi" and maintained by "Infonet Center"</div>

					<div class="footer-copyright text-center py-3" id="totalfooter">
						© 2018 Copyright: <a href="http://www.uniraj.ac.in/cct/">
							Uniraj.ac.in</a>
					</div>

				</div>
			</div>
		</div>

	</div>


</body>
</html>
