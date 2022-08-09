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
<h1>목록보기</h1>
<table border="1">
  <tr>
    <th>글번호</th>
    <th>제목</th>
    <th>작성자</th>
    <th>작성일</th>
    <th>조회수</th>
  </tr>
<%
   List<BoardDTO> list = 
      (List<BoardDTO>)request.getAttribute("board_list");
   for(BoardDTO dto: list){
	   int num = dto.getNum();
	   String author = dto.getAuthor();
	   String writeday = dto.getWriteday();
	   int readcnt = dto.getReadcnt();		   
%>
  <tr>
    <td><%= num %></td>
    <td><%= dto.getTitle() %></td>
    <td><%= author %></td>
    <td><%= writeday %></td>
    <td><%= readcnt %></td>
  </tr>  
<%
   }//end for
%>  
</table>
<a href="writeUI">글쓰기</a>
</body>
</html>







