<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color: blue;">
<div> 
 
<!-- 

//response.sendRedirect("login.jsp");
 -->
<div style="background-color: black;">

</div>
<h1 style="text-align: center; background-color: red">WELL COME</h1>
</div>
<h2 style="text-align: center;">BANK PROJECT</h2><br><br>

<a href="view/create.jsp">Create Account</a><br><br>
<a href="view/balance.jsp">Balance Ammount</a><br><br>

<a href="view/Deposit.jsp">Deposit Account</a><br><br>
<a href="view/withdraw.jsp">Withdraw Account</a>


<h2>Time Counter</h2>
<h2 id="timer">Seconds: 0</h2>

<script>
    let count = 0;
    const timerElement = document.getElementById("timer");

    const intervalId = setInterval(() => {
        count++;
        timerElement.textContent = "Seconds: " + count;

        if (count >= 10) {
            clearInterval(intervalId); // stop after 10 seconds
        }
    }, 1000); // 1000ms = 1 second
</script>

</body>
</html>