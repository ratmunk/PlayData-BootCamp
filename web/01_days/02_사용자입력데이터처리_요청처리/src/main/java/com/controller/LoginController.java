package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   // 브라우저에 출력 안됨. 서버 console에 출력됨.
	  // http://localhost:8090/app2/LoginController?userid=aaa&passwd=1234
	   System.out.println("LoginController>>>>>>");
	   // get 방식은 기본적으로 한글이 처리된다.
	   
	   String userid = request.getParameter("userid");
	   String passwd = request.getParameter("passwd");
	   
	   System.out.println(userid +" " + passwd);
	   
	   
	}
}
