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
    <title>Fee</title>
    <link rel="stylesheet" href="./style/fee.css"> 
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
			  <a class="flex-sm-fill text-sm-center nav-link text-white" href="alumni.jsp">Alumni</a> 
			  <a class="flex-sm-fill text-sm-center nav-link text-white" href="student.jsp">Students</a>
			  <a class="flex-sm-fill text-sm-center nav-link text-white" href="addfaculty.jsp">Faculty</a>
			  <a class="flex-sm-fill text-sm-center nav-link text-white active " href="fee.jsp">Fee</a>
			  <a class="flex-sm-fill text-sm-center nav-link text-white" href="./ebill">Guest Faculty E-Bill</a>
			  <a class="flex-sm-fill text-sm-center nav-link text-white" href="index.jsp">Logout</a>
			</nav>
			</div>
      
      </div>
      
      
      <div class="container-fluid">
			<div class="row" id="row2">
				
				
					<div class="col-lg-5">
					
						<form action="./addfee" method="post">
						
						<br>
							<div class="form-group">
							
								<div class="alert alert-danger text-center text-blue mb-0" role="alert">
								  <b>Add Student Fee</b>
								</div>
							
									<label for="exampleInputEmail1"> Student Name </label>
									
										 <input type="text"
										name="name" class="form-control" id="exampleInputEmail1"
										aria-describedby="emailHelp"  />
										
									<label for="exampleInputEmail12"> Father's Name </label>
									
										 <input type="text"
										name="fatherName" class="form-control" id="exampleInputEmail12"
										aria-describedby="emailHelp"  />	
									
									<label for="exampleInputEmail13"> Enrollment Number(If Alloted) </label>
									
										 <input type="text"
										name="enrollNumber" class="form-control" id="exampleInputEmail13"
										aria-describedby="emailHelp" />	
									
									<label for="exampleInputEmail21">Fee for Semester</label> 
									<select class=" form-control border border-primary p-2 mb-1 mt-0 pt-0 mb-0 bg-white rounded" name="semester">
									    <option selected>Choose</option>					    
									    <option value="1">Semester 1</option>
									    <option value="2">Semester 2</option>
									    <option value="3">Semester 3</option>
									    <option value="4">Semester 4</option>
									    <option value="5">Semester 5</option>
									    <option value="6">Semester 6</option>
									    <option value="7">Semester 7</option>
									    <option value="8">Semester 8</option>
									    <option value="9">Semester 9</option>
									    <option value="10">Semester 10</option>
									</select>
									
									<div class="form-group mb-0">
										<label for="datepicker1">Date</label>
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input
											class=" form-control border border-primary bg-white rounded"
											type="date" name="date" id="datepicker1">
										<!-- pl-5 pr-5 mb-3 mt-0 -->
									</div>
									
									<label for="exampleInputEmail14"> Amount </label>
									
									<div class="input-group mb-1">
									  <div class="input-group-prepend">
									    <span class="input-group-text" id="basic-addon1">Rs</span>
									  </div>
									 <input type="text"
										name="amount" class="form-control" id="exampleInputEmail14"
										aria-describedby="basic-addon1" placeholder="Fee + Other Charges"  />
									</div>
									
									<label for="exampleInputEmail15">DD No. / Check No.(If any)</label>
									
										 <input type="number"
										name="ddNumber" class="form-control" id="exampleInputEmail15"
										aria-describedby="emailHelp" />
									
										
									<button type="submit" class="btn btn-primary btn-block mt-1" style="background-color:#1d1d1d;"
												id="submitbutton1">Save
									</button>	
									
							</div>
						
						
						</form>
						
						<!-- In the case of the Adding fee successful -->
						<c:if test="${feeStatus.equals('true')}">
							<script type="text/javascript">
								alert("Fee added successfully");
							</script>
						</c:if>
						<!-- In the case of the Adding fee unsuccessful -->
						<c:if test="${feeStatus.equals('false')}">
							<script type="text/javascript">
								alert("Fee is not added ");
							</script>
						</c:if>
					
					</div>
					
					
					<div class="col-lg-1"></div>
					
					<div class="col-lg-5">
					<br>
						<div class="border p-2">
					
						<div class="card">
						  <h5 class="card-header shadow border text-center" style="background-color:#B0E0E6;">Search Fee</h5>
						</div>
						
						<form action="./searchfee" method="post">
						<br>
						<label class="mt-1" for="exampleInputEmail21">Semester</label> 
									<select class=" form-control border border-primary p-2 mb-1 mt-0 pt-0 mb-0 bg-white rounded" name="semester">
									    <option selected>Choose</option>					    
									    <option value="1">Semester 1</option>
									    <option value="2">Semester 2</option>
									    <option value="3">Semester 3</option>
									    <option value="4">Semester 4</option>
									    <option value="5">Semester 5</option>
									    <option value="6">Semester 6</option>
									    <option value="7">Semester 7</option>
									    <option value="8">Semester 8</option>
									    <option value="9">Semester 9</option>
									    <option value="10">Semester 10</option>
									</select>
										
									<label for="exampleInputEmail19">Year</label>
									
										 <input type="text"
										name="year" class="form-control" id="exampleInputEmail19"
										aria-describedby="emailHelp"  />
									
									<button type="submit" class="btn btn-primary btn-block mt-2" style="background-color:#1d1d1d;"
												id="submitbutton">Search
									</button>
										
						</form>
						
						</div>
					</div>
					
					<div class="col-lg-1"></div>
					
			</div>
	 </div>
      
      
      
      
      
      
      
      
      <div class = "container-fluid">
		  <div class ="row">
			  <div class ="col-lg-12" id="footerindex">
			  		<div class="card text-center" >
						  <div class="card-header" >
						    Developed by Vishal Joshi, CCT, University Of Rajasthan
						  </div>
						  
						    <div class="footer-copyright text-center py-3" id= "cfooter">© 2018 Copyright:
						    <a target="_blank" href="http://www.uniraj.ac.in/cct/"> Uniraj.ac.in</a>
						    </div>
						  
						</div>
			  </div>
		  </div>
  
  </div>
  
  
  
		
 
    
  </body>
</html>