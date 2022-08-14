<%@page import="java.util.List"%>
<%@page import="com.dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>1. 이전방식</h1>
<%
  //1. 단일값
   String userid2 = (String)application.getAttribute("userid");
   String userid3 = (String)application.getAttribute("userid3");
   
  //2. DTO
   User user = (User)application.getAttribute("user");
   String name = user.getName();
   
   //3. List
   List<User> list = (List<User>)application.getAttribute("user_list");
%>
userid:<%= userid2 %><br>
userid3:<%= userid3 %><br>
null판단:<%= userid3 == null %><br>

User 클래스 출력<br>
이름:<%= name %><br>
나이:<%= user.getAge() %><br>

List 출력<br>
<%
   for(User x: list){
%>
    <%= x.getName() %>
<%
   }//end for
%>

<h1>2. EL표기법</h1>
userid:${userid}<br>
userid3:${userid3}<br>
null판단:${empty userid3}
User 클래스 출력<br>
이름:${user.name}<br> 
나이:${user.age}<br>

List 출력<br>
${user_list}<br>
${user_list[0]}<br>
${user_list[0].name}<br>
${user_list[0].age}<br>


</body>
</html>

