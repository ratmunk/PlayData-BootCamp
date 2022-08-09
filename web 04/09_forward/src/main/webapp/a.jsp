<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

   String data = 
     (String)request.getAttribute("requestScope");

	String data2 = 
	 (String)session.getAttribute("sessionScope");

	String data3 = 
	 (String)application.getAttribute("applicationScope");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>a.jsp</h1>
requestScope:<%= data %><br>
sessionScope:<%= data2 %><br>
applicationScope:<%= data3 %><br>
</body>
</html>