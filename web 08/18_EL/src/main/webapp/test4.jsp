<%@page import="java.util.List"%>
<%@page import="com.dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>1. 이전방식</h1>
<%
  //1. 단일값
   String userid1 = (String)request.getAttribute("userid");
   String userid2 = (String)session.getAttribute("userid");
   String userid3 = (String)application.getAttribute("userid");
 
%>
userid(request):<%= userid1 %><br>
userid(session):<%= userid2 %><br>
userid(application):<%= userid3 %><br>


<h1>2. EL표기법</h1>
userid(request, 기본):${requestScope.userid}<br>
userid(session):${sessionScope.userid}<br>
userid(application):${applicationScope.userid}<br>


</body>
</html>

