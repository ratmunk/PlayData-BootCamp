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
<link rel="stylesheet" type="text/css" href="css/sample.css">
<script type="text/javascript" src="js/sample.js"></script>
</head>
<body>
기준:              http://localhost:8090/app6/b.jsp
접근해야되는 Css경로: http://localhost:8090/app6/css/sample.css  
접근해야되는 js경로:  http://localhost:8090/app6/js/sample.js 
접근해야되는 jsp경로: http://localhost:8090/app6/board/list.jsp
접근해야되는 서블릿경로: http://localhost:8090/app6/test
접근해야되는 image경로: http://localhost:8090/app6/images/daum.png
<h1>b.jsp: 상대경로</h1>
장점: 컨텍스트명을 지정하지 않기 때문에 컨텍스트명 변경이 쉽다.
단점: 접근하기가 까다롭다.  현재 경로를 알아야 된다.
.. 는 상위디렉토리를 의미하고
.은 현재 디렉토리를 의미한다.(일반적으로 생략가능. 필수 경우도 있음)
<p>Hello</p>
<span>world</span>
<button onclick="fun()">fun함수호출</button>
<button onclick="fun2()">fun2함수호출</button><br>
<a href="board/list.jsp">list.jsp로 가기</a>
<h2>서블릿요청</h2>
<form action="test">
 아이디:<input type="text" name="userid"><br>
 <input type="submit" value="전송">
 <img  src="images/daum.png" width="100" height="100">
</form>
</body>
</html>







