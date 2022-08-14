package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestController
 */
@WebServlet("/TestController")
public class TestController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 변수설정 및 값 출력
		request.setAttribute("username", "홍길동");
		
		// fmt 실습
		request.setAttribute("price", 987654321);
		
		// function 실습
		request.setAttribute("str", "HeLlo");
		
		request.setAttribute("str2", "981212-1234567");
		
		
		request.setAttribute("str3", "      이순신     ");
		
		request.setAttribute("str4", "AAA/BBB/CCC");
		
		request.setAttribute("str5", "HelloWorld");
		
		
		
		
		// jsp 위임
		request.getRequestDispatcher("test.jsp").forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
