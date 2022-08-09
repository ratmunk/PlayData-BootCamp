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
<h1>글자세히보기</h1>
<%
   BoardDTO dto = 
     (BoardDTO)request.getAttribute("retrieve");

   int num = dto.getNum();
   String title = dto.getTitle();
   String author = dto.getAuthor();
   String content = dto.getContent();
   String writeday = dto.getWriteday();
   int readcnt =dto.getReadcnt();
%>
글번호:<%= num %>&nbsp;작성일:<%= writeday %>&nbsp; 조회수:<%= readcnt %><br>
제목:<input type="text" name="title" value="<%= title %>"><br>
작성자:<input type="text" name="author" value="<%= author %>"><br>
내용:<textarea name="content" rows="10" cols="30"><%= content %></textarea>

<br>
<a href="list">목록보기</a>
</body>
</html>







