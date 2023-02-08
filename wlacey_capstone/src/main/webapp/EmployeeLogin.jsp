<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h1>Employee Login</h1>
    <%@ include file="navBar.jsp" %>
    <form>
        <input type="email" placeholder="Email"><br>
        <input type="password" placeholder="Password"><br>
        <input type="submit" value="Submit"><br>
        <p>New here?:<br><a href="CreateAccount.html">Create Account</a></p>
    </form>
</body>
</html>