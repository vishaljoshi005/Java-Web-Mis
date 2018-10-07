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
    <link rel="stylesheet" href="./style/viewsalumni.css"> 
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
			  <a class="flex-sm-fill text-sm-center nav-link text-white active" href="alumni.jsp">Alumni</a> 
			  <a class="flex-sm-fill text-sm-center nav-link text-white" href="student.jsp">Students</a>
			  <a class="flex-sm-fill text-sm-center nav-link text-white" href="addfaculty.jsp">Faculty</a>
			  <a class="flex-sm-fill text-sm-center nav-link text-white" href="ebill.jsp">Guest Faculty E-Bill</a>
			</nav>
			</div>
      
      </div>
      
      <div class= "container-fluid">
      
      <!-- Left side of the page -->
      	<div class= "row" id="row2">
      		<div class = "col-lg-1">
      		</div>
      
        <!-- Middle side of the page -->
      	
      		<div class = "col-lg-10">
      			<table class= "table table-striped table-bordered mt-1">
      				<thead>
      				<tr style="background-color: #F4A460;">
      					<th>Id</th>
      					<th>Name</th>
      					<th>Gender</th>
      					<th>Dob</th>
      					<th>Batch</th>
      					<th>Email</th>
      					<th>Contact</th>
      					<th>Branch</th>
      					<th>Occupation</th>
      					<th>Location</th>
      					<th>Delete</th>
      				</tr>
      				</thead>
      				<!-- If there is any records in the database -->
      				 <c:if test="${alumniRecordsFound.equals('true')}">
      				 	<c:forEach items="${alumniRecords}" var="alumni">
				            <tr>
				                <td>${alumni.getId()}</td>
				                <td>${alumni.getName()}</td>
				                <td>${alumni.getGender()}</td>
				                <td>${alumni.getDob()}</td>
				                <td>${alumni.getBatch()}</td>
				                <td>${alumni.getEmail()}</td>
				                <td>${alumni.getContact()}</td>
				                <td>${alumni.getBranch()}</td>
				                <td>${alumni.getOccupation()}</td>
				                <td>${alumni.getLocation()}</td>
				                <td><a href="./deletealumni?id=${alumni.getId()}">Delete</a></td>    
				            </tr>
				        </c:forEach>            			
        			</c:if>
        			
        			
        			<!-- If there is NO records in the database -->
      				 <c:if test="${alumniRecordsFound.equals('false')}">
      				 	
				            <tr>
				                <td>No Records Found</td>
    
				            </tr>
				       
            			
        			</c:if> 
        			  
      			</table>
      			
      	<div >
      	<c:if test="${alumniRecordsFound.equals('true')}">
        			
        			<nav aria-label="Navigation for Alumni" >
			    <ul class="pagination justify-content-center" style="background-color: #EEE;">
			        <c:if test="${currentPage != 1}">
			            <li class="page-item"><a class="page-link" 
			                href="viewalumni?page=${currentPage-1}">Previous</a>
			            </li>
			        </c:if>
			
			        <c:forEach begin="1" end="${numOfPages}" var="i">
			            <c:choose>
			                <c:when test="${currentPage eq i}">
			                    <li class="page-item active"><a class="page-link">
			                            ${i} <span class="sr-only">(current)</span></a>
			                    </li>
			                </c:when>
			                <c:otherwise>
			                    <li class="page-item"><a class="page-link" 
			                        href="viewalumni?page=${i}">${i}</a>
			                    </li>
			                </c:otherwise>
			            </c:choose>
			        </c:forEach>
			
			        <c:if test="${currentPage lt numOfPages}">
			            <li class="page-item"><a class="page-link" 
			                href="viewalumni?page=${currentPage+1}">Next</a>
			            </li>
			        </c:if>              
			    </ul>
			</nav>
        			
        			</c:if>
        	
        	</div>   
        					
      	
      			
      		
      		</div>
      		
      <!-- Right side of the page -->	
      		<div class = "col-lg-1"> 
	      						
      		</div>		
		
      	</div>
      </div>
      
      <!-- In the case of Alumni cannot be deleted  -->
			<c:if test="${deleteStatus.equals('true')}">
				<script type="text/javascript">
					alert("Alumni Record Cannot be Deleted");
				</script>
			</c:if>
			<% session.setAttribute("deleteAlumniStatus", null); %>
			
		<!-- In the case of Alumni record deleted  -->
			<c:if test="${deleteStatus.equals('false')}">
				<script type="text/javascript">
					alert("Alumni Record Deleted");
				</script>
			</c:if>
			<% session.setAttribute("deleteAlumniStatus", null); %>
      
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
  