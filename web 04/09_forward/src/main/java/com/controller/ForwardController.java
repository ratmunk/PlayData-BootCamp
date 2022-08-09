package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ForwardController")
public class ForwardController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ForwardController");
		
		//비즈니스 로직처리
		
		//데이터 전달 ==> scope 이용
		//1.request scope
		request.setAttribute("requestScope", "request");
		
		//2.session scope => 동일한 웹브라우저와 lifecycle이 같다.
		HttpSession session = request.getSession();
		session.setAttribute("sessionScope", "session");
		
		//3.application scope ==> Web Application과 lifecycle이 같다. 
		ServletContext application = getServletContext();
		application.setAttribute("applicationScope", "application");
		
		
		//foward로 위임
		RequestDispatcher dispatch = 
				request.getRequestDispatcher("a.jsp");
		dispatch.forward(request, response);		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
