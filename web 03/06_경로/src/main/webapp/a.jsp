<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
   p{
     color:red;
   }
</style>
<script type="text/javascript">
   
     function fun(){
    	 alert("alert 창");
     }
</script>
<link rel="stylesheet" type="text/css" href="/app6/css/sample.css">
<script type="text/javascript" src="/app6/js/sample.js"></script>
</head>
<body>
<h1>a.jsp: 절대경로</h1>
장점: 접근하기가 쉽다.   /컨텍스트명/경로 형식 사용
단점: 컨텍스트명이 변경시 모든 코드 변경 필요
<p>Hello</p>
<span>world</span>
<button onclick="fun()">fun함수호출</button>
<button onclick="fun2()">fun2함수호출</button><br>
<a href="/app6/board/list.jsp">list.jsp로 가기</a>
<h2>서블릿요청</h2>
<form action="/app6/test">
 아이디:<input type="text" name="userid"><br>
 <input type="submit" value="전송">
 <img  src="/app6/images/daum.png" width="100" height="100">
</form>
</body>
</html>







