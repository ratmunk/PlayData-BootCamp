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
<h1>Main 화면</h1>
<%
   MemberDTO dto =
    (MemberDTO)session.getAttribute("login");
%>
안녕하세요.<%= dto.getUsername() %><br>
<a href="info">회원정보</a>
<a href="logout">로그아웃</a>
</body>
</html>