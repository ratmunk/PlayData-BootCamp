<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
기준:                          http://localhost:8090/app6/product/cart/shop.jsp
접근해야되는 daum.png image경로:  http://localhost:8090/app6/images/daum.png
접근해야되는 daum2.png image경로: http://localhost:8090/app6/product/daum2.png
.. 는 상위디렉토리를 의미하고
.은 현재 디렉토리를 의미한다.
<h1>shop.jsp: 상대경로</h1>
daum.png 절대경로:<img  src="/app6/images/daum.png" width="100" height="100"> 
daum.png 상대경로:<img  src="../../images/daum.png" width="100" height="100"> 
daum2.png 상대경로:<img  src="../daum2.png" width="100" height="100"> 
</body>
</html>




