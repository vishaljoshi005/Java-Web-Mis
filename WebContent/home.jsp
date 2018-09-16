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
    <title>Home</title>
    <link rel="stylesheet" href="./style/home.css"> 
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
			  <a class="flex-sm-fill text-sm-center nav-link text-white active" href="home.jsp">Home</a> 
			  <a class="flex-sm-fill text-sm-center nav-link text-white" href="alumni.jsp">Alumni</a> 
			  <a class="flex-sm-fill text-sm-center nav-link text-white" href="student.jsp">Students</a>
			  <a class="flex-sm-fill text-sm-center nav-link text-white" href="#">Faculty</a>
			  <a class="flex-sm-fill text-sm-center nav-link text-white" href="ebill.jsp">Guest Faculty E-Bill</a>
			</nav>
			</div>
      
      </div>
      
      <div class= "container-fluid">
      
      <!-- Left side of the page -->
      	<div class= "row" id="row2">
      		<div class = "col-lg-6">
      		</div>
      		
      <!-- Right side of the page -->	
      		<div class = "col-lg-6"> 
	      			 <form action="./newuser" method="post">
	      			 
	      			 <div class="form-group">
					<div class="alert alert-success text-dark text-center mt-1" role="alert">
 						 <b>Add New User</b>
					</div>			
				</div>

					  <div class="form-group " >
					  <label for="exampleInputEmail1"> Enter Username</label>
					    <input type="text" name="userName" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter new username"/>
					  </div>
					  <div class="form-group ">
					    <label for="exampleInputPassword1">Password</label>
					    <input type="password" name="passWord" class="form-control" id="exampleInputPassword1" placeholder="Password"/>
					  </div>
					  <div class="form-group ">
					    <label for="exampleInputPassword1">Password</label> <%--Below variable name caution--%>
					    <input type="password" name="rePassWord" class="form-control" id="exampleInputPassword2" placeholder="Password"/>
					  </div>
					  
					  <button type="submit" class="btn btn-primary btn-block" id="submitbutton"> Submit </button>
					  				 
					 </form>			
      		</div>
      		
 		<!-- This is the pop up alert when user is successfully added -->
		<c:if test="${userStatus.equals('true')}">
		  <script type="text/javascript">			
			alert("User added successfully");
		</script>   
		</c:if> 
		
		<!-- In the case of the username field is empty -->
		<c:if test="${usernameEmpty.equals('true')}">
		  <script type="text/javascript">			
			alert("Username cannot be empty");
		</script>
		</c:if> 
		
		<!-- In the case of the password field is empty -->
		<c:if test="${passwordEmpty.equals('true')}">
		  <script type="text/javascript">			
			alert("Password cannot be empty");
		</script>
		</c:if> 
		
		<!-- In the case of the Re-password field do not match -->
		<c:if test="${rePassword.equals('true')}">
		  <script type="text/javascript">			
			alert("Re-Password cannot be empty");
		</script>
		</c:if> 
		
		<!-- In the case of the password field do not match -->
		<c:if test="${unequalPassword.equals('true')}">
		  <script type="text/javascript">			
			alert("Password and Re-Password does not match");
		</script>
		</c:if> 
		
		<!-- In the case of the username already exist-->
		<c:if test="${usernameExist.equals('true')}">
		  <script type="text/javascript">
			alert("Username Already Exist");
		</script>
		</c:if> 
		
		
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
  