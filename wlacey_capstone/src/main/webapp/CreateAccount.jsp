<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create Employee Account</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h1>Create Account</h1>
    <%@ include file="navBar.jsp" %>
    <h3 style="color:red;"><c:out value="${response}"/></h3><br>
    <form action="CreateAccountServlet" method="post">
	    <label for="firstName">First Name:</label><br>
	    <input type="text" id="firstName" name="firstName"><br>
	    <label for="lastName" >Last Name:</label><br>
	    <input type="text" id="lastName" name="lastName"><br>
	    <label for="email">Email:</label><br>
	    <input type="email" id="email" name="email"><br>
	    <label for="password">Password:</label><br>
	    <input type="password" id="password" name="password"><br>
	    <label for="hubList">Hub:</label><br>
	    <select id="hubList" name="hubList">
	        <option value="los angeles">Los Angeles</option>
  			<option value="chicago">Chicago</option>
  			<option value="new york">New York</option>
  			<option value="miami">Miami</option>
	  		<option value="vancouver">Vancouver</option>
	  		<option value="toronto">Toronto</option>
	  		<option value="london">London</option>
	  		<option value="paris">Paris</option>
	  		<option value="beijing">Beijing</option>
	  		<option value="sydney">Sydney</option>
	  		<option value="Moscow">Moscow</option>
	  		<option value="Singapore">Singapore</option>
	    </select><br><br>
	    <input type="submit" value="submit">
    </form>
    
</body>
</html>