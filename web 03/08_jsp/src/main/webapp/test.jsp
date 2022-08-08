<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List" %>    
<%@ page import="java.util.Map" %> 
<%!
   List list = new ArrayList();
%>
<%
    String name = "홍길동";
    String userid = request.getParameter("userid");
    String daum = "http://www.daum.net";
    
    //내장변수
    response.setContentType("text/html; charset=UTF-8");
    session.setAttribute("userid", "홍길동");
    application.setAttribute("paswd", 1234);
    
    //브라우저에 출력
    out.print(daum);
%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   String [] args = {"A","B"};
   for(String x: args){
 %>
    <%= x %><br>
<% 
   }//end for
%>
<%= daum %><br>   
홍길동<br>
이름:<%=  name %><br>
userid:<%=  userid %><br>
javascript에서는 문자값이면 반드시 '', "" 지정한다. 숫자면 사용안함.
<a href="<%= daum %>">link</a><br>
<a href=<%= daum %>>link2</a><br>
</body>
</html>
<%!
   public void a2(){}
   public void a4(){}
%>