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
<%
    //searchName, searchValue 얻기
   String searchName = (String)request.getAttribute("searchName");
   String searchValue = (String)request.getAttribute("searchValue");

   // 1 2 3 4 페이지 링크 번호 출력하기
   int curPage = pageDTO.getCurPage();
   int perPage = pageDTO.getPerPage();
   int totalRecord = pageDTO.getTotalRecord();
   
   int totalPage = (totalRecord/perPage); // 10 / 3 = 3
   if(totalRecord%perPage !=0 ) totalPage++;  // 10 / 3 = 3 + 1
   
   for(int i=1; i<=totalPage; i++){
      if(i==curPage){
%>
   <%= i %>&nbsp;&nbsp;
<%
      }else{
   // list?curPage=2&searchName=title&searchValue=하 	  
%>
   <a href="list?curPage=<%= i %>&searchName=<%=searchName %>&searchValue=<%= searchValue%>"><%= i %></a>&nbsp;&nbsp;     	  
<%
      }//end if
   }//end for
%>    	  
<br>
<a href="writeUI">글쓰기</a>
</body>
</html>







