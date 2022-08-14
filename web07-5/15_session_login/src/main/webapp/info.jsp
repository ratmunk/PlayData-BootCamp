<%@page import="com.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원정보 화면</h1>
<%
   MemberDTO dto =
    (MemberDTO)session.getAttribute("login");
%>
아이디:<%= dto.getUserid() %><br>
이름:<%= dto.getUsername() %><br>
<a href="logout">로그아웃</a>

</body>
</html>