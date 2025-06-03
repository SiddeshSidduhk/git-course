<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
<h1 style="text-align: center;">Well come to bank log in</h1>


<%!

int a=10;

public int print(){
	
	a++;
	return a;
}



%>
<p  > inc : <%=a %>   </p>
<button  <%=print() %>>button</button>
<br>
<form action="Login" method="post">



<label>UserName</label>
<input type="text" name="name"><br>
<label>password</label>
<input type="password" name="psw"><br>
<input type="submit"  value="Login">

</form>
</body>
</html>