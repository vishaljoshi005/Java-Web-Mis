<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Student</title>
<link rel="stylesheet" href="./style/student.css">
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

	<div class="container-fluid">
		<div class="bg-dark text-white">
			<nav class="nav nav-pills flex-column flex-sm-row">
				<a class="flex-sm-fill text-sm-center nav-link text-white "
					href="home.jsp">Home</a> <a
					class="flex-sm-fill text-sm-center nav-link text-white"
					href="alumni.jsp">Alumni</a> <a
					class="flex-sm-fill text-sm-center nav-link text-white active"
					href="student.jsp">Students</a> <a
					class="flex-sm-fill text-sm-center nav-link text-white" href="addfaculty.jsp">Faculty</a>
					<a class="flex-sm-fill text-sm-center nav-link text-white " href="fee.jsp">Fee</a>
				<a class="flex-sm-fill text-sm-center nav-link text-white"
					href="./ebill">Guest Faculty E-Bill</a>
					<a class="flex-sm-fill text-sm-center nav-link text-white" href="index.jsp">Logout</a>
			</nav>
		</div>

	</div>

	<div class="container-fluid">
		<div class="row" id="row2">
			<div class="col-lg-6">
				<form action="./studentregister" method="post">

					<div class="form-group">
						<div
							class="alert shadow rounded text-dark text-center mt-1 pb-0" style="background-color:#F0E68C;" role="alert">
							<p style="font-size:20px;">Add New Student</p>
						</div>
					</div>

					<div class="form-group ">
						<label for="exampleInputEmail1">First Name </label> <input type="text"
							name="firstName" class="form-control" id="exampleInputEmail1"
							aria-describedby="emailHelp" placeholder="Name" />
					</div>
					<div class="form-group ">
						<label for="exampleInputEmail1">Last Name </label> <input type="text"
							name="lastName" class="form-control" id="exampleInputEmail1"
							aria-describedby="emailHelp" placeholder="Name" />
					</div>
					
					<div class="form-group">
						<label for="option1">Gender</label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<div class="form-check form-check-inline">
							<input class="form-check-input " type="radio" name="gender"
								id="inlineRadio1" value="male"> <label
								class="form-check-label" for="inlineRadio1">Male</label>
						</div>
						&nbsp;&nbsp;&nbsp;
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="radio" name="gender"
								id="inlineRadio2" value="female"> <label
								class="form-check-label" for="inlineRadio2">Female</label>
						</div>

					</div>
					<div class="clearfix"></div>
					
					<div class="form-group ">
						<label for="exampleInputEmail1">Father's Name </label> <input type="text"
							name="fatherName" class="form-control" id="exampleInputEmail1"
							aria-describedby="emailHelp" placeholder="Name" />
					</div>
					<div class="form-group ">
						<label for="exampleInputEmail1">Mother's Name </label> <input type="text"
							name="motherName" class="form-control" id="exampleInputEmail1"
							aria-describedby="emailHelp" placeholder="Name" />
					</div>


					</div>
					
					<div class="col-lg-6">



					<br><br><br>
					<div class="form-group mt-2 ">
						<label for="datepicker1">Date Of Birth</label>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input
							class=" form-control border border-primary bg-white rounded"
							type="date" name="dob" id="datepicker1">
						<!-- pl-5 pr-5 mb-3 mt-0 -->
					</div>

					<div class="form-group">
						<label for="batch1">Admission Year</label> <input type="number"
							class="form-control" min="2006" name="admissionYear" id="batch1"
							placeholder="Year">
					</div>

					<div class="form-group">
						<label for="email1">Email</label> <input type="email"
							class="form-control" id="email1" name="email" placeholder="Email"
							pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$">
					</div>

					<div class="form-group">
						<label for="contact1">Contact</label> <input type="number"
							class="form-control" id="contact1" name="contact"
							placeholder="Mobile">
					</div>
					
					<div class="form-group">
						<label for="address1">Address</label> <input type="text"
							class="form-control" id="address1" name="address"
							placeholder="Address with Pincode">
					</div>
					
					<button type="submit" class="btn btn-primary mr-5"
						id="submitbutton">Save</button>
						
					<button type="reset" id="submitbutton" class="btn btn-secondary ml-5 ">Cancel</button>

				</form>
				
				<a href="./viewstudent?page=1" target="_blank" class="btn btn-dark text-white mt-3 " style="width:650px;" id="viewalumnibutton" style="background-color:#FF7F50; font-size:18px;"  role="button" aria-pressed="true">
				View All Students Records</a>
			</div>

			<!-- In the case of the Adding alumni successful -->
			<c:if test="${studentStatus.equals('true')}">
				<script type="text/javascript">
					alert("Student added successfully");
				</script>
			</c:if>

			<!-- In the case of the first name is empty  -->
			<c:if test="${firstNameEmpty.equals('true')}">
				<script type="text/javascript">
					alert("FirstName field cannot be empty");
				</script>
			</c:if>
			
			<!-- In the case of the lastname is empty  -->
			<c:if test="${lastNameEmpty.equals('true')}">
				<script type="text/javascript">
					alert("LastName field cannot be empty");
				</script>
			</c:if>
			
			<!-- In the case of the gender is empty  -->
			<c:if test="${genderEmpty.equals('true')}">
				<script type="text/javascript">
					alert("Gender field cannot be empty");
				</script>
			</c:if>
			<!-- In the case of the father name is empty  -->
			<c:if test="${fatherNameEmpty.equals('true')}">
				<script type="text/javascript">
					alert("Father's name field cannot be empty");
				</script>
			</c:if>
			<!-- In the case of the mother name is empty  -->
			<c:if test="${motherNameEmpty.equals('true')}">
				<script type="text/javascript">
					alert("MotherName field cannot be empty");
				</script>
			</c:if>
			
			<!-- In the case of the dob is empty  -->
			<c:if test="${dobEmpty.equals('true')}">
				<script type="text/javascript">
					alert("Date of birth field cannot be empty");
				</script>
			</c:if>
			<!-- In the case of the Admission is empty  -->
			<c:if test="${admissionYearEmpty.equals('true')}">
				<script type="text/javascript">
					alert("Admission Year field cannot be empty");
				</script>
			</c:if>
			<!-- In the case of the email is empty  -->
			<c:if test="${emailEmpty.equals('true')}">
				<script type="text/javascript">
					alert("Email field cannot be empty");
				</script>
			</c:if>
			<!-- In the case of the contact is empty  -->
			<c:if test="${contactEmpty.equals('true')}">
				<script type="text/javascript">
					alert("Contact field cannot be empty");
				</script>
			</c:if>
			<!-- In the case of the adddress is empty  -->
			<c:if test="${addressEmpty.equals('true')}">
				<script type="text/javascript">
					alert("Address field cannot be empty");
				</script>
			</c:if>
			<!-- In the case of the location is empty  -->
			<c:if test="${studentStatus.equals('false')}">
				<script type="text/javascript">
					alert("Student record cannot be added");
				</script>
			</c:if>

		</div>

	</div>
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-12">
				<div class="card text-center" id="wholefooter">
					<div class="card-header" id="footerhead">Developed by Vishal Joshi, CCT, University Of Rajasthan
					</div>

					<div class="footer-copyright text-center py-3" id="totalfooter">
						© 2018 Copyright: <a target="_blank" href="http://www.uniraj.ac.in/cct/">
							Uniraj.ac.in</a>
					</div>

				</div>
			</div>
		</div>

	</div>


</body>
</html>
