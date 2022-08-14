<%@page import="com.dto.BoardDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>글작성</h1>
<form action="write" method="get">
제목:<input type="text" name="title"><br>
작성자:<input type="text" name="author"><br>
내용:<textarea name="content" rows="10" cols="30"></textarea>
<input type="submit" value="저장">
</form>
</body>
</html>







