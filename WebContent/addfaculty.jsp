<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Alumni Records</title>
    <link rel="stylesheet" href="./style/addfaculty.css"> 
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
  </head>
	<body>
		<div class="jumbotron text-center" id="jumbo">
	      <div class="container">
	   		<div class ="row"> 
		   		<div class ="col-lg-2 " > <img src="./images/uor.png" alt="UOR" width="150" height="110" >
		   		</div> 
		   		<div class="col-lg-8 " >  <h1 >Center For Converging Technologies</h1>
		   		<h3> &nbsp University of Rajasthan, Jaipur</h3>
		   		<h4>  &nbsp Information Management and E- Billing </h4>	   		
		   		</div> 
		   		<div class ="col-lg-2 " > <img src="./images/cct.png" alt="CCT" width="150" height="110" >
		   		</div>  		  
	   		</div>
	   		
	     </div>
	  
	  
      </div>
      
      <div class = "container-fluid">
      		<div class="bg-dark text-white">
      		<nav class="nav nav-pills flex-column flex-sm-row">
			  <a class="flex-sm-fill text-sm-center nav-link text-white " href="home.jsp">Home</a> 
			  <a class="flex-sm-fill text-sm-center nav-link text-white " href="alumni.jsp">Alumni</a> 
			  <a class="flex-sm-fill text-sm-center nav-link text-white" href="student.jsp">Students</a>
			  <a class="flex-sm-fill text-sm-center nav-link text-white active" href="addfaculty.jsp">Faculty</a>
			  <a class="flex-sm-fill text-sm-center nav-link text-white" href="ebill.jsp">Guest Faculty E-Bill</a>
			</nav>
			</div>
      
      </div>
      
      
      	<div class="container-fluid">
		<div class="row" id="row2">
			<div class="col-lg-3">
			</div>
			<div class="col-lg-6">
			<!-- change the methods here -->
				<form action="./facultyregister" method="post">

					<div class="form-group">
						<div
							class="border border-info alert  text-center text-white mt-2 pb-0 pt-0" style="background-color:MediumSeaGreen;" role="alert">
							<p style="font-size:20px;">Add New Faculty</p>
						</div>
					</div>
					
					<div class="form-group ">
						<label for="exampleInputEmail11">Title </label> <input type="text"
							name="title" class="form-control" id="exampleInputEmail11"
							aria-describedby="emailHelp" placeholder="Mr. / Mrs. / Dr. / Prof. " />
					</div>
					
					<div class="form-group ">
						<label for="exampleInputEmail12"> Name of Faculty </label> <input type="text"
							name="facultyName" class="form-control" id="exampleInputEmail12"
							aria-describedby="emailHelp" placeholder="FacultyName" />
					</div>
					<div class="form-group ">
						<label for="exampleInputEmail1">Employee Code </label> <input type="text"
							name="employeeCode" class="form-control" id="exampleInputEmail1"
							aria-describedby="emailHelp" placeholder="" />
					</div>
					
						<div class="form-group ">
						<label for="exampleInputEmail13">Subject </label> <input type="text"
							name="subject" class="form-control" id="exampleInputEmail13"
							aria-describedby="emailHelp" placeholder="Subject" />
						</div>

					
					
					<div class="form-group ">
						<label for="exampleInputEmail14">Official Address</label> <input type="text"
							name="officialAddress" class="form-control" id="exampleInputEmail14"
							aria-describedby="emailHelp" placeholder="Official Address" />
					</div>
					<div class="form-group ">
						<label for="exampleInputEmail15">Home Address</label> <input type="text"
							name="homeAddress" class="form-control" id="exampleInputEmail15"
							aria-describedby="emailHelp" placeholder="Home Address" />
					</div>

					<div class="form-group ">
						<label for="exampleInputEmail16">Phone </label> <input type="number"
							name="phone" class="form-control" id="exampleInputEmail16"
							aria-describedby="emailHelp" placeholder="Landline" />
					</div>

					<div class="form-group ">
						<label for="exampleInputEmail17">PAN Card Number </label> <input type="text"
							name="pancard" class="form-control" id="exampleInputEmail17"
							aria-describedby="emailHelp" placeholder="AY*******E" />
					</div>

					<div class="form-group">
						<label for="email1">Mobile Number</label> <input type="number"
							class="form-control" id="email1" name="mobile" placeholder="Mobile">
					</div>
					
					<div class="form-group ">
						<label for="exampleInputEmail18">Bank Name </label> <input type="text"
							name="bankName" class="form-control" id="exampleInputEmail18"
							aria-describedby="emailHelp" placeholder="Bank" />
					</div>
					
					<div class="form-group ">
						<label for="exampleInputEmail19">Branch Name </label> <input type="text"
							name="branchName" class="form-control" id="exampleInputEmail19"
							aria-describedby="emailHelp" placeholder="Name" />
					</div>
					
					<div class="form-group">
						<label for="contact1">IFSC</label> <input type="text"
							class="form-control" id="contact1" name="ifsc">
					</div>
					

					<div class="form-group">
						<label for="contact1">Account No.</label> <input type="number"
							class="form-control" id="contact1" name="account">
					</div>
					
					<div class="form-group ">
						<label for="exampleInputEmail20">Designation</label> <input type="text"
							name="designation" class="form-control" id="exampleInputEmail20"
							aria-describedby="emailHelp" placeholder="Director/ Assistant Director" />
					</div>
					
					<div class="form-group ">
						<label class="mb-0" for="industry1">Type</label>
					</div>
					<div class="form-group">
						<select
							class=" form-control border border-primary p-2 mb-3 mt-0 bg-white rounded"
							name="facultyType">
							<option selected>Choose</option>
							<option value="cctFaculty">CCT Faculty</option>
							<option value="guestFaculty">Guest Faculty</option>
						</select>
					</div>
					
					
					<button type="submit" class="btn btn-primary btn-block" style="background-color:#1d1d1d;"
						id="submitbutton">Save</button>

				</form>
			</div>

			<!-- In the case of the Faculty is not added  -->
			<c:if test="${facultyStatus.equals('false')}">
				<script type="text/javascript">
					alert("Faculty record cannot be added");
				</script>
			</c:if>
			
			<!-- In the case of the Faculty is added  -->
			<c:if test="${facultyStatus.equals('true')}">
				<script type="text/javascript">
					alert("Faculty added successfully");
				</script>
			</c:if>

			<div class="col-lg-3">
				
			</div>

		</div>

	</div>
      
      <!-- Footer -->     
      <div class = "container-fluid">
		  <div class ="row">
			  <div class ="col-lg-12" >
			  		<div class="card text-center" id="wholefooter"  >
						  <div class="card-header" id="footerhead" >
						    Developed by "Vishal Joshi" and maintained by "Infonet Center"
						  </div>
						  
						    <div class="footer-copyright text-center py-3" id="totalfooter" >© 2018 Copyright:
						    <a target="_blank" href="http://www.uniraj.ac.in/cct/"> Uniraj.ac.in</a>
						    </div>
						  
						</div>
			  </div>
		  </div>
  
  </div>
      
      
	</body>
</html>
  