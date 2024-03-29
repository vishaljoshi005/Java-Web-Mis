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
    <title>Login</title>
    <link rel="stylesheet" href="./style/index.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
  </head>
  <body>
  
  
	  <div class="jumbotron text-center" id="jumbo">
	   <div class="container-fluid">
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
  
  <div class="container-fluid">
  			<div class ="row">   				
		   		<div class ="col-lg-6 " >
		   		 <div class ="rows " id= "This is rows should be changed when doing something"> 
		   		      <div class ="col-lg-12">
		 			
		   		 <img class="img-fluid" id="college" src="./images/college.jpg" alt="UOR" width="650" height="400" >
		   			  
		   			</div>  
		   			  
		   			  <div class ="col-lg-12"  >
		   			   <a  target="_blank" href="http://www.uniraj.ac.in/cct/" class="btn btn-warning btn-lg btn-block " id="buttonleft" >College Main website</a>
		   			 
		   			  </div>
		   		 </div>
		   		</div>
		   		
		   		 
		   		
		   		<div class="col-lg-5 ">
		   				<form action="./login" method="post">
		   					<div id= "form-pad">
								  <div class="form-group">
								    <label   id="username1">User Name</label>
								    <input type="text" class="form-control"  id="username1" aria-describedby="emailHelp" name="userName" placeholder="Enter username">
								  
								  </div>
								  <div class="form-group">
								    <label  for="exampleInputPassword1">Password</label>
								    <input type="password" class="form-control" id="exampleInputPassword1" name= "passWord"placeholder="Password">
								  </div>
								  <button  type="submit" value="login" class="btn btn-primary btn-block float-right" id ="submitbutton">Submit</button>
							  </div>
							  <br>
							  <div class= "clearfix"></div>
							  	<div  id ="warn" class="alert alert-warning" role="alert">
  								    For Department use only
								</div>
								
								
			   			  	    <div class="cardmargin">							
								<div class="card text-center text-white bg-dark mb-3"  id="responsivecard" >
								  <h5 class="card-header" >Contact us</h5>
								  <div class="card-body">
								    <p class="card-text"> 
											Centre for Converging Technologies, 
											University of Rajasthan 
											 J. L. N. Marg, Jaipur-302004 <br>
											<b>Phone </b>:0141-2700370 <br>
											</p>
								  </div>
								</div>
								
			   			  		</div>
		   			          
		   			  			
						</form>
						<!-- In the case of the username is empty  -->
						<c:if test="${usernameEmpty.equals('true')}">
						<script type="text/javascript">
						alert("Username field cannot be empty");
						</script>
						</c:if>
							<!-- In the case of the password is empty  -->
						<c:if test="${passwordEmpty.equals('true')}">
						<script type="text/javascript">
						alert("Password field cannot be empty");
						</script>
						</c:if>
						
		   				
		   		</div>
	  			
	   		</div>
	   		
  </div>
  
  <div class = "container-fluid">
		  <div class ="row">
			  <div class ="col-lg-12" id="footerindex">
			  		<div class="card text-center" >
						  <div class="card-header" >
Developed by Vishal Joshi, CCT, University Of Rajasthan
						  </div>
						  
						    <div class="footer-copyright text-center py-3" id= "cfooter">� 2018 Copyright:
						    <a target="_blank" href="http://www.uniraj.ac.in/cct/"> Uniraj.ac.in</a>
						    </div>
						  
						</div>
			  </div>
		  </div>
  
  </div>
  
  
  
		
 
    
  </body>
</html>