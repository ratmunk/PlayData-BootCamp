<%@page import="com.dto.DeptDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.service.DeptServiceImpl"%>
<%@page import="com.service.DeptService"%>
   
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>목록보기</h1>
<table border='1'>
<tr>
 <th>부서번호</th>
 <th>부서명</th>
 <th>부서위치</th>
</tr>
<%
   //서블릿 doGet 메서드내 코드 구현
   DeptService service = new DeptServiceImpl();
   List<DeptDTO> list = service.list();
%> 
<%
  for(DeptDTO dto : list) {
	  
	  String dname = dto.getDname();
	  String loc = dto.getLoc();
%>
  <tr>
    <td><%= dto.getDeptno() %></td>
    <td><%= dname %></td>
    <td><%= loc %></td>
  </tr>
<%
  }//end for
%>

</table>
<a href='writeForm.jsp'>글쓰기</a>
</body>
</html>



