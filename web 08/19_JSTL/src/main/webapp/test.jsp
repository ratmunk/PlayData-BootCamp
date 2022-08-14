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
이름:${username}<br>
<h2>1. 변수 사용 </h2>
<c:set var="x" value="${username}" />
이름:${x}<br>
<h2>2. 값 출력 </h2>
이름1:${username}<br>
이름2:<c:out value="${username}" /><br>
<h2>3. fmt 통화량 </h2>
가격1:${price}<br>
가격2:<fmt:formatNumber value="${price}" type="currency" /><br>

<h2>4. function 실습 </h2>
문자열값:${str}<br>
문자열길이:${fn:length(str)}<br>
문자열 대문자:${fn:toUpperCase(str)}<br>
문자열 소문자:${fn:toLowerCase(str)}<br>
<h2>4. function 실습2 </h2>
문자열값:${str2}<br>
부분열:${fn:substring(str2,0,6)}<br>

문자열값:${str3}<br>
공백제거:${fn:trim(str3)}<br>
<%
   String str4 = (String)request.getAttribute("str4");
  String [] str_arr = str4.split("/");
  System.out.println(Arrays.toString(str_arr));
%>


split:${fn:split(str4, "/")[0]}<br>
split:${fn:split(str4, "/")[1]}<br>
split:${fn:split(str4, "/")[2]}<br>


문자열값:${str5}<br>
replace:${fn:replace(str5, "o","*")}<br>

문자열포함여부:${fn:contains(str5, "Hello")}<br>
문자열포함여부:${fn:contains(str5, "Hello2")}<br>


<c:set var="s1" value='${fn:split(str4, "/")}' />
${fn:join(s1, ";")}<br>


</body>

</html>








