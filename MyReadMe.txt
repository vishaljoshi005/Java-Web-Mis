Project problems
1.	If problem occurs due to server just clean the project and run again	
2. Adding external jar can be a problem First go to build path then add then again go to build path then select the
assemble option then add that jar again then it will run properly.

Alumni.jsp
method ./addalumni
alumni css has char encoding put in other files if needed

home.jsp
	This Jsp contains jstl for the user successfully added alert and also a scriptlet tag for the removal of attribute from the session object.
	Above is for only the one alert
	after this the alerts is done via the request attribute and request.getDispatcher() method.

Links :
		1. Viewsalumni.jsp all href are in format of "viewalumni?id=value" and not in "./viewalumni?id=value" 
		
Works: 1. Add encryption to the password
	   2. Session tracking
	   3. Try with resources JDBC
	   4. All the DAO must be updated to handle the no data from mysql also.
	   5. Check the contact input alumni ands student
	   6. Add the filter to the login servlet
	   7. Uppercase and trim in the inputs of data alumni student
	   
Points: 1. Session for security
		2. cookies
		3. data flow
		4. encrypted password
		5. Resource management jdbc
		6. performance pagination
		7. Kept http protocol stateless
		8. even if error comes from jdbc server wont crash
		9. MVC
		10. No logics in jsp
		11.Google api login	
		12. Student will be able to view alumni
		13. For the fees name and dob cz no enrollment number available
		
		
		