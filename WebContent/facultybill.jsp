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
    <link rel="stylesheet" href="./style/facultybill.css"> 
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
			  <a class="flex-sm-fill text-sm-center nav-link text-white " href="addfaculty.jsp">Faculty</a>
			  <a class="flex-sm-fill text-sm-center nav-link text-white active" href="ebill.jsp">Guest Faculty E-Bill</a>
			</nav>
			</div>
      
      </div>
      
      
      	<div class="container-fluid">
      	
      	<!-- In the case of the Faculty records is not found  -->
			<c:if test="${facultyRecordsFound.equals('false')}">
				<script type="text/javascript">
					alert("Please Add the Faculty First");
				</script>
			</c:if>
			
			<!-- In the case of the Faculty is added    *** Hold for now  -->
			<c:if test="${facultyStatus.equals('true')}">
				<script type="text/javascript">
					alert("Faculty added successfully");
				</script>
			</c:if>
			
			<!-- In the case of the Bill records is not Added-->
			<c:if test="${billAddedStatus.equals('false')}">
				<script type="text/javascript">
					alert("Bill Record not saved");
				</script>
			</c:if>
			
			<!-- In the case of the Bill records is Added-->
			<c:if test="${billAddedStatus.equals('true')}">
				<script type="text/javascript">
					alert("Bill Record Added successfully");
				</script>
			</c:if>
			
			<!-- In the case of the Year is empty-->
			<c:if test="${yearEmpty.equals('true')}">
				<script type="text/javascript">
					alert("Please input the Year in Standard form.");
				</script>
			</c:if>
			
			<!-- In the case of the date is empty-->
			<c:if test="${dateEmpty.equals('true')}">
				<script type="text/javascript">
					alert("Please select the date.");
				</script>
			</c:if>
			
			<!-- In the case of the faculty is empty-->
			<c:if test="${facultyCodeEmpty.equals('true')}">
				<script type="text/javascript">
					alert("Please select the faculty.");
				</script>
			</c:if>
			
			<!-- In the case of the Sheet is empty-->
			<c:if test="${sheetNumberEmpty.equals('true')}">
				<script type="text/javascript">
					alert("Please Input the SheetNumber");
				</script>
			</c:if>
			
			<!-- In the case of the Sheet is empty-->
			<c:if test="${semesterEmpty.equals('true')}">
				<script type="text/javascript">
					alert("Please Select the Semester");
				</script>
			</c:if>
			
			<!-- In the case of the Sheet is empty-->
			<c:if test="${paperNumberEmpty.equals('true')}">
				<script type="text/javascript">
					alert("Please Input the SheetNumber");
				</script>
			</c:if>
			
			<!-- In the case of the Sheet is empty-->
			<c:if test="${typeEmpty.equals('true')}">
				<script type="text/javascript">
					alert("Please Input the SheetNumber");
				</script>
			</c:if>
			
			<!-- In the case of the Sheet is empty-->
			<c:if test="${batchEmpty.equals('true')}">
				<script type="text/javascript">
					alert("Please Input the SheetNumber");
				</script>
			</c:if>
			
			<!-- In the case of the Sheet is empty-->
			<c:if test="${timeEmpty.equals('true')}">
				<script type="text/javascript">
					alert("Please Input the SheetNumber");
				</script>
			</c:if>
			
			<!-- In the case of the Sheet is empty-->
			<c:if test="${hoursEmpty.equals('true')}">
				<script type="text/javascript">
					alert("Please Input the SheetNumber");
				</script>
			</c:if>
			<!-- In the case of the Sheet is empty-->
			<c:if test="${rateEmpty.equals('true')}">
				<script type="text/javascript">
					alert("Please Input the SheetNumber");
				</script>
			</c:if>
		<div class="row" id="row2">
			<div class="col-lg-6">
			<form action="./savebill" method="post"> 
			
			<div class="form-group">
						<div
							class=" alert alert-primary text-center mt-1 pt-0 pb-0"
							role="alert">
							<p style="font-size:20px;">Add New Bill</p>
						</div>
			</div>
			
			
			<div class="form-group mb-0 ">
						<label class="mb-0" for="industry1">Select Faculty</label>
			</div>
			<div class="form-group">
						<select
							class=" form-control border border-primary p-2 mb-3 mt-0 mb-0 bg-white rounded"
							name="facultyCode">
							<option selected>Select Faculty</option>
														
						<!-- If there is any records in the database -->
      				    <c:if test="${facultyRecordsFound.equals('true')}">
      				 	<c:forEach items="${facultyRecords}" var="faculty">
				        <option value= "${faculty.getId()}"> ${faculty.getFacultyName()}</option>                
				        </c:forEach>            			
        			    </c:if>	
        			    
        			    </select>
			</div>
			
			<div class="form-group mb-0">
						<label for="datepicker1">Date</label>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input
							class=" form-control border border-primary bg-white rounded"
							type="date" name="date" id="datepicker1">
						<!-- pl-5 pr-5 mb-3 mt-0 -->
					</div>
			
			<div class="form-group mb-0">
						<label for="exampleInputEmail21">Sheet Number</label> <input type="number"
							name="sheetNumber" class="form-control" id="exampleInputEmail21"
							aria-describedby="emailHelp"  />
			</div>
			
			
			<div class="form-group  mb-0 ">
						<label for="exampleInputEmail21">Semester</label> 
			</div>			
			<div class="form-group ">
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
			</div>
			
			
			<div class="form-group mb-0">
						<label for="exampleInputEmail22">Paper No.</label> <input type="number"
							name="paperNumber" class="form-control" id="exampleInputEmail22"
							aria-describedby="emailHelp"  />
			</div>
			
			
			<div class="form-group mb-0 ">
						<label for="exampleInputEmail23">Type</label> 
			</div>			
			<div class="form-group ">
					<select  class=" form-control border border-primary pt-0 p-2 mb-1 mt-0 mb-0 bg-white rounded" name="type">
					    <option selected>Choose</option>					    
					    <option value="Theory">Theory</option>
					    <option value="Practical">Practical</option>
					</select>
			</div>
			
			
			<div class="form-group  mb-0 ">
						<label for="exampleInputEmail24">Batch</label> 
			</div>			
			<div class="form-group ">
					<select  class=" form-control border border-primary p-2 mb-1 mt-0 pt-0 mb-0 bg-white rounded" name="batch">
					    <option selected>Choose</option>					    
					    <option value="A">A</option>
					    <option value="B">B</option>
					    <option value="C">C</option>
					    <option value="D">D</option>					    
					    <option value="NANO">NANO</option>
					    <option value="BIO">BIO</option>
					    <option value="ICT">ICT</option>
					    <option value="COGNO">COGNO</option>
					     <option value="CLASS">CLASS</option>
					    <option value="OTHERS">OTHERS</option>
					</select>
			</div>
			
			
			<div class="form-group  mb-0 ">
						<label for="exampleInputEmail24">Time</label> 
			</div>			
			<div class="form-group ">
					<select  class=" form-control border border-primary p-2 mb-1 mt-0 pt-0 mb-0 bg-white rounded" name="time">
					    <option selected>Select Time</option>					    
					    <option value="07:00">07:00AM</option>
					    <option value="08:00">08:00AM</option>
					    <option value="09:00">09:00AM</option>
					    <option value="10:00">10:00AM</option>
					    <option value="11:00">11:00AM</option>
					    <option value="12:00">12:00PM</option>
					    <option value="01:00">01:00PM</option>
					    <option value="02:00">02:00PM</option>
					    <option value="03:00">03:00PM</option>
					    <option value="04:00">04:00PM</option>
					    <option value="05:00">05:00PM</option>
					    <option value="06:00">06:00PM</option>
					    <option value="07:00">07:00PM</option>
					</select>
			</div>
			
			<div class="form-group mb-0 ">
						<label for="exampleInputEmail25">Hours</label> <input type="text"
							name="hours" class="form-control" id="exampleInputEmail25"
							aria-describedby="emailHelp"  />
			</div>
			
			<div class="form-group mb-0">
						<label for="exampleInputEmail25">Net Payable Amount</label> 
						<div class="input-group mb-3">
						<div class="input-group-prepend">
						    <span class="input-group-text">Rs</span>
						</div>
						<input type="number" name="rate" class="form-control" placeholder="Total payable amount for this Theory/Practical Class." >
						 </div>
			</div>
			
			
			<button type="submit" class="btn btn-primary btn-block" style="background-color:#1d1d1d;"
						id="submitbutton">Save
			</button>
					
			</form>
			</div>
			
			
			<div class="col-lg-6">
				<form action="./generatebill" method="post"> <!-- Change is needed -->
				
				<div class="form-group">
						<div
							class=" alert alert-primary text-center mt-1 pt-0 pb-0"
							role="alert">
							<p style="font-size:20px;">Generate Bill</p>
						</div>
			   </div>
			
			
				<div class="form-group mb-0 ">
						<label class="mb-0" for="industry10">Select Faculty</label>
				</div>
			<div class="form-group">
						<select
							class=" form-control border border-primary p-2 mb-3 mt-0 mb-0 bg-white rounded"
							name="facultyCode">
							<option selected>Select Faculty</option>
														
						<!-- If there is any records in the database -->
      				    <c:if test="${facultyRecordsFound.equals('true')}">
      				 	<c:forEach items="${facultyRecords}" var="faculty">
				        <option value= "${faculty.getId()}"> ${faculty.getFacultyName()}</option>                
				        </c:forEach>            			
        			    </c:if>	
        			    
        			    </select>
			</div>
				
				
			<div class="form-group  mb-0 ">
						<label for="exampleInputEmail24">Month</label> 
			</div>			
			<div class="form-group ">
					<select  class=" form-control border border-primary p-2 mb-1 mt-0 pt-0 mb-0 bg-white rounded" name="month">
					    <option selected>Select Month</option>					    
					    <option value="01">January</option>
					    <option value="02">February</option>
					    <option value="03"> March</option>
					    <option value="04"> April</option>
					    <option value="05">May</option>
					    <option value="06">June</option>
					    <option value="07">July</option>
					    <option value="08">August</option>
					    <option value="09">September</option>
					    <option value="10">October</option>
					    <option value="11">November</option>
					    <option value="12">December</option>
					</select>
			</div>	
			
			<div class="form-group mb-0">
						
					    <label for="exampleInputEmail61">Year</label>
					    <input type="number" name="year" class="form-control" id="exampleInputEmail61" aria-describedby="yearHelp" placeholder="20**">
					    <small id="yearHelp" class="form-text text-muted">Please follow the standard input like "2018" only.</small>
					  
			</div>
				
			<button type="submit" class="btn btn-primary btn-block mt-2" style="background-color:#1d1d1d;"
						id="submitbutton">Generate
			</button>	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				</form>
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
  