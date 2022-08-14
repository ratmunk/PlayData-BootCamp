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
<h2>1. 조건문(단일 if문)</h2>
원본문자열:${username}<br>
<c:if test="${username == '홍길동' }">
    홍길동입니다.
</c:if>
<br>
<c:if test="${username != '홍길동2' }">
    홍길동 아닙니다.
</c:if>
<br>
<c:if test="${user.name == '이순신' }">
    이순신입니다.
</c:if>
<br>
<h2>2. 조건문(다중 if문)</h2>
<c:choose>
  <c:when test="${user.age > 80}">
     노년입니다.
  </c:when>
  <c:when test="${user.age > 60}">
     장년입니다.
  </c:when>
  <c:when test="${user.age > 40}">
     청년입니다.
  </c:when>
   <c:otherwise>
     ...
   </c:otherwise>
</c:choose>
</body>
</html>








