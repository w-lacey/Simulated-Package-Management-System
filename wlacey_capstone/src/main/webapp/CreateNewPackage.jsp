<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create New Package</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
  <h1>Create new package</h1>
  <%@ include file="navBar.jsp" %>
  <h3 style="color:red;"><c:out value="${response}"/></h3><br>
  <form action ="CreatePackageServlet" method="post">
      <p>Does this package contain any hazardous materials?</p><br>
      <input type="radio" name="hazard" value="confirm">
      <label for="affirmHazard">Yes</label>
      <input type="radio" name="hazard" value="deny">
      <label for="denyHazard">No</label><br>
      <label for="hubs">Origin Hub:</label><br>
      <select name="originHub" id="originHub">
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
	  <label for="recipientName">Recipient name:</label><br>
      <input type="text" id="recipientName" name="recipientName"><br>
      <label for="destinationAddress">Destination Address:</label><br>
      <input type="text" id="destinationAddress" name="destinationAddress"><br>
      <label for="width">Package Width:</label><br> 
      <input type="number" step="0.01" id="width" name="width"><br>
      <label for="height">Package Height:</label><br>
      <input type="number" id="height" step="0.01" name="height"><br>
      <label for="length">Package Length:</label><br>
      <input type="number" step="0.01" id="length" name="length"><br>
      <label for="weight">Package Weight:</label><br>
      <input type="number" step="0.01" id="weight" name="weight"><br>
      <input type="submit" value="submit">
  </form>
</body>
</html>