package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.util.Arrays;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController2")
public class LoginController2 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   // 브라우저에 출력 안됨. 서버 console에 출력됨.	
	   System.out.println("LoginController2>>>>>>");
	   // post 방식은 기본적으로 한글이 처리 안된다. 따라서 한글이 처리되도록 코드구현필요하다.
	   request.setCharacterEncoding("utf-8");
	   String userid = request.getParameter("userid");
	   String passwd = request.getParameter("passwd");
	   
	   String [] hobbies = request.getParameterValues("hobby");
	   System.out.println(userid +" " + passwd + " " + Arrays.toString(hobbies));
	}
}
