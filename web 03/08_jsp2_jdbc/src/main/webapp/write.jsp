<%@page import="com.dto.DeptDTO"%>
<%@page import="com.service.DeptServiceImpl"%>
<%@page import="com.service.DeptService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String deptno = request.getParameter("deptno");
	String dname = request.getParameter("dname");
	String loc = request.getParameter("loc");
	
	DeptService service = new DeptServiceImpl();
	DeptDTO dto = 
			new DeptDTO( Integer.parseInt(deptno), dname, loc);
	int num = service.write(dto);
	
	if(num==1){
%>    
    부서등록 성공<br>
    <a href='deptList.jsp'>목록</a>
<%
	}//end if
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>