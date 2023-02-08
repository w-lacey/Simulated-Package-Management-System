<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Package Tracking</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h1>Tracking</h1>
    <jsp:include page="navBar.jsp" />
    <h3 style="color:red;"><c:out value="${error}"/></h3><br>
    <form action="PackageTrackerServlet" method="post">
        <input type="number" placeholder="Tracking Number" id="trackingID" name="trackingID"><br>
        <input type="submit" value="track">
    </form>
    <c:if test="${not empty returnedPackage}">
	    <table>
	    	<tr>
	    		<th>Tracking Number</th>
	    		<th>Origin Hub</th>
	    		<th>Destination Address</th>
	    		<th>Recipient Name</th>
	    		<th>Height</th>
	    		<th>Width</th>
	    		<th>Length</th>
	    		<th>Weight</th>
	    	</tr>
	    	<tr>
	    		<td>${returnedPackage.packageID}</td>
	    		<td>${returnedPackage.originHub}</td>
	    		<td>${returnedPackage.destinationAddress}</td>
	    		<td>${returnedPackage.recipientName}</td>
	    		<td>${returnedPackage.height}</td>
	    		<td>${returnedPackage.width}</td>
	    		<td>${returnedPackage.length}</td>
	    		<td>${returnedPackage.weight}</td> 		
	    	</tr>
	    </table>
    </c:if>
</body>
</html>