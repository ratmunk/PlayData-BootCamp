<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>로그인 화면1-GET</h2>
<form action="LoginController" method="get">
  아이디:<input type="text"  name="userid" value=""><br>
  비밀번호:<input type="text"  name="passwd" ><br><br>
  <input type="submit" value="로그인">
</form>

<h2>로그인 화면2-POST</h2>
<form action="LoginController2" method="post">
  아이디:<input type="text"  name="userid" value=""><br>
  비밀번호:<input type="text"  name="passwd" ><br><br>
  취미:<br>
   야구<input type="checkbox"  name="hobby" value="야구"><br>
   축구<input type="checkbox"  name="hobby" value="축구"><br>
   농구<input type="checkbox"  name="hobby" value="농구"><br>
  <input type="submit" value="로그인">
</form>
</body>
</html>