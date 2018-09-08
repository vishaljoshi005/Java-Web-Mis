Electronic Information Management System


111. Naming :
 	1. For java classes: According to convention
 	2. url patterns : small letters
 	3. method names :  camel case
 	
100.Variable:
	1. Variables names in the JSP pages are camel case.
	2. In Java classes : all in camel case

101.Database:
	For the LoginServlet
	
	1. Table 'users' should be created in mysql.
	2. The fields user-name and password for mysql should be updated accordingly in the sqlConnect.java file.
	3. Username and Password holding table should be created before deploying to the server. 
	
	For Alumni:
	1. No need to create any table. It will be created automatically.
	
	
102. URL patterns
	1.For new user url pattern = "./newuser"
	2 For alumni url pattern ="./alumniregister"
	3 For Login = "./login"
	
103. AlumniBean class:
	DATE: Is taken as string from the jsp and inside the bean class it is converted to the sql accepted format to insert in the sql.
	
104. Filter	
	1. Alumniregister servlet and AlumniFilter ServletFilter has url pattern: "/alumniregister"