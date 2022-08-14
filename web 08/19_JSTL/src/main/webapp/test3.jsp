<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSTL 실습</h1>
<h2>1. 반복문</h2>
<c:forEach begin="1" end="5">
  Hello<br>
</c:forEach>
<br>
<c:forEach var="x"  begin="1" end="5">
  ${x}:Hello<br>
</c:forEach>
<br>
<h2>2. List 반복문</h2>
<c:forEach var="user"  items="${user_list}">
    ${user}, ${user.name}, ${user.age}<br>
</c:forEach>
<br>
<h2>3. List 반복문 + 반복 index</h2>
<c:forEach var="user"  items="${user_list}" varStatus="status">
   ${status.index}:${status.count}:${status.first}:${status.last}:${user.name}<br>
</c:forEach>
<br>
<h2>4.  제어문 중첩</h2>
<c:forEach var="user"  items="${user_list}" varStatus="status">
    <c:if test="${status.index % 2 == 0}">
         ${status.index}:${user}<br>
    </c:if>
</c:forEach>
<br>
</body>
</html>








