<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Account</title>
</head>
<body>
<h1 style="text-align: center;">Create Account</h1>
<div >
       <form action="../CreateAccountServlet" method="post"><br/>
       <label>Name:</label>
        <input type="text" name="name"><br/>
        <label>AccountID:</label>
        <input type="text" name="accountID"><br/>
        <label> Balance:</label>
       <input type="text" name="balance"><br/>
        <input type="submit" value="Create">
       </form>

</div>

<a href="../index.jsp">go to home</a>
<footer>
   <a href="<%= request.getContextPath() %>/index.jsp">Home</a>
</footer>


</body>
</html>