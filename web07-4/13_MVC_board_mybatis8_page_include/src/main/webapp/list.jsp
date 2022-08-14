<%@page import="com.dto.PageDTO"%>
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
  <!-- html 주석 -->
  <!-- 검색기능 추가 -->
  <tr>
    <td colspan="5">
      <form action="list">
       <select name="searchName">
        <option value="title">제목</option>
        <option value="author">작성자</option>
       </select>
       <input type="text" name="searchValue">
       <input type="submit" value="검색">
      </form>
    </td>
  </tr>
  <!-- 검색기능 추가 -->
  <tr>
    <th>글번호</th>
    <th>제목</th>
    <th>작성자</th>
    <th>작성일</th>
    <th>조회수</th>
  </tr>
<%
   PageDTO pageDTO = 
      (PageDTO)request.getAttribute("pageDTO");

   List<BoardDTO> list = pageDTO.getList();

   for(BoardDTO dto: list){
	   int num = dto.getNum();
	   String author = dto.getAuthor();
	   String writeday = dto.getWriteday();
	   int readcnt = dto.getReadcnt();		   
%>
  <tr>
    <td><%= num %></td>
    <td><a href="retrieve?num=<%= num %>"><%= dto.getTitle() %></a></td>
    <td><%= author %></td>
    <td><%= writeday %></td>
    <td><%= readcnt %></td>
  </tr>  
<%
   }//end for
%>  
</table>
<!-- page 처리 코드 시작 -->
<jsp:include page="common/page.jsp" flush="true" />
<!-- page 처리 코드 끝 -->    	  
<br>
<a href="writeUI">글쓰기</a>
</body>
</html>







