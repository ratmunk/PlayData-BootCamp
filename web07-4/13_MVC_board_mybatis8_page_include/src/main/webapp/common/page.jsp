<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.dto.PageDTO"%>
<%
PageDTO pageDTO = 
(PageDTO)request.getAttribute("pageDTO");
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